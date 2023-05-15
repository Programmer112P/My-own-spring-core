package org.springframework.context.event;

public interface ApplicationListener<E> {
    void onApplicationEvent(E event);
}
