package design.patterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {

        //Declaring handlers:

        DirectorHandler director = new DirectorHandler();
        VPHandler vp = new VPHandler();
        CEOHandler ceo = new CEOHandler();

        //define the hierarchy to follow in the chain
        director.setSuccesor(vp);
        vp.setSuccesor(ceo);

        //You should use the same starting point in the chain
        Request request = new Request(RequestType.CONFERENCE, 500);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        director.handleRequest(request);


    }
}
