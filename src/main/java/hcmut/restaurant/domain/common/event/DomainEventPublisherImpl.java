package hcmut.restaurant.domain.common.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class DomainEventPublisherImpl implements DomainEventPublisher {

    private ApplicationEventPublisher actualPublisher;

    public DomainEventPublisherImpl(ApplicationEventPublisher actualPublisher) {
        this.actualPublisher = actualPublisher;
    }

    @Override
    public void publish(DomainEvent event) {
        actualPublisher.publishEvent(event);
    }
}
