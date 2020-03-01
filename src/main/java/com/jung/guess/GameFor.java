package com.jung.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secret = new Random().nextInt(10)+1;
        System.out.println(secret);
        for (int i =1; i<=5; i++){
            System.out.println("enter a number("+i+"/4):");
            int number = scan.nextInt();
            System.out.println("your"+i+"trying: "+number);
            if (number>secret){
                System.out.println("guess lower");
            } else if (number<secret){
                System.out.println("guess higher");
            } else {
                System.out.println("good, the number is "+ number);
                break;
            }
        }
        System.out.println("end of game");
    }
}
