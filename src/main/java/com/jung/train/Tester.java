package com.jung.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("please enter the ticket amount you need for your OneWay trip: \n");
        Scanner scanner = new Scanner(System.in);
        int OneWayTickets = scanner.nextInt();
        System.out.print("please enter the ticket amount you need for your Round trip: \n");
        int RoundTripTickets = scanner.nextInt();
        Ticket tickets = new Ticket(OneWayTickets, RoundTripTickets);
        tickets.TotalSum();

    }
}
