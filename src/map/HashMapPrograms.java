package map;
import java.util.*;
public class HashMapPrograms {
    public static void main(String[] args) {

        HashMap<Integer,String>hm = new HashMap<>();
        Set<Integer>s=new HashSet<>();

        hm.put(1,"Rohit");
        hm.putIfAbsent(2,"Virat");
        hm.put(3,"Shubhman");
        hm.put(4,"Surya");


        String oldValue = hm.put(2,"Yashaswi");
        System.out.println("The old value in the key '2' is: "+oldValue);

        s = hm.keySet();
        System.out.println(s);

        String name = hm.get(3);
        System.out.println(name);

        System.out.println("HashCode is: "+hm.hashCode());

        System.out.println("Is Surya present in the Map: "+hm.containsValue("Surya"));
        System.out.println("Is 5 present as a key: "+hm.containsKey(5));
        for(Map.Entry<Integer,String> e : hm.entrySet())
        {
            System.out.println("The key is: "+e.getKey()+" and Value is: "+e.getValue());
        }
    }
}
