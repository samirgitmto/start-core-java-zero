package com.company;

public class CWH_09_OperatorsAssociativity {
    public static void main(String[] args) {
        //Precedence & Associativity
        int a = 6*5-34/2;
        /*
        Please note that BODMAS rule is not the reason for correct answer.
        Highest precedence goes to * and /. They are then evaluated on the basis of Left to Right Associativity
              = 30 - 34/2
              = 30 - 17
              = 13
         */
        int b = 60/5-34*2;
        /*
              = 12 - 34*2
              = 12 - 68
              = -56
         */
        System.out.println(a);
        System.out.println(b);
        //Quick Quiz
        int x = 1;
        int y = 4;
        int z = 5;
        //int k = y*y - 4*x*z/2*x; //Answer is 6
        int k = (y*y) - 4*x*z/(2*x);
        System.out.println(k);
    }
}
