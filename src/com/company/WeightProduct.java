package com.company;

public class WeightProduct extends Product{
    private double wigth;

    public WeightProduct() {

    }

    public WeightProduct(String name, double price,double wigth) {
        super(name, price);
        this.wigth = wigth;
    }
    public double getWigth() {
        return wigth;
    }
    public void setWigth(double wigth) {
        this.wigth = wigth;
    }

    @Override
    public void showProduct() {
        System.out.printf("Продукт %s, ціна %.2f, ширина %.2f \n", getName(),getPrice(),wigth);
    }







}