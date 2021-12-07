package me.mirotic.designpattern.structure.composite.after;

/**
 * Leaf
 */
public class ItemAfter implements Component {

    private String name;

    private int price;

    public ItemAfter(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
