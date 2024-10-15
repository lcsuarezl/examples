package design.patterns.behavioral.command;


//concrete command
public class OffCommand implements Command {

    private final Light light;

    public OffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }
}
