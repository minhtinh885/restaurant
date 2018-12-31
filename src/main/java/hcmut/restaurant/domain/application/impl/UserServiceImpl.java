package hcmut.restaurant.domain.application.impl;

import hcmut.restaurant.domain.application.UserService;
import hcmut.restaurant.domain.application.commands.RegistrationCommand;
import hcmut.restaurant.domain.common.event.DomainEventPublisher;
import hcmut.restaurant.domain.common.mail.MailManager;
import hcmut.restaurant.domain.common.mail.MessageVariable;
import hcmut.restaurant.domain.model.user.*;
import hcmut.restaurant.domain.model.user.events.UserRegisteredEvent;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private RegistrationManagement registrationManagement;
    private MailManager mailManager;
    private DomainEventPublisher domainEventPublisher;
    private UserRepository userRepository;

    public UserServiceImpl(RegistrationManagement registrationManagement, MailManager mailManager, DomainEventPublisher domainEventPublisher, UserRepository userRepository) {
        this.registrationManagement = registrationManagement;
        this.mailManager = mailManager;
        this.domainEventPublisher = domainEventPublisher;
        this.userRepository = userRepository;
    }

    @Override
    public void register(RegistrationCommand command) throws RegistrationException {
        User newUser = registrationManagement.register(
                command.getUsername(), command.getEmail(), command.getPassword(),
                command.getFullName(), command.getGender());
        sendWelcomeMessage(newUser);
        domainEventPublisher.publish(new UserRegisteredEvent(newUser));
    }

    private void sendWelcomeMessage(User user) {
        mailManager.send(
                user.getEmail(),
                "Chào mừng đến với RESTAURANT",
                "welcome.ftl",
                MessageVariable.from("user", user)
                );
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if (StringUtils.isEmpty(username)) {
            throw new UsernameNotFoundException("Không tìm thấy người dùng");
        }
        User user;

        if(username.contains("@")) {
            user = userRepository.findByEmail(username);
        } else {
            user = userRepository.findByUsername(username);
        }

        if (user == null) {
            throw new UsernameNotFoundException("Không tìm thấy người dùng này: `" + username + "`");
        }
        return new SimpleUser(user);
    }
}
