package lesson1;

import java.io.File;

public class DirectoryDelete {

    public static void deleteFiles() {
        for (File myFile : new File("out/tests").listFiles())
            if (myFile.isFile())
                myFile.delete();
    }

}
