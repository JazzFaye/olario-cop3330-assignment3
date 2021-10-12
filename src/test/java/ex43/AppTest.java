package ex43;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    public static CreateWebsite s = new CreateWebsite();
    @Test
    void GetName(){
       String Actual = s.Site_Name("awesome");
       String Expected = "Created ./website/awesome\n";

       assertEquals(Expected,Actual);
    }
    @Test
    void GetIndex() throws IOException {
        String Actual = s.HTML("awesome");
        String Expected = "Created ./website/awesome/index.html\n";

        assertEquals(Expected,Actual);
    }
    @Test
    void GetJSS(){
        String Actual = s.JS_FILE("awesome","y");
        String Expected = "Created ./website/awesome/js/\n";

        assertEquals(Expected,Actual);
    }
    @Test
    void GetCS(){
        String Actual = s.CS_FILE("awesome","y");
        String Expected = "Created ./website/awesome/css/\n";

        assertEquals(Expected,Actual);
    }
}