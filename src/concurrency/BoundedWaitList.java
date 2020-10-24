package concurrency;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    public BoundedWaitList(int capacity) {this.capacity = capacity;}
    public int getCapacity() {return capacity;}
    public void add(E element) {
        if (queue.size() >= capacity) {
            throw new RuntimeException("There's a limit of " + capacity + " members for this WaitList!");
        } else
            queue.add(element);
    }
    public String toString() {return super.toString();}
}
