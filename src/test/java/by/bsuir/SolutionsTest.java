package by.bsuir;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {

    Solutions solutions = new Solutions();

    @Test
    void testTask1() {
        double actual = solutions.task1(0,0);
        double expected = 0.5;
        assertEquals(expected, actual);
    }

    @Test
    void testTask2InArea() {
        assertTrue(solutions.task2(0,0));
    }

    @Test
    void testTask2OnBorderArea() {
        assertTrue(solutions.task2(-4,0));
    }

    @Test
    void testTask2OutOfArea() {
        assertFalse(solutions.task2(5,3));
    }

    @Test
    void testTask3() {
        double[] expected = {0, 0.5463, 1.5574};
        double[][] res = solutions.task3(0, 1, 0.5);
        double[] actual = new double[res.length];
        for (int i = 0; i < res.length; i++) {
            actual[i] = res[i][1];
        }
        assertArrayEquals(expected, actual, 10e-4);
    }

    @Test
    void testTask4() {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        List<Integer> actual = solutions.task4(numbers);
        List<Integer> expected = Arrays.asList(2,3,5,7);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testTask5() {
        int[] sequence = new int[]{1,4,7,2,5,9,10,3,15};
        int actual = solutions.task5(sequence);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void testTask6() {
        int[] numbers = new int[]{1,2,3,4,5};
        int[][] actual = solutions.task6(numbers);
        int[][] expected = {
                {1,2,3,4,5},
                {2,3,4,5,1},
                {3,4,5,1,2},
                {4,5,1,2,3},
                {5,1,2,3,4}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTask7() {
        int[] numbers = new int[]{9,4,6,2,4,1};
        int[] actual = solutions.task7(numbers);
        int[] expected = new int[]{1,2,4,4,6,9};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTask8() {
        int[] arrA = new int[]{1,4,6,9};
        int[] arrB = new int[]{2,3,5,8,11};
        int[] actual = solutions.task8(arrA, arrB);
        int[] expected = new int[]{1,2,4,6,8};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTask9WeightBalls() {
        Basket basket = new Basket(Arrays.asList(
                new Ball(23, BallColor.BlUE),
                new Ball(36, BallColor.RED)));
        long actual = basket.countWeight();
        long expected = 59;
        assertEquals(expected, actual);
    }

    @Test
    void testTask9ColorBalls() {
        Basket basket = new Basket(Arrays.asList(
                new Ball(23, BallColor.BlUE),
                new Ball(36, BallColor.RED),
                new Ball(3, BallColor.BlUE),
                new Ball(11, BallColor.BlUE)));
        int actual = basket.countAmountBlueBalls();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void testTask14() {
        Book book = new Book("Java", "Schildt", 200);
        Book cloneBook = book.clone();
        assertEquals(book, cloneBook);
    }

    @Test
    void testTask15() {
        List<Book> actual = new ArrayList<>(Arrays.asList(
                new Book("Java", "Schildt", 200),
                new Book("Assembly", "Machine", 1000),
                new Book("Bible", "Jesus", 0),
                new Book("Kama Sutra", "Indian", 10)
        ));
        Collections.sort(actual);
        List<Book> expected = new ArrayList<>(Arrays.asList(
                new Book("Assembly", "Machine", 1000),
                new Book("Bible", "Jesus", 0),
                new Book("Java", "Schildt", 200),
                new Book("Kama Sutra", "Indian", 10)
        ));

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testTask16Title() {
        List<Book> actual = new ArrayList<>(Arrays.asList(
                new Book("Java", "Schildt", 200),
                new Book("Assembly", "Machine", 1000),
                new Book("Bible", "Jesus", 0),
                new Book("Kama Sutra", "Indian", 10)
        ));
        BookTitleComparator bookTitleComparator = new BookTitleComparator();
        actual.sort(bookTitleComparator);
        List<Book> expected = new ArrayList<>(Arrays.asList(
                new Book("Assembly", "Machine", 1000),
                new Book("Bible", "Jesus", 0),
                new Book("Java", "Schildt", 200),
                new Book("Kama Sutra", "Indian", 10)
        ));

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testTask16TitleAuthor() {
        List<Book> actual = new ArrayList<>(Arrays.asList(
                new Book("Java", "Schildt", 200),
                new Book("Bible", "Machine", 1000),
                new Book("Java", "Jesus", 0),
                new Book("Bible", "Indian", 10)
        ));
        BookTitleAuthorComparator bookTitleAuthorComparator = new BookTitleAuthorComparator();
        actual.sort(bookTitleAuthorComparator);
        List<Book> expected = new ArrayList<>(Arrays.asList(
                new Book("Bible", "Indian", 10),
                new Book("Bible", "Machine", 1000),
                new Book("Java", "Jesus", 0),
                new Book("Java", "Schildt", 200)
        ));

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testTask16AuthorTitle() {
        List<Book> actual = new ArrayList<>(Arrays.asList(
                new Book("Java", "Schildt", 200),
                new Book("Assembly", "Machine", 1000),
                new Book("Bible", "Schildt", 0),
                new Book("Kama Sutra", "Indian", 10)
        ));
        BookAuthorTitleComparator bookAuthorTitleComparator = new BookAuthorTitleComparator();
        actual.sort(bookAuthorTitleComparator);
        List<Book> expected = new ArrayList<>(Arrays.asList(
                new Book("Kama Sutra", "Indian", 10),
                new Book("Assembly", "Machine", 1000),
                new Book("Bible", "Schildt", 0),
                new Book("Java", "Schildt", 200)
        ));

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testTask16TitleAuthorPrice() {
        List<Book> actual = new ArrayList<>(Arrays.asList(
                new Book("Java", "Schildt", 200),
                new Book("Java", "Machine", 1000),
                new Book("Bible", "Jesus", 0),
                new Book("Kama Sutra", "Indian", 10),
                new Book("Java", "Machine", 80)
        ));
        BookTitleAuthorPriceComparator bookTitleAuthorPriceComparator =
                new BookTitleAuthorPriceComparator();
        actual.sort(bookTitleAuthorPriceComparator);
        List<Book> expected = new ArrayList<>(Arrays.asList(
                new Book("Bible", "Jesus", 0),
                new Book("Java", "Machine", 80),
                new Book("Java", "Machine", 1000),
                new Book("Java", "Schildt", 200),
                new Book("Kama Sutra", "Indian", 10)
        ));

        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
