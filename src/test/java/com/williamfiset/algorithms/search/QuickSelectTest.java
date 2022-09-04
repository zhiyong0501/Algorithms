package com.thealgorithms.searches;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class QuickSelectTest {
    @Test
    void quickSelectMinimumOfOneElement() {
        List<Integer> elements = Collections.singletonList(42);
        int minimum = QuickSelect.select(elements, 0);
        assertEquals(42, minimum);
    }

    @Test
    void quickSelectMinimumOfTwoElements() {
        List<Integer> elements1 = Arrays.asList(42, 90);
        List<Integer> elements2 = Arrays.asList(90, 42);

        int minimum1 = QuickSelect.select(elements1, 0);
        int minimum2 = QuickSelect.select(elements2, 0);

        assertEquals(42, minimum1);
        assertEquals(42, minimum2);
    }

    @Test
    void quickSelectMinimumOfThreeElements() {
        List<Integer> elements1 = Arrays.asList(1, 2, 3);
        List<Integer> elements2 = Arrays.asList(2, 1, 3);
        List<Integer> elements3 = Arrays.asList(2, 3, 1);

        int minimum1 = QuickSelect.select(elements1, 0);
        int minimum2 = QuickSelect.select(elements2, 0);
        int minimum3 = QuickSelect.select(elements3, 0);

        assertEquals(1, minimum1);
        assertEquals(1, minimum2);
        assertEquals(1, minimum3);
    }

    @Test
    void quickSelectMinimumOfManyElements() {
        List<Integer> elements = generateRandomIntegers(NUM_RND_ELEMENTS);
        int actual = QuickSelect.select(elements, 0);
        int expected = elements.stream().min(Comparator.naturalOrder()).get();
        assertEquals(expected, actual);
    }

    @Test
    void quickSelectMaximumOfOneElement() {
        List<Integer> elements = Collections.singletonList(42);
        int maximum = QuickSelect.select(elements, 0);
        assertEquals(42, maximum);
    }

    @Test
    void quickSelectMaximumOfTwoElements() {
        List<Integer> elements1 = Arrays.asList(42, 90);
        List<Integer> elements2 = Arrays.asList(90, 42);

        int maximum1 = QuickSelect.select(elements1, 1);
        int maximum2 = QuickSelect.select(elements2, 1);

        assertEquals(90, maximum1);
        assertEquals(90, maximum2);
    }

    @Test
    void quickSelectMaximumOfThreeElements() {
        List<Integer> elements1 = Arrays.asList(1, 2, 3);
        List<Integer> elements2 = Arrays.asList(2, 1, 3);
        List<Integer> elements3 = Arrays.asList(2, 3, 1);

        int maximum1 = QuickSelect.select(elements1, 2);
        int maximum2 = QuickSelect.select(elements2, 2);
        int maximum3 = QuickSelect.select(elements3, 2);

        assertEquals(3, maximum1);
        assertEquals(3, maximum2);
        assertEquals(3, maximum3);
    }

    @Test
    void quickSelectMaximumOfManyElements() {
        List<Integer> elements = generateRandomIntegers(NUM_RND_ELEMENTS);
        int actual = QuickSelect.select(elements, NUM_RND_ELEMENTS - 1);
        int expected = elements.stream().max(Comparator.naturalOrder()).get();
        assertEquals(expected, actual);
    }

    @Test
    void quickSelectMedianOfOneElement() {
        List<Integer> elements = Collections.singletonList(42);
        int median = QuickSelect.select(elements, 0);
