package com.company;

import java.util.ArrayList;

public class pilot extends person{

    private int Flyinghours;
    private ArrayList<String> spokenLang=new ArrayList<String>();


    public pilot(String name, String nationality, int passportNumber, int flyinghours, ArrayList<String> spokenLang) {
        super(name, nationality, passportNumber);
        Flyinghours = flyinghours;
        this.spokenLang = spokenLang;
    }

    public int getFlyinghours() {
        return Flyinghours;
    }

    public void setFlyinghours(int flyinghours) {
        Flyinghours = flyinghours;
    }

    public ArrayList<String> getSpokenLang() {
        return spokenLang;
    }

    public void setSpokenLang(ArrayList<String> spokenLang) {
        this.spokenLang = spokenLang;
    }

    @Override
    public String toString() {
        return "Pilot name: " + getName() + ", Nationality: " + getNationality() +  ", Passport number:" + getPassportNumber() +" ,Flying hours=" + Flyinghours + ", Spoken language=" + spokenLang ;
    }
}
