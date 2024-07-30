package oceancode;

import java.util.Arrays;
import java.util.Collections;

public class Hello {
    /*Write the int greaterWithSameDigits(int n) function:
Given a number, return another number by swapping some or all its digits, the resulting numbers should meet the following conditions:
-It must be greater than the original number
-It must be the smallest number that meets the first condition
Examples:
if n = 129 the result should be 192
If n = 2493 the result should be 2934

Note: if there is no possible answer for a given input, return -1
     */


    public static void main(String[] args) {

        //System.out.println("129:"+greaterWithSameDigits(129));
        int num = greaterWithSameDigits(2493);
        System.out.println("\nGreater with same:");
        System.out.println("2493:"+ num);
    }
    // 0  1  2  3
    //[2][4][9][3]
    // 0  2  3  1
    // 2  9  3  4

    // 0  2  1  3
    // 2  9  4  3


    public static int greaterWithSameDigits(int n){
        String num = n+"";
        Integer[] nums = new Integer[num.length()];
        char[] numChar = num.toCharArray();
        for(int i= 0; i< num.length(); i++){
            nums[i] =  Integer.valueOf(""+numChar[i]);
        }
         /// last position where i > i+1
        //129  [1][2] size-index
        //[3] iobe
        int smaller =0;
        for(int i=num.length()-1; i>1; i--){
            if(nums[i]>nums[i-1]){
                int a =nums[i-1];
                nums[i-1]= nums[i];
                nums[i]=a;
                smaller = i;
                break;
            }
        }
        System.out.println("Nums:");
        Arrays.stream(nums).forEach(System.out::print);
        //sort asc the last part of the array:
        int t = nums.length - smaller;
        System.out.println("\nSmaller:"+smaller);
        Integer[] last =  new Integer[t];
        System.arraycopy(nums,0, last, 0, t);
        Integer[] newNums = Arrays.copyOf(nums, smaller);
        System.out.println("\nunsorted");
        Arrays.stream(newNums).forEach(System.out::print);
        Arrays.sort(newNums, Collections.reverseOrder());
        System.out.println("\nsorted");
        Arrays.stream(newNums).forEach(System.out::print);
        String gwsd = "";
        for(int i=0; i<nums.length; i++){
            gwsd += ""+nums[i];
        }
        return  Integer.valueOf(gwsd);
    }

    //Sort the last part to make it smaller
    public int[] makeSmaller(int[] nums){
        for(int i=0; i<nums.length; i++){
           if(nums[i]>nums[i+1]){
               int a =nums[i];
               nums[i]=nums[i+1];
               nums[i]=a;
           }
        }
        return nums;
    }



}
