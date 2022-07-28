package com.company;

public class flight {
    private int flightNumber;
    private String duration;
    private Airport departingAirport;
    private Airport arrivalAirport;
    private pilot pilot;
    private airCraft airCraft;

    public flight(int flightNumber, String duration, Airport departingAirport, Airport arrivalAirport, com.company.pilot pilot, com.company.airCraft airCraft) {
        this.flightNumber = flightNumber;
        this.duration = duration;
        this.departingAirport = departingAirport;
        this.arrivalAirport = arrivalAirport;
        this.pilot = pilot;
        this.airCraft = airCraft;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Airport getDepartingAirport() {
        return departingAirport;
    }

    public void setDepartingAirport(Airport departingAirport) {
        this.departingAirport = departingAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public com.company.pilot getPilot() {
        return pilot;
    }

    public void setPilot(com.company.pilot pilot) {
        this.pilot = pilot;
    }

    public com.company.airCraft getAirCraft() {
        return airCraft;
    }

    public void setAirCraft(com.company.airCraft airCraft) {
        this.airCraft = airCraft;
    }

    public static int  revenue(){
        return 0;
    }




    @Override
    public String toString() {
        return "Flight number:"+flightNumber+",Duration:"+duration+",Departing airport:"+departingAirport+",Arrival airport:"+arrivalAirport+
                ",Pilot information:"+pilot+",Aircraft information:"+airCraft;
    }
}
