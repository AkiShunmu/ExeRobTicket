package com.geely.rotickets.model;

public class GetTicket {

    private static int ticket = 500;

    public synchronized int getTicket() {
        if (ticket != 0) {
            ticket--;
        }
        return ticket;
    }

}
