

# Command Pattern

## Overview
The Command Pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing for parameterization of clients with different requests, queuing of requests, and support for undoable operations. This pattern decouples the sender of a request from its receiver by turning the request itself into a stand-alone object.

## Key Concepts

### 1. Command
- **Definition**: An interface or abstract class that declares a method for executing a command.
- **Purpose**: Encapsulates all the information needed to perform an action or trigger an event at a later time.

### 2. Concrete Command
- **Definition**: A class that implements the Command interface and defines the binding between a Receiver object and an action.
- **Purpose**: Implements the execute method by invoking the corresponding operation(s) on the Receiver.

### 3. Receiver
- **Definition**: The object that knows how to perform the operations associated with carrying out a request.
- **Purpose**: Contains the actual logic to perform the action when the command's execute method is called.

### 4. Invoker
- **Definition**: The object that holds a command and at some point asks the command to carry out a request by calling its execute method.
- **Purpose**: Initiates the request and can store and queue commands, allowing for complex command management.

### 5. Client
- **Definition**: The object that creates a command and sets its receiver.
- **Purpose**: Configures the command object and its receiver, and associates them together.

## Example

```java
// Command Interface
public interface Command {
    void execute();
}

// Concrete Command
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

// Receiver
public class Light {
    public void on() {
        System.out.println("The light is on");
    }

    public void off() {
        System.out.println("The light is off");
    }
}

// Invoker
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Client
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton();
    }
}
```


## Q&A


### Question
Why does people often say that the Command design pattern breaks the OOP principles?

#### Answer
The Command design pattern is often criticized for potentially breaking some object-oriented programming (OOP) principles, particularly encapsulation and single responsibility principle (SRP). Here are a few reasons why:

#### Encapsulation: 
The Command pattern encapsulates a request as an object, which can sometimes lead to exposing too much of the internal details of the objects involved. This can break the encapsulation principle, as the command object might need to know too much about the receiver’s internal state to execute the command properly1.
#### ingle Responsibility Principle (SRP):
The Command pattern can lead to classes that have multiple responsibilities. For instance, a command class might be responsible for both defining the action and executing it, which can violate the SRP. This can make the code harder to maintain and understand1.
#### Complexity: 
Implementing the Command pattern can introduce additional complexity into the codebase. This complexity might not always be justified, especially for simpler applications where the benefits of the pattern do not outweigh the added complexity1.

Despite these criticisms, the Command pattern is still widely used because it provides a clear way to decouple the sender and receiver of a request, supports undoable operations, and can help with implementing transactional systems.





