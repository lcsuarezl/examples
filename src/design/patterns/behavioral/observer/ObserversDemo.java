package design.patterns.behavioral.observer;

public class ObserversDemo {


    public static void main(String[] args) {

        Subject subject = new MessageStream();
        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);


        phoneClient.addMessage("Here is a new message");
        tabletClient.addMessage("Another message to tablet ");


    }
}
