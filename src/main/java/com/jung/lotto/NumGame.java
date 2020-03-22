package com.jung.lotto;

import java.util.HashSet;
import java.util.Set;

public abstract class NumGame {
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;

    public abstract void generate();

    public boolean validate() {
        if (numbers.size() == numberCount)
            return true;
        else return false;
    }
}
