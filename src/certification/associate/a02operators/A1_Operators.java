package certification.associate.a02operators;

public class A1_Operators {

    public static void main(String args[]){

        int a = -42;
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(a);

        System.out.println("Binary representation of 42");
        a = 42;
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println("Bitwise complement of 42");
        System.out.println(~a);
        System.out.println(Integer.toBinaryString(~a));


    }
}
