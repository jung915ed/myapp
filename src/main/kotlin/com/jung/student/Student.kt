package com.jung.student

import java.util.*


fun main(args: Array<String>) {
    scoreInput()
}

private fun scoreInput() {
    Student.pass = 60
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
    //println("you are ${st.PassOrFail()}")
}

class Student(var name: String?, var math: Double, var english: Double) {
    //java static type
    companion object {
        @JvmStatic
        var pass = 60
    }

    fun print() {
        /*
        println(
            name + "\t" + math + "\t" + english + "\t"
                    + getAverage() + PassOrFail()
        )
        println("\t"+grading())

         */
        println("$name\t$english\t$math\t${getAverage()}\t${PassOrFail()}\t${PassOrFail()}")
    }

    fun grading() = when (getAverage()) {
        in 90.0..100.0 -> 'A'
        in 80.0..89.0 -> 'B'
        in 70.0..79.0 -> 'C'
        in 60.0..69.0 -> 'D'
        else -> 'F'
    }


    fun getAverage() = (english + math) / 2

    fun PassOrFail() = if (getAverage() >= pass) "PASSED" else "FAILED"

    fun higherscore() = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }

    fun namecheck() = name?.length


}