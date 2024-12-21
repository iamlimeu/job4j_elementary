package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void rubleToEuro() {
        float input = 210;
        float expected = 3;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001F;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void rubleToDollar() {
        float input = 120;
        float expected = 2;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001F;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}