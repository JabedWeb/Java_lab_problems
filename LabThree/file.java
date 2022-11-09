package LabThree;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class file {
    public static void main(String[] args) {

        //directory creation
        File dr = new File("D:/Java/Lab Report3/student");
        String path = dr.getAbsolutePath();
        try {
            if (dr.exists()) {
                System.out.println("Directory already exists");
            } else {
                dr.mkdir();
                System.out.println("Directory created");
            }
        } catch (Exception e) {
            System.out.print(e);
        }

        //file creation
        System.out.println(path);

        File file = new File(path + "/student.txt");

        try {
            if (file.exists()) {
                System.out.println("File already exists");
            } else {
                file.createNewFile();
                System.out.println("File created");
            }
        } catch (IOException e) {
            System.out.print(e);
        }

        //file writing
        try {
            FileWriter fileWriter = new FileWriter(path + "/student.txt");
            fileWriter.write("Name: Jabed\n");
            fileWriter.write("Name: Hasan\n");
            fileWriter.write("Name: Fahim\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.print(e);
        }


        //reading file
        File files = new File(path + "/student.txt");
        try {
            Scanner sc = new Scanner(files);
            while (sc.hasNext()) {
                System.out.print("\n" + sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.print(e);
        }

        //file deletion 
        try {
            //always take files in directory
            File drs = new File("D:/Java/Lab Report3/student");
            if (drs.delete()) {
                System.out.println("Directory deleted");
            } else {
                System.out.println("Directory not deleted");
            }
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}