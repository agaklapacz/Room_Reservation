package com.github.agaklapacz.model;

import javax.persistence.*;

@Entity
@Table(name="Room")
public class Room {
    @Id
    @Column(name="Room_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="Name")
    private String name;
    @Column(name="Room_number")
    private String number;
    @Column(name="Bed_info")
    private String bedInfo;
    @Column(name = "Air_conditioning")
    private boolean airConditioning;
    @Column(name = "Price")
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }
}
