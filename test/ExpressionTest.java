import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class ExpressionTest {

    @Test
    public void givenCompAPlusBShouldReturnTrue() throws Exception {
        String expression = "~A + B";
        Evaluator evaluator = new Evaluator();

        boolean result = evaluator.evaluateExpression(expression);

    }
}
