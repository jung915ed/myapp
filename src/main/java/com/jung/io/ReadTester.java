package com.jung.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
        //inputstream();
        //fileread();
        buffread();

    }

    public static void buffread() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileread() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n != -1) {
                System.out.println((char) n);
                n = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputstream() {
        File file = new File("data.txt");
        try {
            FileInputStream is = new FileInputStream(file);
            int n = is.read();
            while (n != -1) {
                System.out.print((char) n);
                n = is.read();
            }
            System.out.println("");
            System.out.println("file exist = " + file.exists());
            if (is.available() != 0) {
                System.out.println("file contains values");
                System.out.println("availble char: " + is.available());
            } else {
                System.out.println("failed to open");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
