package day14;

import java.io.*;

public class DataTypesIOExample {
    public static void main(String[] args) {
        //입출력되는 데이터는 모두 바이트거나 캐릭터로 전송되는... 이것을
        //자바에서 데이터 타입으로 읽고 쓰고 싶다. DataInputStream... DataOutputStream...

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
            DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))){
            dos.writeInt(123);
            dos.writeDouble(123.45);
            dos.writeBoolean(true);
            dos.writeUTF("Hello Java");

            int intData = dis.readInt();
            double doubleData = dis.readDouble();
            boolean bolleanData = dis.readBoolean();
            String stringData = dis.readUTF();
            System.out.println("Int data: "+ intData);
            System.out.println("Double data: "+ doubleData);
            System.out.println("Boolean data: "+ bolleanData);
            System.out.println("String data: "+ stringData);


        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
