package com.jung;

public class Person {
    String name;
    float weight;
    float height;

    public Person(float weight, float height) {
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, float weight, float height) {
        this(weight, height);
        this.name = name;
    }

    public float bmi() {
        float bmi = weight/(height*height);
        return bmi;
    }
}
