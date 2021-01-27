import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void setUp() {
        this.calculator = new Calculator();
    }

    @Test(expected = SquareEquationException.class)
    public void shouldThrowSquareEquationException() {
        calculator.calculate(0, 0, 0);
    }

    @Test
    public void shouldThrowSquareEquationExceptionWithMsg_1() {
        exceptionRule.expect(SquareEquationException.class);
        exceptionRule.expectMessage("Parametr a == 0");

        calculator.calculate(0, 0, 0);
    }

    @Test
    public void shouldThrowSquareEquationExceptionWithMsg_2() {
        exceptionRule.expect(SquareEquationException.class);
        exceptionRule.expectMessage("Brak rozwiązań (delta < 0)");

        calculator.calculate(1, 1, 1);
    }

    @Test
    public void shouldPrintOneDoubleResult_1() {
        String result = calculator.calculate(1, 0, 0);

        assertTrue(result.startsWith("Jedno podwójne rozwiązanie x ="));
    }

    @Test
    public void shouldPrintOneDoubleResult_2() {
        String result = calculator.calculate(1, 0, 0);

        assertEquals("Jedno podwójne rozwiązanie x = -0,000000", result);
    }

    @Test
    public void shouldPrintOneDoubleResult_3() {
        String result = calculator.calculate(1, 3, 1);

        assertEquals("Istnieją dwa rozwiązania x1 = -0,381966 oraz x2 = -2,618034", result);
    }

}