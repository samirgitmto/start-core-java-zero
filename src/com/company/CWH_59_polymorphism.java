package com.company;

interface MyCamera2 {                   // implementing an interface forces method implementation.
    void takeSnap();                             // note that various features of phone have been called as interfaces and its variant like smartphone as sub class.
    public void recordVideo();
    private void greets() {
        System.out.println("Good Morning");
    }
    default void record4KVideo() {
        greets();
        System.out.println("recording in 4k....");
    }
}
interface MyWifi2 {
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2 {
    void callNumber(int phoneNumber) { System.out.println("Calling " + phoneNumber); }
    void pickCall() { System.out.println("Connecting...."); }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2 {
    public void takeSnap() { System.out.println("taking snap"); }
    public void recordVideo() { System.out.println("recording video"); }

    public String[] getNetworks() {
        System.out.println("getting list of networks");
        String[] networkList = {"Ferry", "Harry", "Marry"};
        return networkList;
    }
    public void connectToNetwork(String network) { System.out.println("connecting to " + network); }
}

public class CWH_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam2 = new MySmartPhone2();      // the object is smartphone, but use it as a Camera
//        cam2.getNetworks();        -- error: not allowed for good
        cam2.record4KVideo();        // jiska reference hoga, uska hi method chalega.

        System.out.println("");
        MySmartPhone2 ms2 = new MySmartPhone2();        // since the object referred as smartphone, it will execute every method.
        ms2.recordVideo();
        ms2.record4KVideo();
        ms2.callNumber(1234);
        ms2.getNetworks();
        ms2.connectToNetwork("airtel");
    }
}
