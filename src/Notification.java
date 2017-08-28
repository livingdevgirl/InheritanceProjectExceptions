import java.time.LocalDateTime;

public class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;

    protected String status = "good to go";

    public Notification(){
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();

    }

    public Notification(String subject, String body){
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();

    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public void showStatus(){
        System.out.println(status);
        this.status = status;
    }


    public void transport() throws NoTransportException{}

}
