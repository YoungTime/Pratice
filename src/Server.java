import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**基于TCP的Socket通信
 *服务器端
 */

public class Server{
    public static void main(String[] args) {
        try {
            //创建一个服务器端Socket，绑定端口
            ServerSocket serverSocket = new ServerSocket(8888);
            //调用accept()方法开始监听，等待客户端的连接
            System.out.println("服务器即将启动，等待客户端的连接");
            Socket socket =serverSocket.accept();
            //获取输入流，用来读取客户端的信息
            InputStream inputStream = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(reader);
            String info = null;
            while ((info=br.readLine())!=null){
                System.out.println("我是服务器，客户端说："+info);
            }
            socket.shutdownInput();//关闭输入流

            //获取输出流
            OutputStream stream=socket.getOutputStream();
            PrintWriter writer = new PrintWriter(stream);
            writer.write("欢迎您");
            writer.flush();



            //关闭相关资源
            br.close();
            reader.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
            writer.close();
            stream.close();






        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}