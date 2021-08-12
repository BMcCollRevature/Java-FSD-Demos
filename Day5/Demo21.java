package com.brigittemccoll.Day5;

import java.io.FileWriter;
import java.io.IOException;

public class Demo21 {
    public static void main(String[] args)throws IOException {
        //it will first check do we have file by name or create new file
        FileWriter fw = new FileWriter("data.txt", true);
        fw.write(10);
        fw.write(100);
        fw.write("This is some message 222111");
        fw.write("\n");
        char[]c1 = {'a','b','c'};
        fw.write(c1);
        fw.write("\n");

        fw.flush();
        fw.close();


    }
}
