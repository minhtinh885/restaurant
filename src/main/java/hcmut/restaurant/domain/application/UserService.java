package hcmut.restaurant.domain.application;

import hcmut.restaurant.domain.application.commands.RegistrationCommand;
import hcmut.restaurant.domain.model.user.RegistrationException;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    /***
     * Đăng ký 1 User mới với tên đăng nhập, email, và mật khẩu.
     * */
    void register(RegistrationCommand command) throws RegistrationException;
}
