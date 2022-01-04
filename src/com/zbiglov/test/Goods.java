package com.zbiglov.test;

public class Goods {
    private String name;
    private double price;
    private int quantity;
    private int barcode;
    private String date;
    private int totalSoldPcs;
    private double totalSoldAmount;

    public Goods(String name, double price, int quantity, int barcode, String date) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.barcode = barcode;
        this.date = date;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void buy(int quantity) {
        this.quantity = this.quantity - quantity;
        totalSoldPcs = totalSoldPcs + quantity;
        totalSoldAmount = totalSoldAmount + (price * quantity);
        System.out.println("Продано: " + getName() + " в количестве: " + quantity);
    }

    public void info() {
        System.out.println("Всего продано: " + totalSoldPcs + " ед. товара на общую сумму: " + totalSoldAmount);
    }
}
