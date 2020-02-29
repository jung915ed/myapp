package com.jung.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println(secret);
        Scanner scan = new Scanner(System.in);
        int number = 0;
        while (number != secret) {
            System.out.println("enter a number: ");
            number = scan.nextInt();
            if (number < secret) {
                System.out.println("guess higher");
            } else if (number > secret) {
                System.out.println("guess lower");
            } else {
                System.out.println("good, the number is " + number);
            }
        }
    }
}
