package com.jung.student

import java.util.*


fun main(args: Array<String>) {
    scoreInput()
}

private fun scoreInput() {
    val scanner = Scanner(System.`in`)
    print("enter stu's name: ")
    var name = scanner.next()
    print("enter english scores: ")
    var english = scanner.nextDouble()
    print("enter math scores: ")
    var math = scanner.nextDouble()
    val st = Student(name, math, english)
    st.print()
    println("highest score is: ${st.higherscore()}")
}

class Student(var name: String?, var math: Double, var english: Double) {
    fun print() {
        println(
            name + "\t" + math + "\t" + english + "\t"
                    + getAverage() +
                    if (getAverage() >= 60) "PASSED" else "FAILED"
        )
    }

    fun getAverage(): Double {
        return (english + math) / 2
    }

    fun higherscore(): Double {
        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
        return max
    }
    /*
    fun namecheck() {
        println(name?.length)
    }
     */

}