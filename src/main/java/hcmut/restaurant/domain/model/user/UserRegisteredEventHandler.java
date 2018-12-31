package hcmut.restaurant.domain.model.user;

import hcmut.restaurant.domain.model.user.events.UserRegisteredEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserRegisteredEventHandler {
    private final static Logger log = LoggerFactory.getLogger(UserRegisteredEventHandler.class);

    @EventListener(UserRegisteredEvent.class)
    public void handleEvent(UserRegisteredEvent event) {
        log.debug("Đang xử lý `{}` sự kiện đăng ký thành viên", event.getUser().getEmail());
        // Chỉ minh họa cho domain event listener
    }
}
