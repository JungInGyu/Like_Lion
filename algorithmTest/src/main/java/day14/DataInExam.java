package day14;

import java.io.DataInputStream;
import java.io.FileInputStream;


public class DataInExam {
    public static void main(String[] args) {
        try (DataInputStream input = new DataInputStream(new FileInputStream("data.txt"))){
            boolean b = input.readBoolean();
            System.out.println(b);
            System.out.println(input.readByte());
            System.out.println(input.readChar());
            System.out.println(input.readDouble());
            System.out.println(input.readInt());


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
