package com.company;

import java.util.HashSet;

public class CWH_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();    // Constructs a new, empty set; the backing HashMap instance has default initial capacity (16) and load factor (0.75).

        HashSet<Integer> myHashSet2 = new HashSet<>(5, 0.7f);   /* Constructs a new, empty set; the backing HashMap instance has the specified initial
                                                                                        capacity and the specified load factor.*/
        myHashSet2.add(6);
        System.out.println(myHashSet2);

        myHashSet2.add(8);              // by default, it will add at 0 index
        myHashSet2.add(3);
        myHashSet2.add(11);
        myHashSet2.add(60);
        System.out.println(myHashSet2);

    }
}
