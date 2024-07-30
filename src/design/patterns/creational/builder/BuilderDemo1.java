package design.patterns.creational.builder;

public class BuilderDemo1 {


    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("It is an example");
        builder.append("of the builder pattern");
        builder.append("it has methods to append");
        builder.append("almos anything we want to a string ");
        builder.append(45);
        System.out.println("Builder: "+builder.toString());

    }
}
