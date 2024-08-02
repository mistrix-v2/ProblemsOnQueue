import java.util.*;
public class interleave {
    public static Queue<Integer> interleavehalves(Queue<Integer> q){
        int n= q.size()/2;
        Queue<Integer> q2 = new LinkedList<>();
        for ( int i=0;i<n;i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        return q;
    }
    public static void main(String args[]){
     Queue<Integer> q = new LinkedList<>();
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);
     q.add(5);
     q.add(6);
     q.add(7);
     q.add(8);
     q.add(9);
     q.add(10);
     interleavehalves(q);
    }
}
