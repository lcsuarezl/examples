package certification.associate.a04methods;

public class A1_methods {


    public static void main(String args[]) {
        System.out.println("Method overloading, the more specific will be called: ");
        print(23); //converted to integer
        print(23L); //converted to Long
        print("23"); //String is an object
    }

    public static void print(Object object){
        System.out.println("Object:"+object);
    }

    public static void print(Long _long){
        System.out.println("Long:"+_long);
    }

    public static void print(Integer _integer){
        System.out.println("Integer:"+_integer);
    }


}
