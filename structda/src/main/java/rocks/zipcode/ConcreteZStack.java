package rocks.zipcode;

import java.util.ArrayDeque;

public class ConcreteZStack<E> implements ZStack<E>{

    ArrayDeque<E> aq = new ArrayDeque<>();

    @Override
    public void push(E item) {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'push'");
        aq.push(item);
    }

    @Override
    public E pop() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'pop'");
       return aq.pop();
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'peek'");
      return   aq.peek();
    }

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

}
