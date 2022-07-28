package com.company;

public class cargoPlane extends airCraft{
    private int load;

    public cargoPlane(int code, String modle, String manufacturer, int load) {
        super(code, modle, manufacturer);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }






    @Override
    public String toString() {
        return "Cargo Plane: code=" + getCode() +
                ", model='" + getModle() + '\'' +
                ", manufacturer='" + getManufacturer() +"load in Ton: " + load ;
    }
}
