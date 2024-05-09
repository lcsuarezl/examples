package coderpad.mix;

import java.io.*;

public class Mixed {


    public static void main(String args[]) throws IOException {

        File f = new File("/tmp/myfile");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Object objec = null;
        oos.writeObject(objec);

    }
}
