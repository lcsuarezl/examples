package design.patterns.behavioral.chainofresponsibility;

public class VPHandler extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE){
            if(request.getAmmount()< 1500){
                System.out.println("VPs can approve purhcases bellow 1500");
            }
            else {
                successor.handleRequest(request);
            }
        }
    }
}
