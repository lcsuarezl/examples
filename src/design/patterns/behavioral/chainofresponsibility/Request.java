package design.patterns.behavioral.chainofresponsibility;


/*
Request is immutable, it is a common practice to avoid object modification
during the processing
 */
public class Request {

    private final RequestType requestType;

    private final double ammount;


    public Request(RequestType requestType, double ammount){
        this.requestType = requestType;
        this.ammount = ammount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmmount() {
        return ammount;
    }
}
