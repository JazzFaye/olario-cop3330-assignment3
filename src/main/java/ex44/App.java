/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static final String InputFile = "src\\main\\java\\ex44\\exercise44_input.json";

    public static void main(String[] args) throws FileNotFoundException {
        user_input();
    }
    public static void user_input() throws FileNotFoundException {
        ArrayList<Map<String, Object>> list = ReadFile(InputFile);
        String user;
        do {
            System.out.print("Enter a product name: ");
            String name = sc.nextLine().trim();
            user = ProductSearch(list, name);
            System.out.println(user);
        } while (user.equals("Sorry, that product was not found in our inventory."));
    }

    public static ArrayList<Map<String, Object>> ReadFile(String inputFile) throws FileNotFoundException {
        ArrayList<Map<String, Object>> list = new ArrayList<>();
        File input = new File(inputFile);

        JsonElement element = JsonParser.parseReader(new FileReader(input));
        JsonObject object = element.getAsJsonObject();
        JsonArray array = object.get("products").getAsJsonArray();

        for (JsonElement Elements : array) {
            String name;
            double price;
            int quantity;
            JsonObject product = Elements.getAsJsonObject();


            name = product.get("name").getAsString();
            price = product.get("price").getAsDouble();
            quantity = product.get("quantity").getAsInt();

            Map<String, Object> add = new HashMap<>();

            add.put("name", name);
            add.put("price", price);
            add.put("quantity", quantity);

            list.add(add);

        }
        return list;
    }

    public static String ProductSearch(ArrayList<Map<String, Object>> list, String name) {
        String output = "";
        for (Map<String, Object> temp : list) {
            String Name = (String) temp.get("name");
            double price = (double) temp.get("price");
            int quantity = (int) temp.get("quantity");
            if (Name.equalsIgnoreCase(name)) {

                output += String.format("Name: %s\n",Name);
                output += String.format("Price: %.2f\n", price);
                output += String.format("Quantity: %d", quantity);
                return output;
            }
        }
        return "Sorry, that product was not found in our inventory.";
    }
}
