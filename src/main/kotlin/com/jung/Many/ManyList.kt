package com.jung.Many

fun main() {
    val list = listOf(5, 1, 3, 7)
    print(list)
    val score = listOf<Int>(66, 67, 65, 44, 90)
    for (scores in score) {
        println(score)
    }
    println(list.get(2))
    var muteList = mutableListOf(5, 2, 3, 4)
    muteList.add(6)
    println(muteList)
}