package com.jung.train;

public class Ticket {
    int OneWay = 1000;
    int RoundTrip = 2000;
    int OneWayTickets;
    int RoundTripTickets;
    double discount = RoundTrip * 0.9;
    int origin;
    int destination;
    int price;

    public Ticket(int OneWayTickets, int RoundTripTickets) {
        this.OneWayTickets = OneWayTickets;
        this.RoundTripTickets = RoundTripTickets;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void Sum() {
        System.out.printf("you need to paid : " + (OneWay * OneWayTickets + discount * RoundTripTickets));
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
