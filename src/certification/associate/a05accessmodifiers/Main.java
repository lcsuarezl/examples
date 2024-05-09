package certification.associate.a05accessmodifiers;

import certification.associate.a05accessmodifiers.package1.ClassA;
import certification.associate.a05accessmodifiers.package2.ClassB;

public class Main {

    private String message = "hello";

    public static void main(String args[]){
        new Main().print();
        new ClassA().print();
        new ClassB().print();

    }

    private void print(){
        System.out.println(message);
    }
}
