package hcmut.restaurant.domain.model.user.events;

import hcmut.restaurant.domain.common.event.DomainEvent;
import hcmut.restaurant.domain.model.user.User;

public class UserRegisteredEvent extends DomainEvent {
    private static final long serialVersionUID = 2580061707540917880L;

    private User user;
    public UserRegisteredEvent(User user) {
        super(user);
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
