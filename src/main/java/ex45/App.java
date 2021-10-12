/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex45;

public class App {
    private static String text = "";

    public static void main(String[] args) throws Exception {
        text = Process.ReadFile(text);
        text = Process.Change(text);
        Process.WriteFile(text);

    }
}
