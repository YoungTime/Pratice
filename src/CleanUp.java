import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CleanUp {

    public static void main(String[] args) {
        try{
            InputFile in = new InputFile("CleanUp.java");
            try{
                String s;
                int i = 1;
                while ((s=in.getLine())!=null){
                }
            }catch (Exception e){
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            }finally {
                in.dispose();
            }
        }catch (Exception e){
            System.out.println("InputFile construction failed");
        }
    }

}
 class InputFile {
    private BufferedReader in;
    public InputFile(String fileName) throws Exception{
        try {
            in = new BufferedReader(new FileReader(fileName));
        }catch (FileNotFoundException e){
            System.out.println("Count not open "+fileName);
            throw e;
        }catch (Exception e){
            try {
                in.close();
            }catch (IOException e1){
                System.out.println("in.close() unsuccessful");
            }
            throw e;
        }finally {

        }
    }

    public String getLine(){
        String s;
        try{
            s=in.readLine();
        }catch (IOException e){
            throw new RuntimeException("readline() failed");
        }
        return s;
    }
    public void dispose(){
        try{
            in.close();
            System.out.println("dispose() failed");
        }catch (IOException e){
            throw new RuntimeException("in.close() failed");
        }
    }

}


