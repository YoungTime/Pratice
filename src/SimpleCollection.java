import java.util.*;

public class SimpleCollection {

    public static void main(String[] args) {
        Collection<Integer>num=new ArrayList<Integer>();
        Set<Integer>num1= new LinkedHashSet<Integer>();


       num= Arrays.asList(10,1,20,30,6);

       Collections.addAll(num1,10,1,20,30,5);
       num1.addAll(num);
       num.add(5);

        for (Integer a:num){
            System.out.print(a);
        }
        System.out.println();
        for (Integer a: num1
             ) {
            System.out.print(a);
        }
    }

}
