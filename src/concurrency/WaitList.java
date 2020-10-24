package concurrency;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    public Queue<E> queue;
    public WaitList() {queue = new ConcurrentLinkedQueue<>();}
    public WaitList(Collection<E> c) {queue = new ConcurrentLinkedQueue<>(c);}
    public void add(E element) {
        queue.add(element);
    }
    public E remove() {
        return queue.remove();
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public boolean contains(E element) {
        return queue.contains(element);
    }
    public boolean containsAll(Collection<?> e) {
        return queue.containsAll(e);
    }
    public String toString() {return queue.toString();}
}
