import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer,Integer> m = new HashMap<Integer, Integer>();
        for (int i=0;i<1000;i++){
            int r=random.nextInt(20);
            Integer f = m.get(r);
            System.out.println(f);
            m.put(r,f==null?1:f+1);
        }
        System.out.println(m);
    }
}
