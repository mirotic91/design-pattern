package me.mirotic.designpattern.structure.composite.before;

import java.util.ArrayList;
import java.util.List;

public class BagBefore {

    private List<ItemBefore> items = new ArrayList<>();

    public void add(ItemBefore item) {
        this.items.add(item);
    }

    public List<ItemBefore> getItems() {
        return this.items;
    }

}
