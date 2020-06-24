package com.jung.student;

import java.util.*;

import static com.jung.student.GradStudents.grading;

public class Students {
    String id;
    String name;
    double math;
    double english;
    double average = (math + english) / 2;
    static int pass = 60;

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

    public static void grading(double v) {
        char grading = 'F';
        switch ((int) (v)) {
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
        System.out.println("your grading is: " + grading);
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
                + "\t" + ((getAverage() >= pass) ? "PASSED" : "FAILED"));
        grading(average / 10);

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
        ArrayList<String> numberList1 = new ArrayList<>();
        ArrayList<String> numberList2 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i < 39; i++) {
            list1.add(i);
        }
        for (int k = 1; k < 9; k++) {
            list2.add(k);
        }
        Collections.shuffle(list1);
        for (int j = 1; j <= 6; j++) {
            //System.out.print(list.get(j)+"\t");
            numberList1.add(String.valueOf(list1.get(j)));
        }
        Collections.shuffle(list2);
        for (int m = 1; m <= 1; m++) {
            numberList2.add(String.valueOf(list2.get(m)));
        }
        System.out.println("lotto number picked: " + numberList1);
        System.out.printf("lotto picked: " + numberList2);
    }

    public static void randomNum() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(8) + 1;
        System.out.println("Random number is : " + randomInt);

    }


    public static void scoreInput() {
        //call kotlin method
        Student.setPass(60);

        System.out.println("enter student's name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("enter english scores: ");
        double english = scan.nextDouble();
        System.out.println("enter math scores: ");
        double math = scan.nextDouble();
        //Students st = new Students("jack", 66, 77);
        Students st = new Students(name, math, english);
        st.print();
        System.out.println("highest score is: " + st.highscore());
    }

}
