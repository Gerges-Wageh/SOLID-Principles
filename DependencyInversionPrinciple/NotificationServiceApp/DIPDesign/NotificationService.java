package DependencyInversionPrinciple.NotificationServiceApp.DIPDesign;

public class NotificationService {
    IMessage messageFacility;

    // Dependency injection using constructor injection
    public NotificationService(IMessage messageFacility) {
        this.messageFacility = messageFacility;
    }
    public void send(String message){
        messageFacility.send(message);
    }
}
