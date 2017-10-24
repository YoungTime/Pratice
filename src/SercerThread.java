import java.io.*;
import java.net.Socket;

public class SercerThread extends Thread {
    //与本线程相关的Socket
    Socket socket = null;

    public SercerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream is = null;
        InputStreamReader reader = null;
        BufferedReader buffer = null;
        OutputStream os = null;
        PrintWriter writer = null;

        try {
            is = socket.getInputStream();
            reader = new InputStreamReader(is);
            buffer = new BufferedReader(reader);
            String info = null;
            while ((info=buffer.readLine())!=null){
                System.out.println("服务器说"+info);
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
