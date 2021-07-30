package com.brigittemccoll.Day3;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Demo31 {
    public static void main(String[] args) {
        //try block to check for exception
        try(FileOutputStream stream = new FileOutputStream("D:\\data.txt")) //creating an object of fileOutputSteam
        {
            //custom string input
            String data = "Hello World";
            //convert string to bytes
            byte[] arr = data.getBytes();
            //text written in the file
            stream.write(arr);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("resource are closed");

    }
}
