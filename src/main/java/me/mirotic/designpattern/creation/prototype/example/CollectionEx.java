package me.mirotic.designpattern.creation.prototype.example;


import java.util.ArrayList;
import java.util.List;


public class CollectionEx {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("zzz");
        arrayList.forEach(System.out::println);

        ArrayList<String> cloneArrayList = (ArrayList<String>) arrayList.clone();
        cloneArrayList.forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("zzz");
        list.forEach(System.out::println);

        List<String> cloneList = new ArrayList<>(list);
        cloneList.forEach(System.out::println);
    }
}
