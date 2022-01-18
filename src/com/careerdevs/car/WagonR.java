package com.careerdevs.car;

public class WagonR extends Car {

    public WagonR(int mileage){
        super(false, "4");
        this.name = "WagonR";
        this.mileage = mileage;
    }

    @Override
    public String getMileage() {
        return mileage + " kmpl";
    }
}
