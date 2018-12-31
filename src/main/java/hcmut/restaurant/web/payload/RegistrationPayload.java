package hcmut.restaurant.web.payload;

import hcmut.restaurant.domain.application.commands.RegistrationCommand;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistrationPayload {

    @Size(min = 2, max = 100, message = "Tên người dùng phải từ 2 đến 50 kí tự")
    @NotNull
    private String username;

    @Email(message = "Email phải hợp lệ")
    @Size(max = 100, message = "Email phải không lớn hơn 100 kí tự")
    @NotNull
    private String email;

    @Size(min = 6, max = 30, message = "Mật phải phải từ 6 đến 30 kí tự")
    @NotNull
    private String password;

    @Size(min = 2, max = 100, message = "Họ và tên phải từ 2 đến 100 kí tự")
    @NotNull
    private String fullName;

    @Size(max = 1, message = "Chưa chọn giới tính")
    @NotNull
    private String gender;

    public RegistrationCommand toCommand() {
        return new RegistrationCommand(this.username, this.email, this.password, this.fullName, this.gender);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
