package Day31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class list {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        List<Integer> l2 = new Vector<>();

        List<Integer> ll = new LinkedList<>();
        // ways to add the value
        ll.add(1);
        ll.addFirst(2);
        ll.addLast(5);
        ll.add(3);

        // the iterator we need to iterate over the container
        Iterator<Integer> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(ll.getLast());
        System.out.println(ll.getFirst());
        System.out.println(ll.removeFirst());
    }
}
