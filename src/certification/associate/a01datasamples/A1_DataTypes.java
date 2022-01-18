package certification.associate.a01datasamples;

import java.math.BigDecimal;

public class A1_DataTypes {


    public static void main(String args[]){
        //integer number too large
        //int a = 123451234512345;
        //System.out.println(a);

        long b = 123451234512345L;
        System.out.println(b);

        short c = 42;
        System.out.println(c);

        int d = 0x2A; //0x tells java hex decimal is being used
        System.out.println(d);

        System.out.println(Integer.toBinaryString(d));

        System.out.println(Integer.toBinaryString(42));

        int e = 052; //0 tells java octal is being used
        System.out.println(e);

        //float f = 1.23451234512345;
        float f = 1.23451234512345f;  //data loss
        System.out.println(f);

        double g = 1.23451234512345d;  //data loss
        System.out.println(g);

        //since 0.2 is not exactly representable as sum of pow of 2 this will cause an underflow
        double h = 0.2;
        System.out.println(h);
        System.out.println(new BigDecimal(h));

        //this value is exactly representable as a sum of pow of 2
        double  i = 1.666656494140625;
        System.out.println(i);
        System.out.println(new BigDecimal(i));


        char j = 'a';
        char k = 97;
        char l = 0x03C0;
        char m = '\u03C0';
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(j+k+l+m);

    }
}
