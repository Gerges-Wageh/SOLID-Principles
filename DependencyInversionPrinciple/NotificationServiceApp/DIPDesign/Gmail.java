package DependencyInversionPrinciple.NotificationServiceApp.DIPDesign;

public class Gmail implements IMessage{

    @Override
    public void send(String message) {
        System.out.println("Sending \"" + message + "\" " + "via Gmail");

    }
}
