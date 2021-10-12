package ex42;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void data() throws IOException {
        File FileInput = new File("src\\main\\java\\ex42\\exercise42_input.txt");
        boolean exist = FileInput.exists();
        assertTrue(exist);
    }
}