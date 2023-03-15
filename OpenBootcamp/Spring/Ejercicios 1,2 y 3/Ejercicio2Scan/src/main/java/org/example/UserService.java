package org.example;
import org.springframework.stereotype.Component;
@Component
public class UserService {
    private NotificationService notification;

    public UserService(NotificationService notification) {
        this.notification = notification;
    }
    public void imprimirSaludo() {
        notification.imprimeSaludo();
    }
}
