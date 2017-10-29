import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListFeatures {

    public static void main(String[] args) {
        Random random = new Random(47);
        List<String>list=new ArrayList<String>();
        list.add("cat");
        list.add("dog");
        list.add("pig");

        List<String>copy= Arrays.asList(list.get(0),list.get(2));
        System.out.println(copy);
        list.removeAll(copy);
        System.out.println(list);
        list.addAll(copy);
        System.out.println(list);


    }

}
