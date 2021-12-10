package lesson1;


import java.io.*;

public class RandomValue {
    String path;
    FileReader file;

    public RandomValue(String path) {
        this.path = path;
        try {
            file = new FileReader("src/main/resources/FirstNames.txt");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
    public String getRandom(){
        BufferedReader br = new BufferedReader(file);
        String value;
        try {
            value = br.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return "";
    }



}
