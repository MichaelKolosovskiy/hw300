package numbers;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class Calculator {

    private static Map<Character, DoubleBinaryOperator> action;

    static {
        action = new HashMap<>();
        action.put(('+'), (i, j) -> i + j);
        action.put(('-'), (i, j) -> i - j);
        action.put(('*'), (i, j) -> i * j);
        action.put(('/'), (i, j) -> i / j);
        action.put(('n'), (i, j) -> 0);
        action.put(('^'), (i, j) -> Math.pow(i, j));
        action.put(('√'), (i, j) -> Math.pow(i, 1 / j));
        action.put(('`'), (i, j) -> Math.pow((i + j) / i + 117, j));
    }

    public static double result(double firstNumber,
                                double secondNumber,
                                char sign) {
        return action
                .getOrDefault(sign, action.get('n'))
                .applyAsDouble(firstNumber, secondNumber);
    }
}