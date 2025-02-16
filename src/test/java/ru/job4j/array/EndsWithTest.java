package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, prefix);
        assertThat(result).isFalse();
    }
}