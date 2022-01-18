package com.careerdevs.car;

public class HondaCity extends Car {

    public HondaCity(int mileage){
        super(true, "4");
        this.name = "HondaCity";
        this.mileage = mileage;
    }

    @Override
    public String getMileage() {
        return mileage + " kmpl";
    }
}
