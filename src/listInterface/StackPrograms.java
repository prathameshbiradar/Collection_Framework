package listInterface;

import java.util.Stack;

public class StackPrograms {
    public static void main(String[] args) {

        Stack stk = new Stack();
        stk.push(1);
        stk.push("Akshay");
        stk.push("India");

        boolean result = stk.empty();
        System.out.println(result);
        int weight = stk.size();
        System.out.println("Size of the stack is: "+weight);
        int index =stk.search("Akshay");
        System.out.println("Akshay is present at index: "+index);
        stk.pop();
        Object obj = stk.peek();
        System.out.println("Element at the top of the stack is: "+obj);
        if(!stk.isEmpty())
        {
            System.out.println(stk.peek());
        }
//        ListIterator li = stk.listIterator(stk.size());
//        while(li.hasPrevious())
//        {
//            Object obj1= li.previous();
//            System.out.print(obj+" ");
//        }
        for(int i=0;i<stk.size();i++)
        {
            System.out.print(stk.get(i)+" ");
        }

    }
}
