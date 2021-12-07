package me.mirotic.designpattern.structure.composite.before;


public class ItemBefore {

    private String name;

    private int price;

    public ItemBefore(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

}
