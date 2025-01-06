package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {
    @Test
    public void whenSortFiveNumbers() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThreeNumbers() {
        int[] data = new int[] {5, 3, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 3, 5};
        assertThat(result).containsExactly(expected);
    }
}