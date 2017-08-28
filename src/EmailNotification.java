public class EmailNotification extends Notification {


    private String recipient;
    private String emailProvider;

    public EmailNotification(String subject, String body, String recipient, String emailProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.emailProvider = emailProvider;
    }

    public String getEmailProvider() {
        return emailProvider;
    }


    public String getRecipient() {
        return recipient;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.printf(
                "subject: %s\n" + "body: %s\n" + "recipient: %s\n" + "emailProvider: %s\n",
                getSubject(), getBody(), getRecipient(), getEmailProvider()
        );


    }


}
