package com.company;

public class CWH_14_String_methods {
    public static void main(String[] args) {
        String a = new String("Harry");
//        String name = "Harry";
//        int value = name.length();
        //String a = "Harry";
        /*
        int b = a.length(); //Index always starts from 0
        System.out.println(b);

        String lstring = a.toLowerCase();  //Return lowercase
        System.out.println(lstring);
        String ustring = a.toUpperCase();  //Return uppercase
        System.out.println(ustring);

        //However original String reamins unchanged; immutable

        String nonTrimmedString = "    Harry    ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();  //remove spaces
        System.out.println(trimmedString);

        // name.substring(int start, int end);
        System.out.println(a.substring(2));   //start from a particular index/position
        System.out.println(a.substring(1,4)); //do not include the ending index

        // name.replace('char a', 'char b');
        System.out.println(a.replace('r', 'p'));
        System.out.println(a.replace("rry", "ier"));
        System.out.println(a.replace("r", "ier"));

        //name.startsWith("Par")         //name.endsWith("ry")
        System.out.println(a.startsWith("Har"));
        System.out.println(a.endsWith("y"));

        // name.charAt(1)  = a in Harry
        System.out.println(a.charAt(2));

        //name.indexOf(a)  = 1 in Harry
        System.out.println(a.indexOf("a"));
        System.out.println(a.indexOf("ry"));  //reads the 1st one only
        System.out.println(a.indexOf("y"));

        String modifiedName = "Harrysry";
        System.out.println(modifiedName.indexOf("s", 3));  //Check it later
        */

        // name.equals("Harry"); true
        System.out.println(a.equals("Harry"));
        System.out.println(a.equalsIgnoreCase("harry"));

        // Escape Sequence
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \\ double quote");
        System.out.println("I am escape sequence \n double quote");
        System.out.println("I am escape sequence \t double quote");
    }
}
