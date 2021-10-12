/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex42;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<String> Names;
    private static final String InputFile = "src\\main\\java\\ex42\\exercise42_input.txt";

    public static void main(String[] args) throws IOException {
        ReadFile(InputFile);
        PrintData(Names);
    }
    public static void ReadFile(String name_list) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(name_list));
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
    public static void PrintData(ArrayList<String> names) {
        System.out.printf("%-17s%-17s%s\n", "Last", "First", "Salary");
        System.out.print("----------------------------------------\n");
        String[] data;
        try {
            for (int i = 0; i < names.size(); i++) {
                data = names.get(i).split(",");
                System.out.printf("%-17s%-17s%s\n", data[0], data[1], data[2]);
            }
            System.out.println("\nNo errors occurred.");
        } catch (Exception e) {
            System.out.print("An error occurred.");
            e.printStackTrace();
        }
    }
}

