public class Program {
    public static void main(String[] args) {
        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        Client client = new Client("Alex");
        Client client1 = new Client("iuli", "0745646", "yasin@mail.com");

        notificatorSMS.notifica(client, "salut vere");
        notificatorSMS.notifica(client1, "ce faci vere");
    }
}
