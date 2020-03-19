package com.jung.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        //IntArryTest();
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(1);
        System.out.println(list);
        int n1 = list.get(0);
        System.out.println(list.size());
        List<Double> scores = Arrays.asList(56.2, 66.0, 77.0, 55.2, 44.3);
        for (double score : scores) {
            System.out.println(score);
        }
    }

    private static void IntArryTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
        int[] score = {66, 68, 77, 55, 44};
        for (int i = 0; i < 5; i++) {
            System.out.println(score[i]);
        }
        for (int n : score) {
            System.out.println(n);
        }
    }
}
