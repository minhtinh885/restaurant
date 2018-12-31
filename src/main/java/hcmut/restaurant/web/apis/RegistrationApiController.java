package hcmut.restaurant.web.apis;

import hcmut.restaurant.domain.application.UserService;
import hcmut.restaurant.domain.model.user.EmailExistsException;
import hcmut.restaurant.domain.model.user.RegistrationException;
import hcmut.restaurant.domain.model.user.UsernameExistsException;
import hcmut.restaurant.web.payload.RegistrationPayload;
import hcmut.restaurant.web.results.ApiResult;
import hcmut.restaurant.web.results.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class RegistrationApiController {

    private UserService service;

    public RegistrationApiController(UserService service) {
        this.service = service;
    }

    @PostMapping("/api/registrations")
    public ResponseEntity<ApiResult> register(@Valid @RequestBody RegistrationPayload payload) {
        try {
            service.register(payload.toCommand());
            return Result.created();
        } catch (RegistrationException e) {
            String errorMessage = "Đăng ký thất bại";
            if (e instanceof UsernameExistsException) {
                errorMessage = "Tên đăng nhập đã tồn tại";
            } else if (e instanceof EmailExistsException) {
                errorMessage = "Email đã tồn tại";
            }
            return Result.failure(errorMessage);
        }
    }
}
