package ex41;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void test() throws FileNotFoundException {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ling, Mai");
        names.add("Johnson, Jim");
        names.add("Zarnecki, Sabrina");
        names.add("Jones, Chris");
        names.add("Jones, Aaron");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");
        Collections.sort(names);
        String expected = "Johnson, Jim\n"+"Jones, Aaron\n"+"Jones, Chris\n"+"Ling, Mai\n"+"Swift, Geoffrey\n"+"Xiong, Fong\n"+"Zarnecki, Sabrina\n";
        String actual = "";
        for (int i = 0; i < names.size(); i++){
           actual += names.get(i) + "\n";
        }
        assertEquals(expected, actual);
    }
}