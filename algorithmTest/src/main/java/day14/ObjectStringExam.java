package day14;

import java.io.*;

public class ObjectStringExam {
    public static void main(String[] args) {
        //객체를 파일에 저장
//        Person person = new Person("Jung",25);
//
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.data"));){
//            out.writeObject(person);
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        //파일에서 객체를 읽어오기!!
        Person readPerson = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.data"))){
            readPerson = (Person) in.readObject();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(readPerson);
        System.out.println(readPerson.getName());

        readPerson.setAge(23);

        System.out.println(readPerson.getAge());

    }
}
