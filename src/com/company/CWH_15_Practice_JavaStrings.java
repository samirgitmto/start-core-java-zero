package com.company;

public class CWH_15_Practice_JavaStrings {
    public static void main(String[] args) {
        // Que 1
        String name = "Steve Gerrard";
        name = name.toLowerCase();
        System.out.println(name);

        // Que 2
        String text = "To Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Que 3
        String letter = "Dear <|Name|>, thanks a lot!";
        letter = letter.replace("<|Name|>", "Steve");
        System.out.println(letter);

        // Que 4
        String mystring = "This  string   may contains spaces";
        System.out.println(mystring.indexOf("  "));   //double space
        System.out.println(mystring.indexOf("   "));  //triple space
        System.out.println(mystring.indexOf("    ")); //quad space

        //Que 5
        String myletter = "Dear Steve,\n\tThis Java Course is Nice.\n\tThanks!";
        System.out.println(myletter);

    }
}
