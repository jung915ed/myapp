package com.jung.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        //IntArryTest();
        //ListAs();
        //SetAs();
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "TSMC");
        stocks.put("2317", "FOXCOM");
        //provide key to retrieve value
        System.out.println(stocks.get("2330"));
        //using for loop to list values of keys
        for (String k : stocks.keySet()) {
            System.out.println(stocks.get(k));
        }
    }

    public static void SetAs() {
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(8);
        set.add(9);
        set.add(6);
        for (int n : set) {
            System.out.println(set);
        }
    }

    public static void ListAs() {
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
