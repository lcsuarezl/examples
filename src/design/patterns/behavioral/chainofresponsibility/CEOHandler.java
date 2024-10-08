package design.patterns.behavioral.chainofresponsibility;

public class CEOHandler extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE){
            System.out.println("CIOs can approve anything they want");
        }
    }
}
