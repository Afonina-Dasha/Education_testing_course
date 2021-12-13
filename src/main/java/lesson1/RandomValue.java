package lesson1;


import java.io.*;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomValue {
    String path;
    FileReader file;
    List<String> value;

    public RandomValue(String path) {
        this.path = path;
        try {
            file = new FileReader(path);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(file);
        value = br.lines().collect(Collectors.toList());
    }

    public String getRandom(){
        int rand = new Random().nextInt(value.size());
        return value.get(rand);

    }



}
