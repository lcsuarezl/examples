package hackerRank.rearrange;

import java.util.Arrays;

public class Rearrange {


    public static String rearrangingWord(String word) {
        char[] chars = word.toCharArray();
        for(int i=chars.length-1; i>0; i--){
            if( chars[i-1]<chars[i] ){
                char aux1 = chars[i-1];
                chars[i-1] = chars[i];
                chars[i] = aux1;
                break;
            }
        }
        word = new String(chars);
        return word;
    }

    public static void main(String[] args) {
        System.out.println("pp>>"+rearrangingWord("pp"));
        System.out.println("hefg>>"+rearrangingWord("hefg"));
        System.out.println("baca>>"+rearrangingWord("baca"));

    }
}
