package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("Silk Smita",700,"CD-RM", 350);
        DVD dvd = new DVD("The Princess Bride", 5000,"DVD-R", 1450);



        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeData(250));
        System.out.println(cd.diskInfo());

        // TODO: Call each CD and DVD method to verify that they work as expected.


    }
}
