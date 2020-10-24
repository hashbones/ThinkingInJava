package concurrency;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {}
    public void remove(E element) {
        if (!queue.remove(element))
            throw new RuntimeException("Element wasn't found in WaitList");
    }
    public void moveToBack(E element) {
        if(queue.contains(element)) {
            queue.remove(element);
            queue.offer(element);
        } else
            throw new RuntimeException("Element wasn't found in WaitList");
    }
    public void moveToBack() {
        queue.offer(queue.remove());
    }
}
