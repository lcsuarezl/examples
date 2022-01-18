package certification.associate.a02operators;

public class A2_RightShift {


    public static void main(String args[]) {
        System.out.println("1 << 1");
        System.out.println(1 << 1);
        System.out.println("-1 << 1");
        System.out.println(-1 << 1);
        System.out.println("4 >> 1");
        System.out.println(4 >> 1);
        System.out.println("-4 >> 1");
        System.out.println(-4 >> 1);
        System.out.println("1 >> 1");
        System.out.println(1 >> 1);

        System.out.println("-4 >>> 1");
        System.out.println(-4 >>> 1);


        System.out.println("-4");
        System.out.println(Integer.toBinaryString(-4));
        System.out.println("-4>>1");
        System.out.println(Integer.toBinaryString(-4>>1));
        System.out.println("-4>>>1");
        System.out.println(Integer.toBinaryString(-4>>>1));


        System.out.println("Modulus operator");
        System.out.println("5%3");
        System.out.println(5%3);
        System.out.println("-5%-3");
        System.out.println(-5%-3);
        System.out.println("-5%3");
        System.out.println(-5%3);
        System.out.println("5%-3");
        System.out.println(5%-3);


        System.out.println("bBit shift operators:");
        System.out.println("1&2");
        System.out.println(1&2);
        System.out.println("1&3");
        System.out.println(1&3);
        System.out.println("1|1");
        System.out.println(1|2);
        System.out.println("1 ^ 3");
        System.out.println(1 ^ 3);



    }
}
