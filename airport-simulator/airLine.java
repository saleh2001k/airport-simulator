package com.company;

public class airLine extends airCraft{
    private int passengerProperty;

    public airLine(int code, String modle, String manufacturer, int passengerProperty) {
        super(code, modle, manufacturer);
        this.passengerProperty = passengerProperty;
    }

    public int getPassengerProperty() {
        return passengerProperty;
    }

    public void setPassengerProperty(int passengerProperty) {
        this.passengerProperty = passengerProperty;
    }



    @Override
    public String toString() {
        return super.toString()+"code=" + getCode() +
                ", modle='" + getModle() + '\'' +
                ", manufacturer='" + getManufacturer() +"Passenger property=" + passengerProperty ;

    }
}
