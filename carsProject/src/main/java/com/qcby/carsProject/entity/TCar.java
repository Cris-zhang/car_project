package com.qcby.carsProject.entity;

public class TCar {
    private Long id;
    private String carModel;
    private String miles;
    private String displacement;
    private String from_date;
    private String buy_date;
    private Long user_id;

    @Override
    public String toString() {
        return "TCar{" +
                "id=" + id +
                ", carModel='" + carModel + '\'' +
                ", miles='" + miles + '\'' +
                ", displacement='" + displacement + '\'' +
                ", from_date='" + from_date + '\'' +
                ", buy_date='" + buy_date + '\'' +
                ", user_id=" + user_id +
                '}';
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(String buy_date) {
        this.buy_date = buy_date;
    }

}
