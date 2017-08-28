public class Main {
    public static void main(String[] args) {


        EmailNotification one = new EmailNotification("this is an email ", "sup fools", "you", "gmail");

        TextNotification two = new TextNotification("you suck", "l33t win 4 deez nuts", "bae", "boost mobile");


        one.showStatus();

        two.showStatus();

        two.transport();
    }
}
