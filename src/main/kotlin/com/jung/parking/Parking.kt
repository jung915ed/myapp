package com.jung.parking

import java.time.Duration
import java.time.LocalDateTime
import kotlin.math.ceil

fun main() {
    val enter: LocalDateTime = LocalDateTime.of(2020, 3, 18, 8, 0, 0)
    val leave: LocalDateTime = LocalDateTime.of(2020, 3, 18, 10, 0, 0)
    var car = Car("AAA-0001", enter)
    car.leave = leave
    println(car.duration())
    val hours = ceil(car.duration() / 60.0).toLong()
    println("your fees are: ${hours * 30} dollars")


}

class Car(val id: String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value))
                field = value
        }

    fun duration() = Duration.between(enter, leave).toMinutes()

}