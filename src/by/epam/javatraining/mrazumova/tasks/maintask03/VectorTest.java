package by.epam.javatraining.mrazumova.tasks.maintask03;

import org.junit.Assert;
import org.junit.Test;

import javax.accessibility.AccessibleStateSet;

import java.util.Arrays;

import static org.junit.Assert.*;

public class VectorTest {

    @Test
    public void mergeSort() {
        double[] expected = {1, 2, 3, 4, 5, 6, 7};
        double[] actual = {2, 7, 6, 1, 3, 4, 5};
        Vector.mergeSort(actual, 0, actual.length);
        Assert.assertArrayEquals(expected, actual, 0.000001);
    }

    @Test
    public void bubbleSort() {
        double[] expected = {1, 2, 3, 4, 5, 6, 7};
        double[] actual = {2, 7, 6, 1, 3, 4, 5};
        Vector.bubbleSort(actual);
        Assert.assertArrayEquals(expected, actual, 0.000001);
    }

    @Test
    public void selectionSort() {
        double[] expected = {1, 2, 3, 4, 5, 6, 7};
        double[] actual = {2, 7, 6, 4, 3, 1, 5};
        Vector.selectionSort(actual);
        Assert.assertArrayEquals(expected, actual, 0.000001);

        double[] expected2 = {1, 2, 3, 4, 5, 6, 7, 8};
        double[] actual2 = {8, 5, 7, 1, 3, 6, 2, 4};
        Vector.selectionSort(actual2);
        Assert.assertArrayEquals(expected2, actual2, 0.0000001);
    }

    @Test
    public void insertionSort() {
        double[] expected = {1, 2, 3, 4, 5, 6, 7};
        double[] actual = {2, 7, 6, 1, 3, 4, 5};
        Vector.insertionSort(actual);
        Assert.assertArrayEquals(expected, actual, 0.000001);

        double[] expected2 = {1, 2, 3, 4, 5, 6, 7, 8};
        double[] actual2 = {8, 5, 7, 1, 3, 6, 2, 4};
        Vector.insertionSort(actual2);
        Assert.assertArrayEquals(expected2, actual2, 0.0000001);
    }

    @Test
    public void quickSort() {
        double[] expected = {1, 2, 3, 4, 5, 6, 7};
        double[] actual = {2, 7, 6, 1, 3, 4, 5};
        Vector.quickSort(actual, 0, actual.length);
        Assert.assertArrayEquals(expected, actual, 0.000001);
    }

    @Test
    public void reverseElementsInVector() {
        double[] expected = {1, 2, 3, 4, 5, 6, 7};
        double[] expected2 = {1, 2, 3, 4, 5, 6};
        double[] actual = {7, 6, 5, 4, 3, 2, 1};
        double[] actual2 = {6, 5, 4, 3, 2, 1};
        Vector.reverseElementsInVector(actual);
        Vector.reverseElementsInVector(actual2);
        Assert.assertArrayEquals(expected, actual, 0.000001);
        Assert.assertArrayEquals(expected2, actual2, 0.000001);
    }

    @Test
    public void linearSearch() {
        double[] array = {1.0, 3.0, 5.0};
        Assert.assertTrue(Vector.linearSearch(array,3.0));
        Assert.assertFalse(Vector.linearSearch(array, 1.000001));
        Assert.assertFalse(Vector.linearSearch(array, 200));
    }

    @Test
    public void binarySearch() {
        double[] array = {1.0, 3.0, 5.0};
        Assert.assertTrue(Vector.binarySearch(array,3.0));
        Assert.assertFalse(Vector.binarySearch(array, 1.000001));
        Assert.assertFalse(Vector.binarySearch(array, 200));
    }

    @Test
    public void getIndexOfFirstLocalMax() {
        double[] expected = {5, 3, 9, 1, 2};
        Assert.assertEquals(Vector.getIndexOfFirstLocalMax(expected), 2);
    }

    @Test
    public void getIndexOfFirstLocalMin() {
        double[] expected = {5, 3, 9, 1, 2};
        Assert.assertEquals(Vector.getIndexOfFirstLocalMin(expected), 1);
    }

    @Test
    public void isInDescendingOrder() {
        double[] expected = {5, 3, 9, 1, 2};
        Assert.assertFalse(Vector.isInDescendingOrder(expected));
        double[] expected2 = {1, 2, 3, 4, 7};
        Assert.assertFalse(Vector.isInDescendingOrder(expected2));
        double[] expected3 = {8, 3, 2, 1};
        Assert.assertTrue(Vector.isInDescendingOrder(expected3));
    }

    @Test
    public void isInAscendingOrder() {
        double[] expected = {5, 3, 9, 1, 2};
        Assert.assertFalse(Vector.isInAscendingOrder(expected));
        double[] expected2 = {1, 2, 3, 4, 7};
        Assert.assertTrue(Vector.isInAscendingOrder(expected2));
        double[] expected3 = {8, 3, 2, 1};
        Assert.assertFalse(Vector.isInAscendingOrder(expected3));
    }

    @Test
    public void findArithmeticMean() {
        double[] expected = {5, 5, 5, 5, 5};
        Assert.assertEquals(Vector.findArithmeticMean(expected), 5.0, 0.0001);
        double[] expected2 = {2, 4, 6, 8};
        Assert.assertEquals(Vector.findArithmeticMean(expected2), 5.0, 0.0001);
    }

    @Test
    public void findGeometricMean() {
        double[] expected = {5, 5, 5, 5, 5};
        Assert.assertEquals(Vector.findGeometricMean(expected), 5.0, 0.0001);
        double[] expected2 = {2, 4, 8, 64};
        Assert.assertEquals(Vector.findGeometricMean(expected2), 8.0, 0.0001);
    }

    @Test
    public void getMax() {
        double[] expected = {1.0, 3.0, 5.0};
        Assert.assertEquals(Vector.getMax(expected), 5.0, 0.00001);
        double[] expected2 = {1.0, 3.0, 5.0, -5.0, -9.5, 0.7};
        Assert.assertEquals(Vector.getMax(expected2), 5.0, 0.00001);
    }

    @Test
    public void getMin() {
        double[] expected = {2.0, 0.5, 1.0, 3.0, 5.0};
        Assert.assertNotEquals(Vector.getMin(expected), 5.0, 0.00001);
        Assert.assertEquals(Vector.getMin(expected), 0.5, 0.00001);
    }
}