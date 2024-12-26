package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart0Finish5ThenSum15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart9Finish5ThenSum0() {
        int start = 9;
        int finish  = 5;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart7Finish7ThenSum7() {
        int start = 7;
        int finish = 7;
        int result = Counter.sum(start, finish);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}