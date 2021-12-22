package lesson1;

import java.io.File;

public class DirectoryDelete {

    /*public static void deleteFile1(File file) {
        String dir = "out/tests";
        File directory = new File(dir);
        File[] fList = directory.listFiles();
        if (fList != null) {
            for (File file1 : fList) {
                if (file.isFile() &&
                        file.getName().equals("fios-2021")) {
                    file.delete();
                }

            }*/

    //File element = new File("out/tests");
    public static void deleteFile(File element) {
        /*for(File file: element.listFiles()){*/
       /* if(file.getName().equals("fios-2021")) {

        } else {
                element.delete();
            }
        }*/
            //правильный вариант ниже
        if (element.isDirectory()) {
            for (File sub : element.listFiles()) {
                deleteFile(sub);
            }
        }
        element.delete();
    }
    public boolean deleteFile1(File element){

        if(element != null)
            element.delete();
        else {
            return false;
        }
        return true;
    }
    public void deleteDir(File file) {
        String dir = "out/tests";
        File contents[] = (new File(dir)).listFiles();
        //File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                deleteDir(f);
            }
        }
        file.delete();
    }

}
