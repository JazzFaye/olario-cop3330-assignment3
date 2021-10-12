/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final String InputFile = "src\\main\\java\\ex46\\exercise46_input.txt";

    public static void main(String[] args) {
        ReadFile();
        FindWords(ReadFile());
        Output(FindWords(ReadFile()), ReadFile());
    }

    public static ArrayList<String> ReadFile() {
        ArrayList<String> output = new ArrayList<>();
        try (Scanner s = new Scanner(new File(InputFile))) {
            while (s.hasNextLine()) {
                output.add(s.next());
            }
        } catch (FileNotFoundException e) {
            System.out.print("File Error.");
            e.printStackTrace();
        }
        return output;
    }

    public static int Count(ArrayList<String> Input, String Search) {
        int output = 0;
        while (Input.contains(Search)) {
            Input.remove(Search);
            output++;
        }
        return output;
    }

    public static ArrayList<String> FindWords(ArrayList<String> Input) {

        ArrayList<String> output = new ArrayList<>();

        for (String i : Input) {
            if (!output.contains(i)) {
                output.add(i);
            }
        }

        return output;
    }

    public static void Output(ArrayList<String> Words, ArrayList<String> Input_Array) {
        int CountWords;
        for (String words : Words) {
            System.out.printf("%s: ", words);
            CountWords = Count(Input_Array, words);
            for (int j = 0; j < CountWords; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}