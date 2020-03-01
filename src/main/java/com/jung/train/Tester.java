package com.jung.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int OneWayTickets;
        int RoundTripTickets;

        System.out.print("please enter the ticket amount you need for your OneWay trip: \n");
        OneWayTickets = scanner.nextInt();
        System.out.print("please enter the ticket amount you need for your Round trip: \n");
        RoundTripTickets = scanner.nextInt();
        int value = OneWayTickets+RoundTripTickets;

        Ticket tickets = new Ticket(OneWayTickets, RoundTripTickets);
        if (value != 0){
            tickets.Sum();
        } else {
            System.out.println("end of ticketing");
        }

        /*while (OneWayTickets != -1) {
            Ticket tickets = new Ticket(OneWayTickets, RoundTripTickets);
            System.out.print("please enter the ticket amount you need for your OneWay trip: \n");
            OneWayTickets = scanner.nextInt();
            tickets.TotalSum();
        }
        while (RoundTripTickets != -1) {
            Ticket tickets = new Ticket(OneWayTickets, RoundTripTickets);
            System.out.print("please enter the ticket amount you need for your Round trip: \n");
            RoundTripTickets = scanner.nextInt();
            tickets.TotalSum();
        }*/

    }

}
