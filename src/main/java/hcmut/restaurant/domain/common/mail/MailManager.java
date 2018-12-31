package hcmut.restaurant.domain.common.mail;

public interface MailManager {

    /**
     * Gửi một tin nhắc đến người nhận
     * */

    void send(String email, String subject, String template, MessageVariable... variables);
}
