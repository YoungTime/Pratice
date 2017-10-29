import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("cat");
        list.add("pig");
        list.add("dog");

        System.out.println(list.getFirst());
        System.out.println(list.element());
        System.out.println(list.offer("monkey"));
        System.out.println(list);
        System.out.println(list.peek());

    }
}
