package certification.associate.a04methods;

public class A2_methods {

    public static void main(String args[]) {
        System.out.println("Method overloading, the more specific will be called: ");
        String greetings = "Hello S";
        update(greetings);
        System.out.println(greetings);
        StringBuilder greetings1 = new StringBuilder("Hello SB");
        update1(greetings1);
        System.out.println(greetings1);

        int diez = 10;
        increaseInt(diez);
        System.out.println("Diez: "+diez);
        Integer integer = 10;
        increaseInteger(integer);
        System.out.println("Integer"+integer);
    }

    public static void update(String greetings){
        greetings = "Hello World";
    }

    public static void update1(StringBuilder greetings){
        greetings.append(" world");
    }

    public static void increaseInt(int _int){
        ++_int;
    }

    public static void increaseInteger(Integer _integer){
        ++_integer;
    }

}
