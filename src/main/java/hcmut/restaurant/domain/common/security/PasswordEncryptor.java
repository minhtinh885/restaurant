package hcmut.restaurant.domain.common.security;

public interface PasswordEncryptor {
    /**
     * Mã hóa mật khẩu theo cách thường
     */
    String encrypt(String rawPassword);
}
