package com.company;

import java.util.ArrayList;

public class Main {
    
    

    public static void main(String[] args) {


        ArrayList<String> lang=new ArrayList<String>();
        lang.add("English");
        lang.add("Arabic");
        lang.add("Spanish");




        pilot pilot1=new pilot("Saleh","Jordanian",12548965,110,lang);
        System.out.println(pilot1);

        pilot p3=new pilot()

        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("saleh", "jordanian", 125452, 46, 270));
        passengers.add(new Passenger("ahmad", "saudi", 787845, 45, 900));
        for (int i = 0; i <passengers.size() ; i++) {
            System.out.println(passengers.get(i).toString());

        }

        cargoPlane cargoPlane1=new cargoPlane(44,"boing","boing manufactures",10);
        System.out.println(cargoPlane1.toString());

        ArrayList<String>departingFlight = new ArrayList<>();
        departingFlight.add("Jordan, Amman");
        ArrayList<String>arrivalFlight = new ArrayList<>();
        arrivalFlight.add("LA, USA");


        Airport a1 = new Airport("LOL", "amman", "jordan", departingFlight, arrivalFlight);
        System.out.println(a1);

        airCraft airLine1 =new airLine(44,"boing","boing manufactures",100);
        System.out.println(airLine1.toString());

        flight f = new PassengerFlights(4664, "8", a1, a1, pilot1, airLine1, passengers);
        System.out.println(f.toString());

        flight f2 =new CargoFlights(55,"amman",a1,a1,pilot1,airLine1,21,400);
        System.out.println(f2);










    }
}
