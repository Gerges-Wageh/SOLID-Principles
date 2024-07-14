package DependencyInversionPrinciple.NotificationServiceApp.DIPDesign;

public class Main {
    public static void main(String[] args) {

        NotificationService notificationService1 = new NotificationService(new Gmail());
        notificationService1.send("Thank you. Your subscription is done!");

        NotificationService notificationService2 = new NotificationService(new Hotmail());
        notificationService2.send("Thank you. Your subscription is done!");



    }
}
