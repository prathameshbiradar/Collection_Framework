package set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPrograms {

    public static void main(String[] args) {

        Set<Integer> li = new HashSet<Integer>() ;

        li.add(12);
        li.add(14);
        li.add(15);
        li.add(18);
        li.add(20);

        Set<Integer> li1 = new HashSet<>();
        li1.add(22);
        li1.add(18);
        li1.add(56);
        li1.add(60);
        li1.add(12);

        Set<Integer> union = new HashSet<Integer> (li);
        union.addAll(li1);
        System.out.println("Union of elements is: ");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(li);
        intersection.retainAll(li1);
        System.out.println("Intersection of elements is: ");
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(li);
        difference.removeAll(li1);
        System.out.println("Difference of elements is: ");
        System.out.println(difference);

        Iterator itr = li.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }




    }
}
