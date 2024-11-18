package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class QueuePrograms {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        q.add("Rohit");
        q.add("Virat");
        q.add("Hardik");
        q.add("Shubhman");

        q.remove();
        System.out.println(q.poll());
        System.out.println(q.offer("Bumrah"));
        System.out.println(q);
    }
}
