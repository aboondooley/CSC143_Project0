package test;


import hello.Hello;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {
    @Test
    public void greetingTestWorld() {
        Hello hello = new Hello();
        assertEquals("Hello, World!", hello.greeting());
    }

    @Test
    public void greetingTestName() {
        Hello name = new Hello("there");
        assertEquals("Hello, there!", name.greeting());
    }

    @Test
    public void helloToString() {
        Hello hello = new Hello();
        assertEquals("Hello, World!", hello.toString());

        Hello name = new Hello("General Kenobi");
        assertEquals("Hello, General Kenobi!", name.toString());
    }
}
