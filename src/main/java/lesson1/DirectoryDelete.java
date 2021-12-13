package lesson1;

import java.io.File;

public class DirectoryDelete {
    File element = new File("out/tests");

    public static void deleteFile(File element) {
        if (element.isDirectory()) {
            for (File sub : element.listFiles()) {
                deleteFile(sub);
            }
        }
        element.delete();
    }

}
