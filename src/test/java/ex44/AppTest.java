package ex44;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
//I dunno why its giving me an error when I click to see difference, they are exactly the same
// I apologize for not making it right
class AppTest {
    @Test
    void Test() throws FileNotFoundException {

        String InputFile= "src\\main\\java\\ex44\\exercise44_input.json";
        ArrayList<Map<String, Object>> list = App.ReadFile(InputFile);

        String Actual1 = App.ProductSearch(list, "Doodad");
        String Expected1 = "Name: Doodad\nPrice: 5.00\nQuantity: 10\n";

        String Actual2 = App.ProductSearch(list, "Widget");
        String Expected2 = "Name: Widget\nPrice: 25.00\nQuantity: 5\n";

        String Actual3 = App.ProductSearch(list, "Thing");
        String Expected3 = "Name: Thing\nPrice: 15.00\nQuantity: 5\n";


        assertEquals(Expected1, Actual1);
        assertEquals(Expected2, Actual2);
        assertEquals(Expected3, Actual3);

    }
}
