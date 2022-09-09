package com.company;

public class airCraft {
    private int code;
    private String modle;
    private String manufacturer;
    

    public airCraft(int code, String modle, String manufacturer) {
        this.code = code;
        this.modle = modle;
        this.manufacturer = manufacturer;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "airCraft{" +
                "code=" + code +
                ", modle='" + modle + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
