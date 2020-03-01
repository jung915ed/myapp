package com.jung;

import com.jung.student.Students;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StuTest {
    @Test
    public void highScoreTest() {
        Students s1 = new Students("Ed", 60, 80);
        Assertions.assertEquals(80, s1.highscore());
    }

    @Test
    public void averageTest() {
        Students s1 = new Students("Ed", 60, 80);
        Assertions.assertEquals((60 + 80) / 2, s1.getAverage());
    }
}
