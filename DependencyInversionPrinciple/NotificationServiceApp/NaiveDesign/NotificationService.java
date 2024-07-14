package DependencyInversionPrinciple.NotificationServiceApp.NaiveDesign;

public class NotificationService {
    private final Gmail gmail = new Gmail();
    private final Hotmail hotmail = new Hotmail();

    public void sendByGmail(String message){
        gmail.send(message);
    }

    public void sendByHotmail(String message){
        hotmail.send(message);
    }


}
