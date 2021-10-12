/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateWebsite {
    private static final String InputFile = "src\\main\\java\\ex43\\";
    String website = "Created ./website/";
    String html = "/index.html\n";
    String js = "/js/\n";
    String css = "/css/\n";


    public String Site_Name(String name) {
        String output;
        File path = new File(InputFile + name);

        if (path.mkdir()) {
            output = website + name + "\n";
        } else {
            output = "An error occurred.\n";
        }
        return output;
    }

    public String HTML(String name) throws IOException{
        String output;
        File path = new File(InputFile + name + "\\index.html");

        if (path.createNewFile()) {
            output = website + name + html;
        } else {
            output = "An error occurred.\n";
        }
        return output;
    }

    public String JS_FILE(String name, String Script) {
        String output = "";
        File path = new File(InputFile + name + "\\js");
        if (Script.equalsIgnoreCase("y")) {

            if (path.mkdir()) {
                output = website + name + js;
            } else {
                output = "An error occurred.\n";
            }
        } else if (Script.equalsIgnoreCase("n")) {
            output = "";
        }else {
            System.out.print("Please enter y/n only.\n");
        }
        return output;
    }

    public String CS_FILE(String name, String Script) {
        String output = "";

        if (Script.equalsIgnoreCase("y")) {
            File path = new File(InputFile + name + "\\css");

            if (path.mkdir()) {
               output = website + name + css;
            } else {
                output = "An error occurred\n";
            }
        } else if (Script.equalsIgnoreCase("n")) {
            output = "";
        } else {
            System.out.print("Please enter y/n only.\n");
        }
        return output;
    }

    public static void WriteHTML(String Website, String Author) {
        try {
            FileWriter Object = new FileWriter(InputFile + Website + "\\index.html");
            Object.write("<!DOCTYPE html>\n <html> \n<head> \n" +
                    "   <title>" + Website + "</title> \n" +
                    "   <meta name=\"" + Author + "\"> \n" +
                    "</head> \n</html>");
            Object.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
