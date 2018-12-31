package hcmut.restaurant.domain.common.mail;

import org.springframework.stereotype.Component;

@Component
public class MailManagerImpl implements MailManager {
    @Override
    public void send(String email, String subject, String template, MessageVariable... variables) {

    }
}
