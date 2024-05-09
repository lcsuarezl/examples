package coderpad.buzz;

import java.util.HashMap;
import java.util.Map;

public class TestBuzz {


    public static void main(String args[]){

        Map<Integer, String> map = new HashMap<>();
        map.put(3, "FIZZ");
        map.put(4, "BUZZ");

        System.out.println(Buzz.fizzBuzz1(5, map));
        System.out.println(Buzz.fizzBuzz1(3, map));
        System.out.println(Buzz.fizzBuzz1(4, map));
        System.out.println(Buzz.fizzBuzz1(12, map));

        System.out.println(Buzz.fizzBuzz2(5, map));
        System.out.println(Buzz.fizzBuzz2(3, map));
        System.out.println(Buzz.fizzBuzz2(4, map));
        System.out.println(Buzz.fizzBuzz2(12, map));

    }
}
