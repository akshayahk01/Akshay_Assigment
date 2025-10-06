package assingment_october;


// Step 1: Define the Notification interface
interface Notification {
    void notifyUser();
}

// Step 2: Implement concrete classes
class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification...");
    }
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS Notification...");
    }
}

class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push Notification...");
    }
}

// Step 3: Create Factory class
class NotificationFactory {
    public Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SMSNotification();
            case "push" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown Notification Type: " + type);
        };
    }
}

// Step 4: Demo
public class FactoryPatternDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification email = factory.createNotification("email");
        email.notifyUser();

        Notification sms = factory.createNotification("sms");
        sms.notifyUser();

        Notification push = factory.createNotification("push");
        push.notifyUser();
    }
}