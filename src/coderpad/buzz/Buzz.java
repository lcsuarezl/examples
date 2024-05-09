package coderpad.buzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Buzz {

    public static String fizzBuzz1(int number, Map<Integer, String> map) {

        List<Integer> keys = new ArrayList<>();
        map.keySet().forEach( k-> {
            if(number%k == 0){
                keys.add(k);
            }
        });

        StringBuilder sb = new StringBuilder();

        keys.stream().forEach( k-> {
            sb.append(map.get(k));
        });

        if(sb.length()==0){
            sb.append(""+number);
        }

        return sb.toString();
    }



    public static String fizzBuzz2(int number, Map<Integer, String> map) {
        StringBuilder sb = new StringBuilder();
        map.keySet().forEach( k-> {
            if(number%k == 0){
                sb.append(""+map.get(k));
            }
        });
        return sb.length()==0?""+number:sb.toString();
    }


}
