package com.company;                                   // package

class Guy {                                            // class
    private String identity;                           //

    public Guy() {                                     // Constructor
        identity = "Saamir";
    }

    public String getIdentity() {                      // getters
        return identity;
    }

    public void setIdentity(String identity) {         // setters
        this.identity = identity;
    }
}

public class CWH_40_44_Basics_AccessModConstructors {
    public static void main(String[] args) {          // function
        Guy bro = new Guy();                          // object creation
        System.out.println(bro.getIdentity());
    }
}

