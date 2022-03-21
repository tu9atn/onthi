package com.example.myapplication.model;

import java.text.DecimalFormat;

public class Donut {
    private int id;
    private String name;
    private String spicy;
    private double gia;
    private int image;

    public Donut(int id,String name, String spicy, double gia, int image) {
        this.id = id;
        this.name = name;
        this.spicy = spicy;
        this.gia = gia;
        this.image = image;
    }

    public Donut(String name, String spicy, double gia, int image) {
        this.name = name;
        this.spicy = spicy;
        this.gia = gia;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getGia() {
        return gia;
    }
    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpicy() {
        return spicy;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public String getFormatPrice() {
        DecimalFormat df = new DecimalFormat("$ #,###.00");
        return df.format(this.getGia());
    }
}
