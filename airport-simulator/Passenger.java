package com.company;

public class Passenger extends person {
    private int travelldKM;
    private int ticketPrice;


    public Passenger(String name, String nationality, int passportNumber, int travelldKM, int ticketPrice) {
        super(name, nationality, passportNumber);
        this.travelldKM = travelldKM;
        this.ticketPrice = ticketPrice;
    }

    public int getTravelldKM() {
        return travelldKM;
    }

    public void setTravelldKM(int travelldKM) {
        this.travelldKM = travelldKM;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Passenger Name: " + getName() + ", Nationality: " + getNationality() +  ", Passport number:" + getPassportNumber() +"Traveled distance : "+travelldKM+"KM, "+"Ticket price: "+ticketPrice+"$";
    }
}
