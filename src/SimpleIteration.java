import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("cat");
        list.add("dog");
        list.add("pig");

        Iterator<String>it=list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        for (String s :
                list) {
            System.out.println(s);
        }

        it=list.iterator();
        for (int i = 0; i < 2; i++) {
//            it.next();
            it.remove();
        }
        System.out.println(list);


    }
}
