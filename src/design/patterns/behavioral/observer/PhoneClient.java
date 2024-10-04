package design.patterns.behavioral.observer;

public class PhoneClient extends  Observer{

    public PhoneClient(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message){
        subject.setState(message + " -  sent from PhoneClient");
    }

    @Override
    void update() {
        System.out.println("PhoneClient Stream: " + subject.getState());
    }
}
