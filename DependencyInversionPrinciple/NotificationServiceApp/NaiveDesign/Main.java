package DependencyInversionPrinciple.NotificationServiceApp.NaiveDesign;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendByGmail("Thank you. Your subscription is done!");
        notificationService.sendByHotmail("Thank you. Your subscription is done!");
    }
}

// Everything goes as expected, but not the (high level) class Notification depends directly on
// the (low level) classes Gmail and Hotmail. if you change anything in this layer like adding new
// mailing technique via Skype for example, or you decided to change the whole layer making this service
// come from any other service provider, hence you have to modify the Notification class
// This design also violates the OCP
// Usually when you intend to apply one principle, the others is applied automatically
// as you will see when we apply the DIP, the OCP is applied automatically
