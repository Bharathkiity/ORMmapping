package com.edubridge.Fan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Fan01")
public class Fan {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer fanId;
    private String brand;
    private Double price;
    private String color;
    private Integer speed;

    // Getters and Setters
    public Integer getFanId() {
        return fanId;
    }

    public void setFanId(Integer fanId) {
        this.fanId = fanId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fan [fanId=" + fanId + ", brand=" + brand + ", price=" + price + 
               ", color=" + color + ", speed=" + speed + "]";
    }
}
