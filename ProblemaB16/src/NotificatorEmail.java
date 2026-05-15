public class NotificatorEmail extends Notificator {
    private Client client;
    private String mesaj;

    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getAdresaEmail() != null) {
            System.out.println(client.getNume() + " ai un email cu mesajul " + mesaj);
        } else {
            super.getUrmatorulNotificator().notifica(client, mesaj);
        }
    }
}
