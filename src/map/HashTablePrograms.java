package map;
import java.util.*;

public class HashTablePrograms {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();

        ht.put(1,"100");
        ht.put(2,"200");
        ht.put(3,"300");

        Enumeration<String>enu = ht.elements();
        while ((enu.hasMoreElements()))
        {
            System.out.println(enu.nextElement());
        }
    }
}
