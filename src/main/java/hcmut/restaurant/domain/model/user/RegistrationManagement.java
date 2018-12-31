package hcmut.restaurant.domain.model.user;

import hcmut.restaurant.domain.common.security.PasswordEncryptor;
import org.springframework.stereotype.Component;

/**
 * Domain service đăng ký cho người dùng
 * */

@Component
public class RegistrationManagement {

    private UserRepository repository;
    private PasswordEncryptor passwordEncryptor;

    public RegistrationManagement(UserRepository repository, PasswordEncryptor passwordEncryptor) {
        this.repository = repository;
        this.passwordEncryptor = passwordEncryptor;
    }

    public User register(String username, String email, String password, String fullName, String gender)
        throws RegistrationException {
        User existingUser = repository.findByUsername(username);
        if (existingUser != null) {
            throw new UsernameExistsException();
        }

        existingUser = repository.findByEmail(email);
        if(existingUser != null) {
            throw new EmailExistsException();
        }

        String encryptedPassword = passwordEncryptor.encrypt(password);
        User newUser = User.create(username, email.toLowerCase(), encryptedPassword, fullName, gender);
        repository.save(newUser);
        return newUser;

    }
}
