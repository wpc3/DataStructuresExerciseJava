package rocks.zipcode;

import java.util.ArrayDeque;

public class ZQueueImpl<E> implements ZQueue<E>{
    ArrayDeque<E> aq = new ArrayDeque<>();
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
       return aq.isEmpty();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
        return aq.size();
    }

    @Override
    public void enqueue(E element) {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
        aq.offer(element);

    }

    @Override
    public E dequeue() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
        return aq.remove();
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'peek'");
        return aq.peek();
    }

}
