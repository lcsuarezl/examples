package hackerRank.fizzbuzz;

public class FizzBuzz {


    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        for(int i=1; i<=100; i++){
        if(i%3 == 0 && i%5==0){
            System.out.println("FizzBuzz");
            continue;
        }
        if(i%3 == 0){
            System.out.println("Fizz");
            continue;
        }
        if(i%5 == 0){
            System.out.println("Buzz");
            continue;
        }
        System.out.println(i);
    }



}
}
