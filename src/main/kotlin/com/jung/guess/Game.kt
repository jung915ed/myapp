package com.jung.guess

import java.util.*

fun main(args:Array<String>) {
    val secret = Random().nextInt(10)+1
    println(secret)
    //val scanner = Scanner(System.`in`)
    var number = 0
    while (number!=secret) {
        print("enter a number: ")
     //   var number = scanner.nextInt()
     number = readLine()!!.toInt()
        if (number>secret){
            println("guess lower")
        }else if (number<secret){
            println("guess higher")
        }else{
            println("good, the number is : $number")
        }
    }
}