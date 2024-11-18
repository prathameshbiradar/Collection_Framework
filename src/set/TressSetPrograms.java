package set;

import java.util.TreeSet;
import java.util.*;

public class TressSetPrograms {
    public static void main(String[] args) {
        TreeSet<Integer>tr =new TreeSet<>();
        tr.add(1);
        tr.add(65);
        tr.add(76);
        tr.add(33);
        tr.add(75);
        System.out.println("Tree set is: "+tr);
        System.out.println(tr.pollFirst());
        System.out.println(tr.pollLast());
        System.out.println("Tree set is: "+tr);
        System.out.println(tr.lower(60));
        System.out.println(tr.higher(60));
        System.out.println(tr.descendingSet());
        System.out.println(tr.size());
        System.out.println(tr.isEmpty());

    }
}
