package hcmut.restaurant.domain.application.commands;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class RegistrationCommand {

    private String fullName;
    private String username;
    private String email;
    private String password;
    private String gender;

    public RegistrationCommand(String username, String email, String password, String fullName, @Size(message = "Chưa chọn giới tính") @NotNull String gender) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
    }

    public String getUsername() {
        return this.username;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
    public String getFullName() {
        return this.fullName;
    }
    public String getGender() {
        return gender;
    }
    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RegistrationCommand that = (RegistrationCommand) obj;
        if (!Objects.equals(fullName, that.fullName)) return false;
        if (!Objects.equals(username, that.username)) return false;
        if (!Objects.equals(email, that.email)) return false;
        return (Objects.equals(password, that.password));
    }

    @Override
    public String toString() {
        return "RegistrationCommand{" +
                "fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password + '\'' + '}';
    }*/
}
