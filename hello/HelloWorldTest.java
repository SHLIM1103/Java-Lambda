package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    HelloWorld hello = new HelloWorld();
    
    @Test
    public void main(){
        assertEquals("Hello, World!!!!", hello.main());
    }
}
