package concurrency;

public class TestWaitList {
    public static void main(String[] args) {
        //test main WaitList
        WaitList<Integer> list1 = new WaitList<>();
        for(int i = 0; i < 10; i++)
            list1.add(i);
        System.out.println(list1);
        //test limited WaitList
        BoundedWaitList<Integer> bl = new BoundedWaitList<>(5);
        for(int i = 0; i < bl.getCapacity(); i++)
            bl.add(i);
        System.out.println(bl);
        //error if add more elements to limited list
        //bl.add(5);

        //test UnfairWaitList
        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        for (int i = 0; i < 10; i++)
            uwl.add(i);
        System.out.println(uwl);
        //remove element from the middle of the list
        uwl.remove(6);
        //error if element wasn't found
        //uwl.remove(11);
        //move fist element to the end of the list
        uwl.moveToBack();
        //move specific element to the end of the list
        uwl.moveToBack(3);
        System.out.println(uwl);
    }
}
