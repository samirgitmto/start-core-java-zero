package com.company;

interface MyCamera {           // interfaces can have both default & static methods.
    void takeSnap();              // Static method is not associated with an object. It is associated either with a class or an interface.
    public void recordVideo();
    private void greets() {                   // it can't be accessed directly. However, can be accessed by putting its method in the default method.
        System.out.println("Good Morning");
    }
    default void record4KVideo() {      // Default methods enable us to add new functionality to existing interfaces, without the need to updated it in subclasses.
        greets();
        System.out.println("recording in 4k....");
    }
}
interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone {
   void callNumber(int phoneNumber) { System.out.println("Calling " + phoneNumber); }
   void pickCall() { System.out.println("Connecting...."); }
}
class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {
    public void takeSnap() { System.out.println("taking snap"); }
    public void recordVideo() { System.out.println("recording video"); }
//    public void record4KVideo() {      // Overriding: default method in interface won't be executed. Overridden method will be executed now.
//        System.out.println("taking snap recording in 4k....");
//    }
    public String[] getNetworks() {
        System.out.println("getting list of networks");
        String[] networkList = {"Ferry", "Harry", "Marry"};
        return networkList;
    }
    public void connectToNetwork(String network) { System.out.println("connecting to " + network); }
}
public class CWH_57_interfacesDefaultMethods_examples {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();                  // it is executing the overriden method now
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}
