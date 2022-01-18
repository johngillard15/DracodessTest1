package com.careerdevs.car;

public class InnovaCrysta extends Car {

    public InnovaCrysta(int mileage) {
        super(false, "2");
        this.name = "InnovaCrysta";
        this.mileage = mileage;
    }

    @Override
    public String getMileage() {
        return mileage + " kmpl";
    }
}
