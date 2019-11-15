import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest
{
@Test
    public void test1()
    {
        Assertions.assertEquals(1, Fibonacci.MyFib(2));
    }
    @Test
    public void test2() {
        Assertions.assertEquals(2, Fibonacci.MyFib(3));
    }
    @Test
    public void test3() {
        Assertions.assertEquals(8, Fibonacci.MyFib((6)));
    }
}
