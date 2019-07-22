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
        //Assert.assertArrayEquals(expected, actual, 0.000001);
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
    }

    @Test
    public void getIndexOfFirstLocalMin() {
    }

    @Test
    public void isInDescendingOrder() {
    }

    @Test
    public void isInAscendingOrder() {
    }

    @Test
    public void findArithmeticMean() {
    }

    @Test
    public void findGeometricMean() {
    }

    @Test
    public void getMax() {
    }

    @Test
    public void getMin() {
    }
}