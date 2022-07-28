package com.company;

import java.util.ArrayList;

public class PassengerFlights extends flight {
    private static ArrayList<Passenger> passengers;

    public PassengerFlights(int flightNumber, String duration, Airport departingAirport, Airport arrivalAirport, pilot pilot, airCraft airCraft, ArrayList<Passenger> passengers) {
        super(flightNumber, duration, departingAirport, arrivalAirport, pilot, airCraft);
        this.passengers = passengers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }


    public static int  revenue(){
        int sum =0;
        for (int i = 0; i <passengers.size() ; i++) {
            sum= sum+passengers.get(i).getTicketPrice();
        }
                return sum;
    }

    @Override
    public String toString() {
        return "passengers:"+passengers + "cal: " + revenue();
    }



}
