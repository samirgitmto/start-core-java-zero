package com.company;
import java.util.*;

public class CWH_92_Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l1.add(6);       // initial array
        l1.add(7);
        l1.add(4);
        l1.add(6);
        // adding elements at specified index: notice the increase in array length
        l1.add(0, 5);
        l1.addFirst(400);          // slightly different than ArrayList.
        l1.addLast(1);

//        l1.addAll(l2);  // all the new array elements have been added to original array l1 and will have the succeeding indices.
        System.out.println("The linked list l1 is: ");

        for (int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }
    }
}
