package ex45;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void Test() throws Exception {
       String Actual = Process.Change("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                       "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                       "utilizes an IDE to write her Java programs\".\n");

        String Expected = ("One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".\n");
        assertEquals(Expected, Actual);
    }


}