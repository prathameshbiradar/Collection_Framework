package listInterface;

import java.util.Vector;

public class VectorPrograms {
    public static void main(String[] args) {

        Vector vec = new Vector(); //Defined Vector
        vec.add("Tushar"); //added element in vector
        vec.addElement("Prakash");
        vec.add(1);
        vec.add(2,"Aditya");

        Vector <String> vec1 = new Vector<>(); // Defined another vector
        vec1.add("Akshay");
        vec1.add("Sharad");


        vec.addAll(2,vec1);
        int cap = vec.capacity(); // find capacity of vector
        System.out.println("Initial Capacity of Vector is: "+cap);
        Object ob = vec.elementAt(3); // method to find element at index3.
        System.out.println("Element at index is: "+ob);
        Object ob1= vec.firstElement();
        vec.removeElementAt(3);
        vec.removeAll(vec1);



        int index = vec.lastIndexOf("Tushar");
        System.out.println("Index of Tushar is: "+index);
        if(vec.isEmpty())
        {
            System.out.println("List is empty");
        }
        else {
            System.out.println(vec.get(1));
        }

        System.out.println("First element is: "+ob1);
        for(Object s: vec)
        {
            System.out.print(s+" ");
        }
        System.out.println();
        Object[] arr = vec.toArray(new Object[vec.size()]);
        System.out.print("Array elements are: ");
        for(Object o : arr)
        {
            System.out.print(o+" ");
        }
        System.out.println();
        Vector vec3 = new Vector();

        System.out.println();
        System.out.println("Element in list are: ");
//        ListIterator li = vec.listIterator();
//        while(li.hasPrevious())
//        {
//            System.out.print("Index is: "+li.previousIndex()+" and Element is: "+li.previous());
//        }



    }
}
