package com.jung

import com.jung.student.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun studentTest(){
        val s1 = Student("Ed",60.0,80.0)
        Assertions.assertEquals((60.0+80.0)/2,s1.getAverage())
    }

    @Test
    fun gradingTest(){
        val s1 = Student("Ed",60.0,80.0)
        Assertions.assertEquals('C',s1.grading())
    }
}

