package com.jung.io;

import java.io.*;

public class tester {
    public static void main(String[] args) {
        File file = new File("data.txt");

        try {
            InputStream is = new FileInputStream(file);
            System.out.println("file exist = " + file.exists());
            if (is.available() != 0) {
                System.out.println("file contains values");
                System.out.println("availble char: " + is.available());
            } else {
                System.out.println("failed to open");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
