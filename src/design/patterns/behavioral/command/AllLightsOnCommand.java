package design.patterns.behavioral.command;

import java.util.List;

public class AllLightsOnCommand implements Command {

    private final List<Light> lights;

    public AllLightsOnCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : lights) {
            if(!light.isOn()) {
                light.toggle();
            }
        }
    }
}
