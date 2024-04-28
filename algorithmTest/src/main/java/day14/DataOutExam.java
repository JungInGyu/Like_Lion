package day14;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutExam {
    public static void main(String[] args) {
        //원시데이터 타입으로 파일에 쓰고 싶다.
        try(
            FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream data = new DataOutputStream(fos);
        ){
            data.writeBoolean(true);
            data.writeByte(Byte.MAX_VALUE);
            data.writeChar('a');
            data.writeDouble(1.1);
            data.writeInt(2);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
