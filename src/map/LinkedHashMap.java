package map;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap <Integer, String> lm = new java.util.LinkedHashMap<>();

        lm.put(1,"Aditya");
        lm.put(2,"Chirag");
        lm.put(3,"Aditya");
        lm.put(3,"Abhishek");

        System.out.println("size of LinkedHashMap is: "+lm.size());
        System.out.println("is list empty: "+lm.isEmpty());



        for(Map.Entry<Integer,String> e: lm.entrySet())
        {
            System.out.println("Key is: "+e.getKey()+ " Value is: "+e.getValue());
        }
    }
}
