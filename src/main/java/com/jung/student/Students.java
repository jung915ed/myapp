package com.jung.student;

import java.util.*;

public class Students {
    String id;
    String name;
    double math;
    double english;
    double average = (math + english) / 2;

    public Students(String name, double math, double english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public double highscore() {
        /*
        double max = (english > math) ? english:math;
        return max;
         */
        //return (english > math) ? english : math;
        double max = getMax();
        return max;
    }

    private double getMax() {
        double max;
        if (english > math) {
            max = english;
            System.out.print("english");
        } else {
            max = math;
            System.out.print("math");
        }
        return max;
    }

    public void print() {
        System.out.println(name + "\t" + math + "\t" + english + "\t" + getAverage()
                + "\t" + ((getAverage() >= 60) ? "PASSED" : "FAILED"));
        char grading = 'F';
        switch ((int) (average / 10)) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';

        }
        System.out.println("grading is: " + grading);

        /*
        if (getAverage() >= 60) {
            System.out.println("\t PASSED");
        } else {
            System.out.println("\t failed");
        }
         */
    }

    public double getAverage() {
        return (english + math) / 2;
    }

    public static void pickLotto() {
        ArrayList<String> numberList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 49; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int j = 0; j < 6; j++) {
            //System.out.print(list.get(j)+"\t");
            numberList.add(String.valueOf(list.get(j)));
        }
        System.out.println("lotto number picked: " + numberList);
    }

    public static void randomNum() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(8) + 1;
        System.out.println("Random number is : " + randomInt);

    }


    public static void scoreInput() {

        System.out.println("enter student's name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("enter english scores: ");
        double english = scan.nextDouble();
        System.out.println("enter math scores: ");
        double math = scan.nextDouble();
        //Students st = new Students("jack", 66, 77);
        Students st = new Students(name,math,english);
        st.print();
        System.out.println("highest score is: " + st.highscore());
    }

}