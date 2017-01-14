package main.java;


import java.io.File;
import java.io.FileFilter;

public class Main {

    public static void main(String[] args) {

        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };

        FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith("java");

        File dir = new File("d:/tmp");
        File[] files = dir.listFiles(filter);
        for (File f : files) {
            System.out.println(f);
        }
    }

}
