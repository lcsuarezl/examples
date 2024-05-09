package coderpad.addition;

public class AdditionDaughter {


    public static String compute(int valOne, int valTwo, int calcResult){
        String calc= ""+calcResult;
        String sum = ""+(valOne+valTwo);
        System.out.println("calc:"+ calcResult +"  Sum:"+sum);
        StringBuilder sb = new StringBuilder(calc);
        calc =sb.reverse().toString();
        sb.setLength(0);
        sb.append(sum);
        sum = sb.reverse().toString();
        int wrong =-1;
        int size  = sum.length();
        for(int i=0; i< size; i++) {
            if (sum.charAt(i) != calc.charAt(i)) {
                wrong = i;
            }
        }
        return wrong>0?""+wrong:"ok";
    }


    public static void main(String args[]){
        System.out.println(compute(123, 672, 785));
        System.out.println(compute(123, 672, 795));
        System.out.println(compute(123456, 654321, 777777));
        System.out.println(compute(123456, 654321, 177777));
    }
}
