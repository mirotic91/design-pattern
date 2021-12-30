package me.mirotic.designpattern.structure.flyweight;

import me.mirotic.designpattern.structure.flyweight.after.ExtraFactory;
import me.mirotic.designpattern.structure.flyweight.after.Player;
import me.mirotic.designpattern.structure.flyweight.before.Student;
import org.junit.jupiter.api.Test;

class FlyweightTest {

    @Test
    void before() {
        System.out.println(new Student("saka", 15, "elementary"));
        System.out.println(new Student("laka", 17, "middle"));
        System.out.println(new Student("zhaka", 17, "middle"));
    }

    @Test
    void after() {
        ExtraFactory extraFactory = new ExtraFactory();
        System.out.println(new Player("saka", extraFactory.getExtra(15)));
        System.out.println(new Player("laka", extraFactory.getExtra(17)));
        System.out.println(new Player("zhaka", extraFactory.getExtra(17)));
    }
}