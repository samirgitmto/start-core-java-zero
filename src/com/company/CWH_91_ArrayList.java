package com.company;
import java.util.*;

public class CWH_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l1.add(6);       // initial array
        l1.add(7);
        l1.add(4);
        l1.add(6);
        // adding elements at specified index: notice the increase in array length
        l1.add(0, 5);
        l1.add(0, 1);

        l1.addAll(l2);  // all the new array elements have been added to original array l1 and will have the succeeding indices.
//        l1.clear();     // will delete all the elements of array 1.
        System.out.println("The array l1 is: ");
        System.out.println(l1.contains(7));     // will return true or false based on their presence
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));         // will take index of the first 6 in array
        System.out.println(l1.lastIndexOf(6));  // will take index of the last 6 in array
        l1.remove(2);        // will delete the element specified by index
        l1.set(2, 566);            // will remove the original value at index 2 and set a new value of 566 at the same index.

        for (int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }
    }
}
