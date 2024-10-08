package design.patterns.behavioral.chainofresponsibility;

public class DirectorHandler extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE){
            System.out.println("Directors can approve Conferences!");
        }
        else{
            //I call successor because If I call this then the same Concrete handler is used
            //so infinite recursion happens
            successor.handleRequest(request);
        }
    }
}
