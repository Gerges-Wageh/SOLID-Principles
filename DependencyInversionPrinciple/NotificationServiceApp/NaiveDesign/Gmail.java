package DependencyInversionPrinciple.NotificationServiceApp.NaiveDesign;

public class Gmail {
    public void send(String message){
        System.out.println("Sending \"" + message + "\" " + "via Gmail");
    }
}
