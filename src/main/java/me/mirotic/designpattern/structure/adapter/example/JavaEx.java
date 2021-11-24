package me.mirotic.designpattern.structure.adapter.example;

import java.io.*;
import java.util.*;


public class JavaEx {

    public static void main(String[] args) {

        // collections
        List<String> strings = Arrays.asList("a", "t", "z");
        Enumeration<String> enumeration = Collections.enumeration(strings);
        ArrayList<String> list = Collections.list(enumeration);
        list.forEach(System.out::println);

        // io
        try (InputStream is = new FileInputStream("src/main/java/me/mirotic/designpattern/structure/adapter/example/input.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader reader = new BufferedReader(isr)) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
