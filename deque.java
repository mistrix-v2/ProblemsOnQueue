import java.util.*;
public class deque {
     

    public static void main(String args[]){
        Deque<Integer> deq = new LinkedList<>();
        deq.addFirst(1);
        deq.addFirst(2);
        deq.addLast(3);
        deq.remove();
        System.out.println(deq);
        System.out.println(deq.getFirst()+deq.getLast());
    }

}
