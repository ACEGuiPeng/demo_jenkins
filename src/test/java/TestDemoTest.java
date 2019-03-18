import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestDemoTest {

    private TestDemo testDemo = new TestDemo();

    @Test
    public void testCalculate() {
        testDemo.calculate(2, 3);
        assertEquals(testDemo.getSum(), 5);

        testDemo.calculate(-2, 5);
        assertEquals(testDemo.getSum(), 7);
    }
}