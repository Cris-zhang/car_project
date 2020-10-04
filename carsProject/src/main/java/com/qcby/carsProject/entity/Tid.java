package com.qcby.carsProject.entity;

public class Tid {
    private  String userName;
    private  String carModel;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Tid{" +
                "userName='" + userName + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
