package rocks.zipcode;

public interface ZStack<T> {

    // Pushes an element onto the top of the stack
    void push(T item);

    // Removes and returns the top element from the stack, or null if the stack is empty
    T pop();

    // Returns the top element without removing it, or null if the stack is empty
    T peek();

    // Checks whether the stack is empty
    boolean isEmpty();

    // Returns the number of elements in the stack
    int size();
}

