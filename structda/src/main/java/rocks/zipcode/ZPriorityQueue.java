package rocks.zipcode;

public interface ZPriorityQueue<E> {
    /**
     * Inserts the specified element into this priority queue.
     *
     * @param element the element to add
     */
    void enqueue(E element, Integer priority);

    /**
     * Retrieves and removes the highest priority element from this priority queue.
     *
     * @return the highest priority element
     * @throws NoSuchElementException if this priority queue is empty
     */
    E dequeue(Integer priority);

    /**
     * Retrieves, but does not remove, the highest priority element from this priority queue.
     *
     * @return the highest priority element
     * @throws NoSuchElementException if this priority queue is empty
     */
    E peek(Integer priority);

    /**
     * Returns the number of elements in this priority queue.
     *
     * @return the number of elements in this priority queue
     */
    int size();

    /**
     * Returns the number of elements at this priority in the queue.
     *
     * @return the number of elements at this priority
     */
    int size(Integer priority);

    /**
     * Returns true if this priority queue contains no elements.
     *
     * @return true if this priority queue is empty, false otherwise
     */
    boolean isEmpty();
}

