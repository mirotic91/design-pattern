package me.mirotic.designpattern.structure.flyweight.after;

import java.util.HashMap;
import java.util.Map;


public class ExtraFactory {

    private Map<Integer, Extra> cache = new HashMap<>();

    public Extra getExtra(Integer age) {
        if (cache.containsKey(age)) {
            return cache.get(age);
        }

        Extra extra = new Extra(age);
        cache.put(age, extra);
        return extra;
    }
}
