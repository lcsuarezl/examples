package design.patterns.behavioral.chainofresponsibility;

public abstract class Handler {

    protected Handler successor;

    public void setSuccesor(Handler handler){
        this.successor = handler;
    }

    public abstract void handleRequest(Request request);


}
