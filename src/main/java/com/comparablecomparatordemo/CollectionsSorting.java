package com.comparablecomparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {

    public static void main (String [] args) {

        List<String> wordList = new ArrayList<>();
        wordList.add("banana");
        wordList.add("guava");
        wordList.add("apple");
        wordList.add("date");
        wordList.add("cherry");

        System.out.println("Original list : ");

        wordList.forEach(System.out::println);

        Collections.sort(wordList);
        System.out.println("Sorted list : ");

        wordList.forEach(System.out::println);

    }

}
