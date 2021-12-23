package lesson1;

import java.io.File;

public class DirectoryDelete {

    public static void deleteFile(File element) {
        if (element.isDirectory()) {
            for (File sub : element.listFiles()) {
                deleteFile(sub);
            }
        }
        element.delete();
    }


    public static void deleteFiles() {
        for (File myFile : new File("out/tests").listFiles())
            if (myFile.isFile())
                myFile.delete();
    }

}
