package springboottest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleUnitTestClass {
    Calculator calculatorTest = new Calculator();

    @Test
    public void test_add(){
        // given
        int firstNumber = 10;
        int secondNumber = 20;
        int expected = 30;

        // when
        int actual = calculatorTest.add(firstNumber, secondNumber);

        // then
        Assertions.assertEquals(expected, actual);
    }
    class Calculator{
        int add(int a, int b){
            return a + b;
        }
}
}