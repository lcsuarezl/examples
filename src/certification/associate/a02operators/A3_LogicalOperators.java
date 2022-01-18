package certification.associate.a02operators;

public class A3_LogicalOperators {

    public static void main(String args[]) {
        System.out.println("Logic operators:");
        System.out.println("true && true");
        System.out.println(true && true);
        System.out.println("false && 1/0 ==1");
        System.out.println(false && 1/0 ==1);
        System.out.println("true || false || 1/0==1");
        System.out.println(true || false || 1/0==1);
    }
}
