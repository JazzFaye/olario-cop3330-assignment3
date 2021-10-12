package ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void FindWords(){
        ArrayList<String> list = new ArrayList<>();
            list.add("Jazz");
            list.add("Jazz");
            list.add("Jazz");
            list.add("Jazz");
            list.add("Jazz");
            list.add("Kyle");
            list.add("Kyle");

        ArrayList <String> Actual = App.FindWords(list);
        ArrayList<String> Expected = new ArrayList<>();
            Expected.add("Jazz");
            Expected.add("Kyle");

        assertEquals(Actual, Expected);
    }
    @Test
    void CountWords() {

        ArrayList<String> actualList = new ArrayList<>() {
            {
                add("Jazz");
                add("Jazz");
                add("Jazz");
                add("Kyle");
                add("Kyle");
                add("Kyle");
                add("Jazz");
            }
        };

        int Actual = App.Count(actualList, "Kyle");

        int Expected = 3;

        assertEquals(Expected, Actual);
    }


}