import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FirstException {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        FirstException exception = new FirstException();
        SimpleException se=new SimpleException();
        se.initCause(new NullPointerException());
        try{
            exception.f();
        }catch (SimpleException e){
            throw  new RuntimeException(e);
        }
    }

}


class SimpleException extends Exception{}