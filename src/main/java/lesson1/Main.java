package lesson1;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        //1
        RandomValue secondRandomGenerator = new RandomValue("src/main/resources/SecondNames.txt");
        RandomValue nameRandomGenerator = new RandomValue("src/main/resources/FirstNames.txt");
        RandomValue otchestvoRandomGenerator = new RandomValue("src/main/resources/MiddleNames.txt");
        //2
        List<FIO> fioList = new ArrayList<>();

        IntStream.range(0, 100).forEach(i -> {
            String second = secondRandomGenerator.getRandom();
            String name = nameRandomGenerator.getRandom();
            String otchestvo = otchestvoRandomGenerator.getRandom();
            FIO fio = new FIO(second, name, otchestvo);
            fioList.add(fio);
        });

        //3
        String fileName = String.format("out/tests/fios-%s.txt", LocalDateTime.now().toString().replace(":", "_"));
        File file = null;
        try {
            file = Files.createFile(Paths.get(fileName)).toFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            StringBuilder stringBuilder = new StringBuilder();
            for (FIO fio : fioList) {
                stringBuilder.append(fio.toString() + "\n");
            }
            byte[] bytes = stringBuilder.toString().getBytes();
            fo.write(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //4
        DirectoryDelete directoryDelete = new DirectoryDelete();
        directoryDelete.deleteDir(file);

    }
}

