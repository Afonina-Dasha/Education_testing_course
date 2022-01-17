package lesson1;
import java.io.*;
import java.nio.file.Files;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        List<String> persons = Files.readAllLines(new File("src/main/resources/fios-2022-01-12T11_57_35.803.txt").toPath());

        List<Map<String, String>> parsedPerson = new ArrayList<>();
        persons.forEach(i -> {
            String[] fio = i.split(" ");
            HashMap<String, String> parsed = new HashMap<>();
            parsed.put("lastname", fio[0]);
            parsed.put("name", fio [1]);
            parsed.put("otchestvo", fio[2]);
            parsedPerson.add(parsed);
        });
    }
}

