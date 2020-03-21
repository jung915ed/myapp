package com.jung.student

import java.util.*


fun main(args: Array<String>) {
    scoreInput()
    //val gst = Gradstudent("jack",88.0,85.6,70)
    //gst.print()
}

private fun scoreInput() {
    Student.pass = 60
    //Gradstudent.pass = 70
    val scanner = Scanner(System.`in`)
    print("enter stu's name: ")
    var name = scanner.next()
    print("enter english scores: ")
    var english = scanner.nextDouble()
    print("enter math scores: ")
    var math = scanner.nextDouble()
    val st = Student(name, math, english)
    print("enter thesis scores: ")
    var thesis = scanner.nextInt()
    val gst = Gradstudent(name, math, english, thesis)
    st.print()
    println("highest score is: ${st.higherscore()}")
    println("you are ${st.PassOrFail()}")
    gst.print()
    println("you are ${gst.PassOrFail()}")
}

class Gradstudent(name: String?, english: Double, math: Double, var thesis: Int) :
    Student(name, math, english) {
    companion object {
        var pass = 70
    }

    override fun print() {
        println(
            "$name\t$english\t$math\t" +
                    "$thesis\t${getAverage()}\t${PassOrFail()}\t${grading()}"
        )
    }

    override fun PassOrFail() = if (getAverage() >= pass) "PASSED" else "FAILED"

}

//open is keyword for class or method can be extended
open class Student(var name: String?, var math: Double, var english: Double) {
    //java static type
    companion object {
        @JvmStatic
        var pass = 60
    }

    open fun print() {
        /*
        println(
            name + "\t" + math + "\t" + english + "\t"
                    + getAverage() + PassOrFail()
        )
        println("\t"+grading())

         */
        println(
            "$name\t$english\t$math\t" +
                    "${getAverage()}\t${PassOrFail()}\t${grading()}()"
        )
    }

    fun grading() = when (getAverage()) {
        in 90.0..100.0 -> 'A'
        in 80.0..89.0 -> 'B'
        in 70.0..79.0 -> 'C'
        in 60.0..69.0 -> 'D'
        else -> 'F'
    }

    fun getAverage() = (english + math) / 2

    open fun PassOrFail() = if (getAverage() >= pass) "PASSED" else "FAILED"

    open fun higherscore(): Any = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }

    fun namecheck() = name?.length


}