package hcmut.restaurant.domain.common.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncryptorImpl implements PasswordEncryptor {

    private PasswordEncoder passwordEncoder;

    public PasswordEncryptorImpl(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String encrypt(String rawPassword) {

        return passwordEncoder.encode(rawPassword);
    }
}
