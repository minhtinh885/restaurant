package hcmut.restaurant.domain.model.user;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, length = 50, unique = true)
    private String username;

    @Column(name = "email", nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    @Column(name = "gender", length = 1)
    private String gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dob;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "status", length = 1)
    private String status;

    public User() {
    }

    /**
     * Tạo user mới khi đăng ký
     * */
    public static User create(String username, String email, String password, String fullName, String gender) {
        User user = new User();
        user.username = username;
        user.email = email;
        user.password = password;
        user.fullName = fullName;
        user.gender = gender;
        user.dob = new Date();
        user.phone = "";
        user.status = "A";
        return user;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public Date getDob() {
        return dob;
    }

    public String getPhone() {
        return phone;
    }

    public String getStatus() {
        return status;
    }
}
