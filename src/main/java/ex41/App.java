/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex41;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    private static ArrayList<String> Names;
    private static final String InputFile = "src\\main\\java\\ex41\\exercise41_input.txt";
    private static final String OutputFile = "src\\main\\java\\ex41\\exercise41_output.txt";

    public static void main(String[] args) throws IOException {
        ReadFile(InputFile);
        Sort();
        WriteFile(Names);
    }
    public static void ReadFile(String name_list) throws FileNotFoundException {

            FileReader InputFile = new FileReader(name_list);
            Scanner sc = new Scanner(InputFile);
            Names = new ArrayList<>();
            try {
                while (sc.hasNextLine()) {
                    String addList = sc.nextLine();
                    Names.add(addList);
                }
            } catch (Exception e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }
    public static void WriteFile(ArrayList<String> names) {

        try(FileWriter w = new FileWriter(OutputFile)){
            String header = String.format("Total of %d names: \n", names.size());
            String header2 = "-------------------\n";
            w.write(header + header2);
            for (String name : names) {
                w.append(name).append("\n");
            }
            System.out.println("No errors occurred.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
    public static void Sort() {
        Collections.sort(Names);
    }
}
