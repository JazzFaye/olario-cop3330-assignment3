/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex43;


import java.io.IOException;
import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static String Site, Name, Jss, CSS;

    public static void main(String[] args) throws IOException {
        user_input();
        Output();
    }

    public static void user_input(){

        System.out.print("Site name: ");
        Site = sc.nextLine();
        System.out.print("Author: ");
        Name = sc.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        Jss = sc.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        CSS = sc.nextLine();
    }
    public static void Output() throws IOException{
        CreateWebsite s = new CreateWebsite();
        String result = s.Site_Name(Site);

        result += s.HTML(Site);
        result += s.JS_FILE(Site, Jss);
        result += s.CS_FILE(Site, CSS);
        CreateWebsite.WriteHTML(Site, Name);
        System.out.printf(result);
    }


}
