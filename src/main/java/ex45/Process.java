/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex45;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Process {
    private static final String InputFile = "src\\main\\java\\ex45\\exercise45_input.txt";
    private static final Scanner sc = new Scanner(System.in);

    public static String ReadFile(String File) throws Exception{
        File s = new File(InputFile);
        Scanner Read_File = new Scanner(s);

        StringBuilder FileBuilder = new StringBuilder(File);
        while(Read_File.hasNext()){
            FileBuilder.append(Read_File.nextLine()).append("\n");
        }
        File = FileBuilder.toString();
        Read_File.close();
        return File;
    }
    public static void WriteFile(String File) throws Exception{
        System.out.print("Would you like to change the file name for the Output file?\n");
        System.out.print("Type C to change or D for default: ");
        String name = sc.nextLine();

        if(name.equalsIgnoreCase("C") || name.equalsIgnoreCase("change")){
            System.out.print("Enter new file name: ");
            String modified = sc.nextLine();
            FileWriter write = new FileWriter("src\\main\\java\\ex45\\" + modified + ".txt");
            System.out.print("\n" + modified + " file created successfully.");
            write.write(File);
            write.close();
        }else if(name.equalsIgnoreCase("D") || name.equalsIgnoreCase("default")){
            FileWriter write = new FileWriter("src\\main\\java\\ex45\\exercise45_output.txt");
            System.out.print("\nDefault file created successfully.");
            write.write(File);
            write.close();
        }
    }
    public static String Change(String text){
        text = text.replaceAll("utilize", "use");
        return text;
    }
}
