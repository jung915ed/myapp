package com.jung.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) {
        try {
            File dir = new File("/Volumes/java");
            dir.mkdir();
            FileWriter fw = new FileWriter("/Volumes/java/output.txt");
            fw.write("abc");
            //if data has been written into buffer, use flush to output
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
