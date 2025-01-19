package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax10To6Then10() {
        int left = 10;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To21Then21() {
        int left = 7;
        int right = 21;
        int result = Max.max(left, right);
        int expected = 21;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To5To12Then12() {
        int first = 3;
        int second = 5;
        int third = 12;
        int result = Max.max(first, second, third);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To8To9To15Then15() {
        int first = 4;
        int second = 8;
        int third = 9;
        int fourth = 15;
        int result = Max.max(first, second, third, fourth);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }
}