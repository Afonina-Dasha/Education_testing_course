package lesson1;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.IntStream;

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

