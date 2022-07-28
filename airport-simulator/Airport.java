package com.company;

import java.util.ArrayList;

public class Airport {
    private String name;
    private String city;
    private String country;
    private ArrayList<String> departingFlights;
    private ArrayList<String> arrivalFlights;


    public Airport(String name, String city, String country, ArrayList<String> departingFlights, ArrayList<String> arrivalFlights) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.departingFlights = departingFlights;
        this.arrivalFlights = arrivalFlights;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList getDepartingFlights() {
        return departingFlights;
    }

    public void setDepartingFlights(ArrayList departingFlights) {
        this.departingFlights = departingFlights;
    }

    public ArrayList getArrivalFlights() {
        return arrivalFlights;
    }

    public void setArrivalFlights(ArrayList arrivalFlights) {
        this.arrivalFlights = arrivalFlights;
    }

    public void addDF(flight addDF) {

        //departingFlights.add(addDF);
    }


    //public void addd(flight addA) {

//    /    arrivalFlights.add(addA);}

    @Override
    public String toString() {
        return "Airport name :"+name+",City :"+city+",Country:"+country+",Departing flights:"+departingFlights+",Arrival flights:"+arrivalFlights;
    }
}
