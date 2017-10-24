import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Text {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");

        System.out.println("协议:"+url.getProtocol());
        InputStream inputStream =url.openStream();
        InputStreamReader is = new InputStreamReader(inputStream);
        //添加缓冲，提高读取效率
        BufferedReader re = new BufferedReader(is);
        String data = re.readLine();
        while (data!=null){
            System.out.println(data);
            data=re.readLine();
        }
        re.close();
        is.close();
        inputStream.close();
    }
}
