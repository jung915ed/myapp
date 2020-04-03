package com.jung.fileIO

import java.io.File

fun main() {
//    writer()
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun writer() {
    File("output.txt").writeText("abc123")
    File("output.txt").printWriter().use {
        it.println("1st line")
        it.println("2nd line")
        it.println("3rd line")
        //auto flush and close file
    }
    File("output.txt").bufferedWriter().use {
        it.write("1st line: 1\n")
        it.write("2nd line: 1\n")
        it.write("3rd line: 1\n")
    }
}