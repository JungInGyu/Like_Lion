package day14;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class WWWRead {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://likelion.net/");
        InputStream urlInput = url.openStream();

        //URL에서 한 줄 씩 입력 받아서 출력해보세요.

        BufferedReader reader =new BufferedReader(new InputStreamReader(urlInput));
        String str = null;

        while ((str = reader.readLine()) != null){
            System.out.println(str);
        }


    }
}
