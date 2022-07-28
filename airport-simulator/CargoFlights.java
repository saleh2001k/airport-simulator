package com.company;

public class CargoFlights extends flight{
    private static int load;
    private static int cost;

    public CargoFlights(int flightNumber, String duration, Airport departingAirport, Airport arrivalAirport, com.company.pilot pilot, com.company.airCraft airCraft, int load, int cost) {
        super(flightNumber, duration, departingAirport, arrivalAirport, pilot, airCraft);
        this.load = load;
        this.cost = cost;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static int revenue(){
        return load*cost;
    }

    @Override
    public String toString() {
        return  super.toString()+ "load in Ton:" + load + ", Cost per Ton:" + cost+"$" +" ,Final cost:"+ revenue()+"$";
    }
}
