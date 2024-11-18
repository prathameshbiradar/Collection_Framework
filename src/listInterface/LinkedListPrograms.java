package listInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class LinkedListPrograms {
    public static void main(String[] args) {
        /*
            Linked list uses Doubly Linked List to store elements.
            It inherits abstractList class and implements List and Deque interface.

            Key Points :
            1.Allows duplicate Elements.
            2.Maintains insertion order.
            3.automatically grows and shrinks in size.
            4.Manipulation is faster than ArrayList because no shifting is required of elements.
        */

        LinkedList<String> li = new LinkedList<String>();
        li.add("Prathmesh");
        li.add(1,"Abhishek");
        li.add("Mahesh");
        li.add("Sanket");
        li.addLast("Rushikesh");
        li.addFirst("Vaibhav");
        li.add(5,"Hardik");
        li.add(7,"Abhishek");

        System.out.println("Elements in the list are: ");
        for(String li1 : li ){
            System.out.print(li1+" ");
        }
        System.out.println();

        LinkedList<String> li1 = new LinkedList<>();
        li1.add("Rohit");
        li1.add("Virat");
        li1.add("Yashsvi");
        li1.add("Hardik");
        System.out.println("Elements in the list1 are: ");
        for(String s: li1)
        {
            System.out.print(s+" ");
        }
        System.out.println();

        li.addAll(li1);
        System.out.println("li1 is added in li: ");
        Iterator itr = li.iterator(); // used to iterate the element
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        System.out.println("Printing the list in reverse order");
        Iterator i = li.descendingIterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        System.out.println();

        System.out.print("Last element in the list is: ");
        System.out.println(li.getLast());
        System.out.print("First element in the list is: ");
        System.out.println(li.getFirst());

        System.out.println("FIRST ELEMENT IS: "+li.peekFirst());
        System.out.println("retrieve and remove first element in the list: "+li.pollFirst());

        li.removeFirstOccurrence("Hardik");
        li.removeLastOccurrence("Abhishek");
        li.pop();
        Collections.sort(li);
        for(String s: li)
        {
            System.out.print(s+" ");
        }
        System.out.println();

        /*
            Methods in LinkedList are:
            add(),addAll(Collection c),get(),getFirst(),getLast(),peek(),poll(),offer(),offerFirst(),offerLast(),
            add(int index,Element e),descendingIterator()
        */





    }
}
