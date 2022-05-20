package Lab3;

import org.junit.Test;
import static org.junit.Assert.*;
public class DigitalWatchTest {
    @Test
    public void test1(){
        DigitalWatch test1 = new DigitalWatch();
        assertEquals("Welcome!",test1.Hello());
    }
    @Test
    public void test2(){
        DigitalWatch test2 = new DigitalWatch();
        assertEquals("Watch is closed open first",test2.setTimer(82));
    }
    @Test
    public void test3(){
        DigitalWatch test3 = new DigitalWatch();
        assertEquals("Watch is Already off",test3.Bye());
    }
    @Test
    public void test4(){
        DigitalWatch test4 = new DigitalWatch();
        assertEquals("Welcome!",test4.Hello());
        assertEquals("Already turned on",test4.Hello());
    }
    @Test
    public void test5(){
        DigitalWatch test5 = new DigitalWatch();
        assertEquals("Welcome!",test5.Hello());
        assertEquals("Already turned on",test5.Hello());
        assertEquals("Turned off",test5.Bye());
    }
    @Test
    public void test6(){
        DigitalWatch test6 = new DigitalWatch();
        assertEquals("Welcome!",test6.Hello());
        assertEquals("Timer starts now",test6.setTimer(10));
    }
    @Test
    public void test7(){
        DigitalWatch test7 = new DigitalWatch();
        assertEquals("Welcome!",test7.Hello());
        assertEquals("Timer starts now",test7.setTimer(10));
        assertEquals("Turned off",test7.Bye());
    }

}