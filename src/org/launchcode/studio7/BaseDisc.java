package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;
    private ArrayList<String> contents;

    public BaseDisc(String aName, int aStorageCapacity, String aDiskType, int aCapacityUsed){
        name = aName;
        storageCapacity = aStorageCapacity;
        diskType = aDiskType;
        capacityUsed = checkCapacity(aCapacityUsed);
        remainingCapacity = spaceLeft();
    }
    private int checkCapacity(int dataWritten){
        if (storageCapacity < dataWritten){
            return storageCapacity;
        }
        return dataWritten;
    }
    private int spaceLeft(){
        return storageCapacity - capacityUsed;
    }
    public String diskInfo(){
        String output = String.format("\nDisk name: %s\nMax capacity:%d" +
               "\nSpace used : %d" +
                "\nAvailable space: %d\n", name, storageCapacity,capacityUsed, remainingCapacity);
        return output;
    }
    public String writeData(int dataSize){
        if(dataSize > remainingCapacity){
            return "Not enough disk enough";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;
        return "data written to disc. Remaining space = " + remainingCapacity;
    }
}
