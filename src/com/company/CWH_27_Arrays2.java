package com.company;

public class CWH_27_Arrays2 {
    public static void main(String[] args) {
        String [] students = {"Harry", "Samir", "Steve"};
        System.out.println(students.length);
        System.out.println(students[1]);

//        //Displaying the Array (naive way)
//        System.out.println(students[0]);
//        System.out.println(students[1]);
//        System.out.println(students[2]);

        // Displaying the Array (for loop)

        System.out.println("printing using 'for' loop");
        for (int i = 0; i<students.length; i++) {
            System.out.println(students[i]);    // -> Array Traversal
        }

        System.out.println("printing using 'for' loop in reverse order");
        for (int i = students.length -1; i>=0; i--) {
            System.out.println(students[i]);    // -> Array Traversal
        }

        // *******Displaying the Array (for-each loop)********
        System.out.println("printing the Array (for-each loop)");
        for (String element: students) {
            System.out.println(element);
        }

    }
}
