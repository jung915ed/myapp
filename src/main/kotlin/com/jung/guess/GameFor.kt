package com.jung.guess

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1
    println(secret)
    for (i in 1..5){
        println("enter a number: ($i/4)")
        var number = scan.nextInt()
        println("your $i trying: $number")
        if (number>secret){
            println("lower")
        }else if (number<secret){
            println("higher")
        } else {
            println("good, the number is: $secret")
            break
        }
    }
}