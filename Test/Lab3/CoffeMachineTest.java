package Lab3;

import junit.framework.TestCase;
import org.junit.Test;

public class CoffeMachineTest extends TestCase {
    @Test
    public void test1() {
        CoffeMachine test1 = new CoffeMachine();
        assertEquals("Power On!" + "Lights On!", test1.HelloMachine());
    }

    @Test
    public void test2() {
        CoffeMachine test2 = new CoffeMachine();
        test2.isActive = true;
        assertEquals("Machine Already On", test2.HelloMachine());
    }

    @Test
    public void test3() {
        CoffeMachine test3 = new CoffeMachine();
        assertEquals("Please turn the machine first", test3.PutMoney(30));
    }

    @Test
    public void test4() {
        CoffeMachine test4 = new CoffeMachine();
        assertEquals("Power On!" + "Lights On!", test4.HelloMachine());
        assertEquals("money received", test4.PutMoney(30));
    }

    @Test
    public void test5() {
        CoffeMachine test5 = new CoffeMachine();
        test5.HelloMachine();
        assertEquals("Machine Already On", test5.HelloMachine());
        assertEquals("Lights Off"+"Power Off" , test5.ByeMachine());
        assertEquals("Please turn the machine first", test5.PutMoney(30));
    }
    @Test
    public void test6() {
        CoffeMachine test6 = new CoffeMachine();
        assertEquals("4"+ " Cups Of coffee Made!", test6.OrderCoffee(4,20));
    }
    @Test
    public void test8() {
        CoffeMachine test8 = new CoffeMachine();
        assertEquals("Power On!" + "Lights On!", test8.HelloMachine());
        assertEquals("money received", test8.PutMoney(40));
        assertEquals("8"+ " Cups Of coffee Made!", test8.OrderCoffee(10,40));

    }
    @Test
    public void test9() {
        CoffeMachine test9 = new CoffeMachine();
        assertEquals("Power On!" + "Lights On!", test9.HelloMachine());
        assertEquals("money received", test9.PutMoney(40));
        assertEquals("8"+ " Cups Of coffee Made!", test9.OrderCoffee(10,40));
        assertEquals("Lights Off"+"Power Off" , test9.ByeMachine());


    }
}