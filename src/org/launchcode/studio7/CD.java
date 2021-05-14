package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String aName, int aStorageCapacity, String aDiskType, int aCapacityUsed) {
        super(aName, aStorageCapacity, aDiskType, aCapacityUsed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A cd spins at a rate between 200-500 rpm");
    }

    @Override
    public void readData() {
        System.out.println("leave the door open");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
