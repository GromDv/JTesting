package Calc;

import org.assertj.core.api.Assertions;

public class calculatingDiscountTest {
    public static void main(String[] args) {

        Assertions.assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-10, 10)
        ).isInstanceOf(ArithmeticException.class)
                .as("Недопустимая цена продукта не проверяется!");

        Assertions.assertThatThrownBy(() ->
                Calculator.calculatingDiscount(100, -10)
        ).isInstanceOf(ArithmeticException.class)
                .as("Недопустимая скидка не проверяется!");

        Assertions.assertThat(Calculator.calculatingDiscount(100, 10)).isEqualTo(90)
                .as("Неправильно расчитана сумма скидки!");
    }
}