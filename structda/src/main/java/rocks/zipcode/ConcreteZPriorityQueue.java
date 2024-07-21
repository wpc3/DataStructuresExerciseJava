package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class ConcreteZPriorityQueue<E> implements ZPriorityQueue<E>{
   public static class QueItem<E>
   {
       E item;
       Integer priority;

       public QueItem(E item, Integer priority){
           this.item = item;
           this.priority = priority;
       }
   }

    ArrayDeque<QueItem<E>> pq = new ArrayDeque<>();
    @Override
    public void enqueue(E element, Integer priority) {
        // TODO Auto-generated method stub
    QueItem<E> pq2 = new QueItem<>(element,priority);
    pq.offer(pq2);


//        throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
    }

    @Override
    public E dequeue(Integer priority) {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
//       return pQ.remove(priority);
        QueItem<E> removal = null;
        for(QueItem<E> q : pq){
            if(q.priority.equals(priority)){
                pq.remove(q);
                removal=q;
                break;
            }
        }
        if(removal == null){
            throw new NoSuchElementException("Elements dont exist");
        }
        return removal.item;
    }

    @Override
    public E peek(Integer priority) {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'peek'");
        for(QueItem<E> q:pq){
            if(q.priority.equals(priority)){
                return q.item;
            }

        }
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
        return pq.size();
    }

    @Override
    public int size(Integer priority) {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
        int count =0;
        for(QueItem<E> q: pq){
            if (q.priority.equals(priority)){
                count++;
            }
        }

        return count;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
//
        return pq.isEmpty();
    }

}
