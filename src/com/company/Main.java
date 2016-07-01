package com.company;

import org.apache.commons.io.FileUtils;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;

        File txt = new File("/home/developer/txt.txt");
        File txt2 = new File("/home/developer/txt2.txt");
        File f = new File("/home/developer/pic.jpg");
        File file = new File("/home/developer/pic_0.jpg");
        if (!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (!txt2.exists()) {
            try {
                txt2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

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
//
//        try {
//            FileUtils.copyFile(f, file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            String string = FileUtils.readFileToString(txt, "UTF-8");
//            System.out.println(string);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            List lines = FileUtils.readLines(txt, "UTF-8");
//            Collections.sort(lines);
//            System.out.println(lines);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            List<String> lines = FileUtils.readLines(txt, "UTF-8");
            String string = FileUtils.readFileToString(txt, "UTF-8");

            System.out.println(string);
            Collections.sort(lines, Collections.reverseOrder());
            PrintWriter printWriter1 = new PrintWriter(new FileWriter(txt2));
            for (String line:lines) {
                printWriter1.write(line);
                System.out.println(line);
            }

//            эта хня как-то работает, но, сцук, в while=true
//            while (string.isEmpty() != true) {
//                printWriter1.write(string);
//                System.out.println(string);
//                System.out.println(printWriter1);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            List lines = FileUtils.readLines(txt, "UTF-8");
//            Collections.sort(lines, Collections.reverseOrder());
//            System.out.println(lines);
//            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(txt));
//            String l;
//            PrintWriter printWriter1 = new PrintWriter(new FileWriter(txt2));
//            System.out.println("_____________________________________________________________");
//            while ((l = bufferedReader1.readLine())!= null) {
//                printWriter1.write(l);
//                System.out.println(l);
//                //System.out.println(printWriter1);
//            }
//            } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}