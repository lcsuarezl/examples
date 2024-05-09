package certification.associate.a05accessmodifiers.package1;

public class ClassA {

    public void print(){
        ClassC c = new ClassC();
        c.message = " world!";
        c.print();
    }
}
