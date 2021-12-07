package me.mirotic.designpattern.structure.composite.after;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 */
public class BagAfter implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        this.components.add(component);
    }

    public List<Component> getComponents() {
        return this.components;
    }

    @Override
    public int getPrice() {
        return this.components.stream().mapToInt(Component::getPrice).sum();
    }
}
