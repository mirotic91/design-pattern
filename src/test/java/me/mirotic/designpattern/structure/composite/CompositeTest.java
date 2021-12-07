package me.mirotic.designpattern.structure.composite;

import me.mirotic.designpattern.structure.composite.after.BagAfter;
import me.mirotic.designpattern.structure.composite.after.Component;
import me.mirotic.designpattern.structure.composite.after.ItemAfter;
import me.mirotic.designpattern.structure.composite.before.BagBefore;
import me.mirotic.designpattern.structure.composite.before.ItemBefore;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CompositeTest {

    @Test
    void before() {
        ItemBefore wallet = new ItemBefore("wallet", 100_000);
        ItemBefore book = new ItemBefore("book", 30_000);

        printPrice(wallet);
        printPrice(book);

        BagBefore bag = new BagBefore();
        bag.add(wallet);
        bag.add(book);

        printPrice(bag);

        int insideBagPrice = bag.getItems().stream().mapToInt(ItemBefore::getPrice).sum();
        assertThat(insideBagPrice).isEqualTo(wallet.getPrice() + book.getPrice());
    }

    public void printPrice(ItemBefore item) {
        System.out.println(item.getPrice());
    }

    public void printPrice(BagBefore bag) {
        int sum = bag.getItems().stream().mapToInt(ItemBefore::getPrice).sum();
        System.out.println(sum);
    }


    @Test
    void after() {
        ItemAfter wallet = new ItemAfter("wallet", 100_000);
        ItemAfter book = new ItemAfter("book", 30_000);

        printPrice(wallet);
        printPrice(book);

        BagAfter bag = new BagAfter();
        bag.add(wallet);
        bag.add(book);

        printPrice(bag);

        int insideBagPrice = bag.getComponents().stream().mapToInt(Component::getPrice).sum();
        assertThat(insideBagPrice).isEqualTo(wallet.getPrice() + book.getPrice());
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }

}