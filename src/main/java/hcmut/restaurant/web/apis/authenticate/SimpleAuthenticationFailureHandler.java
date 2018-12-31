package hcmut.restaurant.web.apis.authenticate;

import hcmut.restaurant.utils.JsonUtils;
import hcmut.restaurant.web.results.ApiResult;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException {
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        ApiResult failure;
        if (exception instanceof BadCredentialsException) {
            failure = ApiResult.message("Thông tin không hợp lệ");
        } else if (exception instanceof InsufficientAuthenticationException) {
            failure = ApiResult.message("Yêu cầu xác thực không hợp lệ");
        } else {
            failure = ApiResult.message("Lỗi xác thực");
        }
        JsonUtils.write(response.getWriter(), failure);
    }
}
