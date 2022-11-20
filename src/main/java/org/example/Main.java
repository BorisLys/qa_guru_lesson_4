package org.example;

public class Main {
    public static void outOfMemory(){
        byte value1 = 127;
        byte value2 = 2;
        byte result = (byte) (value1 + value2);
        System.out.println(result + "\n");
    }

    public static void combinationsDataTypes(){
        double valueFloat = 100.025f;
        int valueInt = 200;
        valueFloat = valueFloat + valueInt;
        valueInt = (int)(valueFloat);
        System.out.println(valueInt);
    }

    public static void main(String[] args) {
        outOfMemory();
        combinationsDataTypes();
    }
}