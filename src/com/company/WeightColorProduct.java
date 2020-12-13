package com.company;

public class WeightColorProduct extends WeightProduct {
    private String color;

    public WeightColorProduct() {
    }
    public WeightColorProduct( String name, double price,double wigth,String color) {
        super(name, price,wigth);
        this.color = color;
    }

    @Override
    public void showProduct() {
        System.out.printf("Продукт %s, ціна %.2f, ширина %.2f, колір %s \n", getName(),getPrice(),getWigth(),color);
    }



}
