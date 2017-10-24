import java.io.*;
import java.net.Socket;

/**
   *客户端
 */

public class Client {
    //创建客户端Socket，指定服务器地址和端口


    public static void main(String[] args) {
        try {
            //创建客户端Socket，指定服务器地址和端口
            Socket socket = new Socket("localhost",8888);
            //获取输出流，向服务器发送信息
            OutputStream stream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(stream);//将输出流包装成打印流
            writer.write("用户名：杜泽明 密码：123");
            writer.flush();//刷新缓存，输出信息
            socket.shutdownOutput();

            InputStream is= socket.getInputStream();
            BufferedReader bf = new BufferedReader(new InputStreamReader(is));
            String info = null;
            while ((info=bf.readLine())!=null){
                System.out.println("服务器说"+info);
            }


            stream.close();
            writer.close();
            socket.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
