package com.jung.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("please enter the ticket amount you need for your OneWay trip: \n")
    var onewaytickets = scanner.nextInt()
    print("please enter the ticket amount you need for your RoundWay trip: \n")
    var roundtriptickets = scanner.nextInt()
    val ticket = Tickets(onewaytickets, roundtriptickets)
    ticket.Sum()
}

class Tickets(var onewaytickets: Int, var roundtriptickets: Int) {
    val oneway = 1000
    val roundtrip = 2000
    val discount = roundtrip * 0.9

    fun Sum() {
        println(
            "you have $onewaytickets ticket(s) for your OneWay trip.\n" +
                    "you have $roundtriptickets ticket(s) for your RoundWay trip.\n" +
                    "money paid for OneWay trip: " + oneway * onewaytickets + " dollars.\n" +
                    "money paid for Round trip: " + discount * roundtriptickets + " dollars.\n"
                    + "thanks for your participation."
        )

    }
}

data class TestTicket(val origin: Int, val destination: Int, val price: Int)

fun main() {
    var ticket = TestTicket(20, 51, 420)
    val s = "abcde"
    println(s.validate())
    println((1..10).random())
}

fun String.validate(): Boolean {
    return this.length >= 6
}

fun IntRange.random(): Int {
    val r = Random().nextInt(endInclusive - start) + start
    return r
}