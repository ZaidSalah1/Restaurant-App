package com.example.myappfood.model;

public class HomeVerModel {
    private String name;
    private int img;
    private String price;
    private String time;

    private String rate;
    public HomeVerModel(String name, int img, String price, String time, String rate) {
        this.name = name;
        this.img = img;
        this.price = price;
        this.time = time;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
