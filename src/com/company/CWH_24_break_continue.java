package com.company;

public class CWH_24_break_continue {
    public static void main(String[] args) {
        // Break and Continue using loops

//        for (int i=0; i<5; i++) {
//            System.out.println(i);
//            System.out.println("Java is great");
//        }
        // Using for loop
        for (int i=0; i<5; i++) {      // Break and Continue using loops
            System.out.print(i+" ");
            System.out.print("Java is great  ");
            if (i==2){
                System.out.println("Ending the loop");
                break;  //at i=2, the program exits the loop and print the ending line after the loop.
            }
        }
        System.out.println("Loops end here\n");

        // using while loop
        int j = 0;
        while(j<5) {
            System.out.print(j);
            System.out.print(" Great Java  ");
            if(j==2) {
                System.out.println("Ending the loop");
                break;
            }
            j++;
        }
        System.out.println("Loops end here");

        // using do-while loop
        int k=0;
        do {
            System.out.print(k);
            System.out.print(" Java  ");
            if (k==2) {
                System.out.println("Ending the loop");
                break;
            }
            k++;
        } while (k<5);
        System.out.println("Loops end here 'do-while' loop with break");

        //using Continue

        /*
        int y=0;
        do {
            System.out.print(y);
            y++;
            System.out.print(" Java  ");
            if (y==2) {
                System.out.println("Ending the loop");
                continue;
            }
        } while (y<5);
        System.out.println("Loops end here for do-while loop with continue");  */
        System.out.println(" ");
        int y=0;
        do {
            y++;
            if (y==2) {
                System.out.println("Ending the loop");
                continue;                                // this will return the loop back from from the start.
            }
            System.out.print(y);
            System.out.print(" Java  ");
        } while (y<5);     //y=5 executed bcoz y++ is in precedence
        System.out.println("Loops end here for do-while loop with continue \n");



        for (int x=0; x<5; x++) {      // Continue using loops. Note the break & continue difference
            if (x==2){                 // Continue given at x==2
                System.out.println("Ending the loop");
                continue;              // so at x==2, from this line, the program won't run the succeeding code and will simply "continue" to the next iteration in loop i.e. x=3
            }
            System.out.print(x+" ");
            System.out.print("Java is great  ");
        }
        System.out.println("Loops end here for 'for' loop with continue");
    }
}
