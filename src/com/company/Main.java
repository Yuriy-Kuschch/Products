package com.company;

public class Main {

    public static void main(String[] args) {
        Generic generic = new Generic();
        Product p =new Product("Підшипник", 10);
        WeightProduct wp =new WeightProduct("Коробка",11,22);
        WeightColorProduct wpc =new WeightColorProduct("Куб",12,32,"Зелений");
        Product p2 =new Product("Шарик", 10);
        generic.addProduct(p);
        generic.addProduct(wp);
        generic.addProduct(wpc);
        generic.addProduct(p2);
        generic.print();
    }
}
