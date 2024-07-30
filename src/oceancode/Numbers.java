package oceancode;

import java.util.Arrays;

public class Numbers {


      /*Write the int greaterWithSameDigits(int n) function:
Given a number, return another number by swapping some or all its digits, the resulting numbers should meet the following conditions:
-It must be greater than the original number
-It must be the smallest number that meets the first condition
Examples:
if n = 129 the result should be 192
If n = 2493 the result should be 2934
if n = 24965 the result should be 25469

if n = 21 the result should be -1
if n = 12345 the result 12354
if n = 54321 the result  54321

Note: if there is no possible answer for a given input, return -1
     */


    public static void main(String[] args) {
        greaterWithSameDigits(129);
        greaterWithSameDigits(2493);
        greaterWithSameDigits(24965);
        greaterWithSameDigits(21);
        greaterWithSameDigits(12345);
        greaterWithSameDigits(54321);

    }

    public static void greaterWithSameDigits(int num){
        print("original ", num);
        int[] digits = toArray(num);
        digits = makeGreater(digits);
        int greater = toInt(digits);
        print("greater ", greater);
    }


    public static int[] makeGreater(int[] num){
        int index = 0;
        for(int i=0; i < num.length -1 ; i++){
            if(num[i]>num[i+1]){
                index = i;
                int a = num[i];
                num[i] = num[i+1];
                num[i+1] = a;
                break;
            }
        }
        return makeSmaller(num, index);
    }

    public static int[] makeSmaller(int[] num, int index){
        for(int i=0; i < index ; i++){
            if(num[i]<num[i+1]){
                int a = num[i];
                num[i] = num[i+1];
                num[i+1] = a;
            }
        }
        return num;
    }

    public static int[] toArray(int num){
        int size = (int)( Math.log10(num)+1);
        int[] digits = new int[size];
        int digit=0, i=0;
        do {
            digit = num % 10;
            digits[i] = digit;
            i++;
            num = num / 10;
        }while (num>0);
        return digits;
    }

    public static int toInt(int[] digits){
        int num = 0;
        for(int i=0; i< digits.length; i++){
            num +=  digits[i]*Math.pow(10,i);
        }
        return num;
    }

    public static void print(String name, int[] num){
        System.out.print(name+": ");
        Arrays.stream(num).forEach(System.out::print);
        System.out.println("");
    }

    public static void print(String name, int num){
        System.out.print(name+": " + num);
        System.out.println("");
    }
}
