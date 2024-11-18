package listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListPrograms {
    public static void main(String[] args) {
    /*
        Arraylist extends AbstractList and implements List interface.
        1. ArrayList maintains insertion order
        2. Heterogenous values
        3.non-generic
        4.Allow Duplicate values
        5.Dynamic in size.when we insert element then automatically increase size.
        Methods:
        1.add(), addAll()
        2.get(),clear(),isEmpty(),lastIndexOf(),indexOf(),contain(),set(),remove(int index),removeAll(Collection c)
        3. retainAll()
    */
        ArrayList li = new ArrayList(); // creating ArrayList of non-generic type
        li.add(11); // add() method : added element in ArrayList.
        li.add("Aitya");
        li.add("Abhishek");
        li.add(11.11);

        ArrayList<String> li1 = new ArrayList<String>();// created a generic type ArrayList
        li1.add("Aditya");
        li1.add("Shantanu");
        li1.add("Chirag");
        li1.add("Om");
        li1.add("Aditya");
        li1.add("aditya");
        li1.add("Tushar");

        ArrayList<String>li2 = new ArrayList<String>();
        li2.add("Rupesh");
        li2.add("Akash");
        li2.add("Amar");

        System.out.println("Sorted list is : ");
        Collections.sort(li1);
        for (String a : li1)
        {
            System.out.print(a+" ");
        }
        System.out.println();


        li1.add(2,"Atharva"); // Added Specified element at particular index position
        System.out.println("List after adding Atharva: ");
        Iterator itr = li1.iterator(); // Iterator to iterate element in the collection.
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        li1.addAll(li2); // addAll() : used to add li2 at the end of the li1.
        System.out.println("List after adding list2 to list1: ");
        for(String s : li1) // enhanced for-loop to iterate the collection.
        {
            System.out.print(s+" ");
        }
        System.out.println();

        ArrayList<String> li3 = new ArrayList<>();
        li3.add("Akshay");
        li3.add("Nagesh");
        li1.addAll(1,li3);
        System.out.println("List after adding li3 in li1 from index 1.");
        for(int i=0;i<li1.size();i++) // for-loop to iterate the loop
        {
            System.out.print(li1.get(i)+" "); //
        }
        System.out.println();


        int index = li1.lastIndexOf("Aditya"); // find the index of last Occurance of specified element.
        System.out.println("Last index of Aditya is: "+index);

        int index1 = li1.indexOf("Aditya"); // find first occurance of specified element.
        System.out.println("First Occurance of Aditya is: "+index1);

        boolean isContain = li1.contains("Akshay"); //return boolean if contains an element.
        System.out.println("Akshay is present in the list: "+isContain);



        li1.removeAll(li3); // remove li3 from li1 if present.
        for(int i=0;i<li1.size();i++) // for-loop to iterate the loop
        {
            System.out.print(li1.get(i)+" "); //
        }
        System.out.println();

        li1.set(7,"Rohit"); // replacing "Rohit" with element present at index 7
        for(int i=0;i<li1.size();i++) // for-loop to iterate the loop
        {
            System.out.print(li1.get(i)+" "); //
        }
        System.out.println();



        li1.clear(); // clear() : used to remove elements from arrayList
        System.out.println("The size of the li1 is: "+li1.size());

        if(li1.isEmpty())
        {
            System.out.println("li1 is Empty");
        }
        else {
            System.out.println("li is not Empty");
        }

    }
}