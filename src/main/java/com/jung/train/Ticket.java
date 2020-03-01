package com.jung.train;

public class Ticket {
    int OneWay = 1000;
    int RoundTrip = 2000;
    int OneWayTickets;
    int RoundTripTickets;
    double discount = RoundTrip * 0.9;

    public Ticket(int OneWayTickets, int RoundTripTickets) {
        this.OneWayTickets = OneWayTickets;
        this.RoundTripTickets = RoundTripTickets;
    }


    public void Sum() {
        System.out.printf("you need to paid : "+(OneWay * OneWayTickets + discount * RoundTripTickets));
    }

    public void TotalSum() {
        System.out.println(
                        "you have " + OneWayTickets + " ticket(s) for your OneWay trip.\n" +
                        "you have " + RoundTripTickets + " ticket(s) for your Round trip.\n" +
                        "money paid for OneWay trip:  " + OneWay * OneWayTickets + " dollars.\n" +
                        "money paid for Round trip: " + discount * RoundTripTickets + " dollars.\n" +
                        "thanks for your participation.");
    }

}
