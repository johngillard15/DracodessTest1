package com.careerdevs.car;

public abstract class Car {
    String name;
    Boolean isSedan;
    String seats;
    int mileage;

    public Car(Boolean isSedan, String seats){
        this.isSedan = isSedan;
        this.seats = seats;
    }

    public Boolean getIsSedan(){
        return isSedan;
    }

    public String getSeats(){
        return seats;
    }

    public abstract String getMileage();

    @Override
    public String toString() {
        return String.format("A %s is%s Sedan, is%s 4-seater, and has a mileage of around %s.",
                name, isSedan ? "" : " not", seats.equals("4") ? "" : " not", getMileage());
    }
}
