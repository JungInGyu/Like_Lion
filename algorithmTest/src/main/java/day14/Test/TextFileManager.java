package day14.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileManager {
    private String filePath;

    public TextFileManager(String filePath) {
        this.filePath = filePath;
    }

    public void writeToFile(List<String> userInput) {
        try (FileOutputStream output = new FileOutputStream(filePath)) {
            for (String str : userInput){
                output.write((str + "\n").getBytes());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<String> readFromFile() {
        List<String> strList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));){
            String str;
            while ((str = reader.readLine()) != null){
                strList.add(str);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return strList;
    }
}
