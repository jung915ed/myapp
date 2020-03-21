package com.jung.Many

import com.jung.parking.Car
import java.time.LocalDateTime

fun main() {
/*    val list = listOf(5, 1, 3, 7)
    print(list)
    val score = listOf<Int>(66, 67, 65, 44, 90)
    for (scores in score) {
        println(score)
    }
    println(list.get(2))
    var muteList = mutableListOf(5, 2, 3, 4)
    muteList.add(6)
    println(muteList)
    */
    val ParkingLot = HashMap<String, Car?>()
    var enter = LocalDateTime.of(2020, 3, 20, 8, 0, 0)
    var car: Car? = Car("AAA-0001", enter)
    //if key is null +"!!"
    ParkingLot.put(car!!.id, car)
    car = Car("BBB-0002", enter.plusMinutes(15))
    ParkingLot.put(car.id, car)
    //car 1 leaves
    var leave = LocalDateTime.of(2020, 3, 20, 9, 0, 0)
    car = ParkingLot.get("AAA-0001")
    car?.leave = leave
    println("${car?.id} duration: ${car?.duration()}")
    ParkingLot.remove(car?.id)
    println(ParkingLot.size)
    //car 2
    car = ParkingLot.get("BBB-0002")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration: ${car?.duration()}")
    ParkingLot.remove(car?.id)
    println(ParkingLot.size)

}