package com.company;

public class person {
    private String name;
    private String nationality;
    private int passportNumber;

    public person(String name, String nationality, int passportNumber) {
        this.name = name;
        this.nationality = nationality;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "name: " + name + ", Nationality: " + nationality +  ", Passport number:" + passportNumber ;
    }
}
