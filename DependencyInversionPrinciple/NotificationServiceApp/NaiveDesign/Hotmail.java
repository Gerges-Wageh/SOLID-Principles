package DependencyInversionPrinciple.NotificationServiceApp.NaiveDesign;

public class Hotmail {
    public void send(String message){
        System.out.println("Sending \"" + message + "\" " + "via Hotmail");

    }
}
