package set;
import java.util.*;
public class HashSetPrograms {
    public static void main(String[] args) {
        /*
         1.HashSet is present in java.util package
         2.HashSet uses HashTable for Storage.
         3.HashSet extends AbstractList and implements Set interface.
         4.HashSet uses HashTable for storage.
         5.It is non-Synchronized.
         6.It does not maintain insertion order. because it uses hashcode for storage.
         7. It is best approach for searching.
         8.Default Capacity is 16.
         9.It stores unique values.
         10.allow single null value.
        */
        HashSet<String>set = new HashSet<String>();
        set.add("Abhishek"); // adding element
        set.add("Chirag");
        set.add("Om");
        set.add("Abhishek"); // ignore duplicate
        set.add("Parag");

        set.remove("om");

        HashSet<String>set1 = new HashSet<>();
        set1.add("Shantanu");
        set1.add("Tushar");
        set1.add("Om");

        HashSet<String>intersect = new HashSet<>(set);
        intersect.retainAll(set1);
        System.out.println("After intersecting set with set1");
        System.out.println(intersect);

        set.removeIf(str -> str.contains("Abhishek")); // removed element while checking condition.
//        set.clear();
        System.out.println("Printing an array");
        String[]arr = set.toArray(new String[set.size()]);
        for(String s1: arr)
        {
            System.out.print(s1+" ");
        }
        System.out.println();
        for(String s : set)
        {
            System.out.print(s+" ");
        }

    }
}
