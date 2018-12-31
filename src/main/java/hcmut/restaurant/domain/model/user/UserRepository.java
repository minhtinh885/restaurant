package hcmut.restaurant.domain.model.user;

public interface UserRepository {
    User findByUsername(String username);

    User findByEmail(String email);

    void save(User user);
}
