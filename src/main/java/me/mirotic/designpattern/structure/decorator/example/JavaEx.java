package me.mirotic.designpattern.structure.decorator.example;

import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class JavaEx {

    public static void main(String[] args) {

        // Collections 제공하는 데코레이터 메소드
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(new Book());

        List bookList = Collections.checkedList(arrayList, Book.class);
        // bookList.add(new Item());
        bookList.add(new Book());

        List unmodifiableList = Collections.unmodifiableList(arrayList);
        // unmodifiableList.add(new Item());
        arrayList.add(new Item());

        // 서블릿 요청 또는 응답 랩퍼
        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }


    private static class Book {

    }

    private static class Item {

    }
}
