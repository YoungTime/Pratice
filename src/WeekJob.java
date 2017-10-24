import java.io.*;
import java.net.Socket;

public class WeekJob {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("123.206.130.39",8888);
            InputStream stream = socket.getInputStream();
//            InputStreamReader reader = new InputStreamReader(stream);
//            BufferedReader br = new BufferedReader(reader);
//            String info = null;
//            while ((info = br.readLine())!=null){
//                System.out.println(info);
//            }
            stream.read();
//            Byte[] bytes =   stream.read();

            System.out.println();
            OutputStream stream1 = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(stream1);
            writer.write("唐光圣是傻逼，谢谢！");
            writer.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
