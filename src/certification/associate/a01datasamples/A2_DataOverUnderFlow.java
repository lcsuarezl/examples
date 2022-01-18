package certification.associate.a01datasamples;

public class A2_DataOverUnderFlow {


    public static void main(String args[]){
        System.out.println("Data Overflow with adition");
        //Data int overflow wit addition
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println( '0'+Integer.toBinaryString(max));
        max = Integer.MAX_VALUE + 1;
        System.out.println(max);
        System.out.println(Integer.toBinaryString(max));

        System.out.println("Data Overflow with subtraction");
        //Data int overflow wit subtraction
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println( '0'+Integer.toBinaryString(min));
        min = Integer.MIN_VALUE - 1;
        System.out.println(min);
        System.out.println(Integer.toBinaryString(min));


        //sample addition of double:
        System.out.println("sample addition of double:");

        double sum = 0;
        System.out.println(sum);
        for(int i=0; i<50; i++){
            sum += 0.02;
        }
        System.out.println(sum);
    }

}
