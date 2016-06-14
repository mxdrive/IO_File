package com.company;

import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.filefilter.IOFileFilter;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;

        File txt = new File("/home/developer/IP.py");
        File f = new File("/home/developer/pic.jpg");
        File file = new File("/home/developer/pic_0.jpg");
        if (!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//
//        try {
//            bufferedReader = new BufferedReader(new FileReader(f));
//            printWriter = new PrintWriter(new FileWriter(file));
//            String line;
//            while ((line = bufferedReader.readLine())!= null) {
//                printWriter.write(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                bufferedReader.close();
//                printWriter.close();
//            }catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        try {
            FileUtils.copyFile(f, file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String string = FileUtils.readFileToString(txt, "UTF-8");
            System.out.println(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List lines = FileUtils.readLines(txt, "UTF-8");
            System.out.println(lines);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}