package com.company;

public class CWH_16_Conditionals {
    public static void main(String[] args) {
        // If - Else Statement applicable in almost all other languages
        int age = 17;       //age is assigned 17 ; not just equals to
        if(age>18){              //true condition
            System.out.println("Yes you can drive!");
        }
        else{                    //false condition
            System.out.println("No boy you cannot drive yet");
        }
        int age2 = 17;
        if(age2>18){
            System.out.println("Yes you can drive!");
        }
//        else{                 //not necessary
//            System.out.println("No boy you cannot drive yet");
//        }

        //Relational Operators
        int age3 = 18;       //Assignment age is assigned 17 ; not just equals to
        if(age3==18){              //Equality Check by double equals to sign
            System.out.println("Yes you can drive!");
        }
        else{                    //false condition
            System.out.println("No boy you cannot drive yet");
        }

        int age4 = 18;
        boolean cond = (age==18);
        if(cond){
            System.out.println("Yes you can drive!");
        }
        else{
            System.out.println("Not yet");
        }
            }
}
