package hackerRank.apostrophe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Apostrophe {

        public static void main(String[] args) throws IOException {
            Path path = Paths.get("..input.txt");
            String read = Files.readAllLines(path).get(0);
            System.out.println(read);
    }


    public static void process(String s){
        String regex = "[!,?._@]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        s = matcher.replaceAll("");
        s = s.replace("'", " ");
        //.replace("\n\n", "\n");
        /*
        regex = "['\\n]";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(s);
        s = matcher.replaceAll("\n").replace("'", " ");
        */
        String[]  sp = s.split(" ");
        //System.out.println(s);
        System.out.println(sp.length);
        for(int i=0; i<sp.length; i++){
            System.out.println(sp[i]);
        }
    }

}
