package me.mirotic.designpattern.creation.singleton;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SingletonTest {

    @Test
    void newInstance() {
        assertTrue(Foo1.getInstance() == Foo1.getInstance());
        assertTrue(Foo2.getInstance() == Foo2.getInstance());
        assertTrue(Foo3.getInstance() == Foo3.getInstance());
        assertTrue(Foo4.getInstance() == Foo4.getInstance());
        assertTrue(Foo5.getInstance() == Foo5.getInstance());
        assertTrue(Foo6.INSTANCE == Foo6.INSTANCE);
    }

    @Test
    void destroyByReflection() throws Exception {
        Constructor<Foo1> constructor1 = Foo1.class.getDeclaredConstructor();
        constructor1.setAccessible(true);
        Foo1 instance1 = constructor1.newInstance();

        assertFalse(instance1 == Foo1.getInstance());

        Constructor<Foo2> constructor2 = Foo2.class.getDeclaredConstructor();
        constructor2.setAccessible(true);
        Foo2 instance2 = constructor2.newInstance();

        assertFalse(instance2 == Foo2.getInstance());

        Constructor<Foo3> constructor3 = Foo3.class.getDeclaredConstructor();
        constructor3.setAccessible(true);
        Foo3 instance3 = constructor3.newInstance();

        assertFalse(instance3 == Foo3.getInstance());

        Constructor<Foo4> constructor4 = Foo4.class.getDeclaredConstructor();
        constructor4.setAccessible(true);
        Foo4 instance4 = constructor4.newInstance();

        assertFalse(instance4 == Foo4.getInstance());

        Constructor<Foo5> constructor5 = Foo5.class.getDeclaredConstructor();
        constructor5.setAccessible(true);
        Foo5 instance5 = constructor5.newInstance();

        assertFalse(instance5 == Foo5.getInstance());
    }

    @Test
    void recoveryFromReflection() {
        try {
            Constructor<Foo6> constructor = Foo6.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            constructor.newInstance();
        } catch (Exception ex) {
            assertEquals(ex.getClass(), NoSuchMethodException.class);
        }
    }

    @Test
    void destroyByDeserialization() throws Exception {
        Foo2 instance1 = Foo2.getInstance();
        Foo2 instance2;

        String filename = "foo.obj";
        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream(filename))) {
            output.writeObject(instance1);
        }

        try (ObjectInput input = new ObjectInputStream(new FileInputStream(filename))) {
            instance2 = (Foo2) input.readObject();
        }

        assertFalse(instance1 == instance2);
    }

    @Test
    void recoveryFromDeserialization() throws Exception {
        Foo5 instance1 = Foo5.getInstance();
        Foo5 instance2;

        String filename = "foo.obj";
        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream(filename))) {
            output.writeObject(instance1);
        }

        try (ObjectInput input = new ObjectInputStream(new FileInputStream(filename))) {
            instance2 = (Foo5) input.readObject();
        }

        assertTrue(instance1 == instance2);
    }

}