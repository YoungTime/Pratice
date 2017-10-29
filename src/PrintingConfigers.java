import java.util.*;

public class PrintingConfigers {
    static Collection fill(Collection<String> collection){

        collection.add("cat");
        collection.add("dog");
        collection.add("pig");
        return collection;
    }

    static Map fill(Map<String,String> map){
        map.put("cat","Bob");
        map.put("dog","Sam");
        map.put("pig","Pih");
        return map;
    }


    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String,String>()));
        System.out.println(fill(new TreeMap<String,String>()));
        System.out.println(fill(new LinkedHashMap<String,String>()));
    }
}
