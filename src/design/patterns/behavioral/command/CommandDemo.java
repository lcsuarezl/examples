package design.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {


    //client
    public static void main(String[] args) {
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");



        Switch lightSwitch = new Switch();
        Command toggleCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lights);
        Command allLightsOnCommand = new AllLightsOnCommand(lights);
        Command allLightsOffCommand = new AllLightsOffCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);

        System.out.println("Toggled to On:");
        lightSwitch.storeAndExecute(allLightsOnCommand);
        System.out.println("Toggled to Off:");
        lightSwitch.storeAndExecute(allLightsOffCommand);

    }

}
