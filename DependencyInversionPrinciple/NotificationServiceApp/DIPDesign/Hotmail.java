package DependencyInversionPrinciple.NotificationServiceApp.DIPDesign;

public class Hotmail implements IMessage{
    @Override
    public void send(String message) {
        System.out.println("Sending \"" + message + "\" " + "via Hotmail");

    }
}
