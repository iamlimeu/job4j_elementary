package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22To42Then2() {
        double expected = 2;
        Point a = new Point(2, 2);
        Point b = new Point(4, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when24To20Then4() {
        double expected = 4;
        Point a = new Point(2, 4);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus33To30Then6Dot7() {
        double expected = 6.7;
        Point a = new Point(-3, 3);
        Point b = new Point(3, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when202To222Then2() {
        double expected = 2.0;
        Point a = new Point(2, 0, 2);
        Point b = new Point(2, 2, 2);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when132To224Then2Dot44() {
        double expected = 2.44;
        Point a = new Point(1, 3, 2);
        Point b = new Point(2, 2, 4);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}