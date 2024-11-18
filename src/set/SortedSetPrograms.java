package set;

import java.sql.SQLOutput;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPrograms {
    public static void main(String[] args) {
        SortedSet<Character> sort = new TreeSet<>();

        sort.add('A');
        sort.add('B');
        sort.add('P');
        sort.add('D');
        sort.add('E');

        System.out.println("Print the SortedSet: "+sort+" ");
        sort.remove('D');
        System.out.println("After removing: "+sort);
        Character c = sort.first();
        System.out.println("Character is: "+c);

        System.out.println("HeadSet is:  "+sort.headSet('B'));
        System.out.println("TailsSet is: "+sort.tailSet('E'));
        System.out.println("SubSet is: "+sort.subSet('A','E'));
    }
}
