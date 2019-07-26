package by.epam.javatraining.mrazumova.tasks.maintask03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void getMax() {
        double[][] actual = {{1, 2, 5}, {2, 1, 9}};
        Assert.assertEquals(Matrix.getMax(actual), 9.0, 0.0001);

        double[][] actual2 = {{45, 7, 19, 51}, {2, 7, 91}};
        Assert.assertEquals(Matrix.getMax(actual2), 91.0, 0.00001);
    }

    @Test
    public void getMin() {
        double[][] actual = {{3, 2, 5}, {2, 1, 9}};
        Assert.assertEquals(Matrix.getMin(actual), 1.0, 0.0001);

        double[][] actual2 = {{45, 7, 19, 51}, {2, 7, -91}};
        Assert.assertEquals(Matrix.getMin(actual2), -91.0, 0.00001);
    }

    @Test
    public void findArithmeticMean() {
        double[][] actual = {{5, 2, 5}, {8, 4, 6}};
        Assert.assertEquals(Matrix.findArithmeticMean(actual), 5.0, 0.0001);

        double[][] actual2 = {{3, 5, 10}, {2, 18, 4}};
        Assert.assertEquals(Matrix.findArithmeticMean(actual2), 7.0, 0.00001);
    }

    @Test
    public void findGeometricMean() {
        double[][] actual = {{2, 3, 6}, {36, 36, 1}};
        Assert.assertEquals(Matrix.findGeometricMean(actual), 6.0, 0.01);

        double[][] actual2 = {{45, 7, 19, 51}, {2, 7, 91}};
        Assert.assertEquals(Matrix.findGeometricMean(actual2), 11.85, 0.01);
    }

    @Test
    public void isSimmetric() {
        double[][] actual = {{1, 2, 3}, {2, 1, 2}, {3, 2, 1}};
        Assert.assertTrue(Matrix.isSimmetric(actual));

        double[][] actual2 = {{3, 3, 3}, {2, 1, 2}, {3, 2, 1}};
        Assert.assertFalse(Matrix.isSimmetric(actual2));
    }

    @Test
    public void transpose() {
        double[][] actual = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Matrix.transpose(actual);
        for(int i = 0; i < 3; ++i)
            Assert.assertArrayEquals(actual[i], expected[i], 0.00001);
    }

    @Test
    public void getLocalMax() {
        double[][] array = {{2, 2, 3, 8}, {2, 9, 4, 7}, {1, 1, 3, 1}};
        int[] actual = Matrix.getLocalMax(array);
        int[] expected = {1, 1};
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void getLocalMin() {
        double[][] array = {
                {2, -2, -3, 8},
                {2, 9, 4, 7},
                {1, 1, 3, 1}};
        int[] actual = Matrix.getLocalMin(array);
        int[] expected = {1, 2};
        Assert.assertArrayEquals(actual, expected);
    }
}