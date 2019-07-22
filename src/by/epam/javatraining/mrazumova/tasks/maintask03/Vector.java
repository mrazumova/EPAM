package by.epam.javatraining.mrazumova.tasks.maintask03;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Vector {

    public static void main(String[] args) throws IOException {
        int sizeOfVector = 25;
        double[] vector = new double[sizeOfVector];
        Scanner sc = new Scanner(new File("src\\by\\epam\\javatraining\\mrazumova\\tasks\\maintask03\\in.txt"));
        for (int i = 0; i < 25; ++i){
            vector[i] = sc.nextDouble();
        }
        sc.close();

        //экстремальные значения (минимальный и максимальный элементы)
        double max = getMax(vector), min = getMin(vector);
        if (isThereMaxAndMin(min, max))
            System.out.println("Max: " + max + "\nMin: " + min);
        else
            System.out.println("Not found.");

        //среднеарифметическое и среднегеометрическое значения
        System.out.println("The geometric mean: " + findGeometricMean(vector) + "\nThe arithmetic mean: " + findArithmeticMean(vector));

        //находятся ли все элементы вектора в упорядоченном виде
        if (isInAscendingOrder(vector) || isInDescendingOrder(vector))
            System.out.println("Sorted");
        else
            System.out.println("Not sorted");

        //позиция первого встретившегося локального минимума (максимума)
        min = getIndexOfFirstLocalMin(vector);
        max = getIndexOfFirstLocalMax(vector);
        if (min == max)
            System.out.println("False");
        else{
            System.out.println("First local min: " + min);
            System.out.println("First local max: " + max);
        }

        //линенйный и двоичный поиски
        System.out.println(linearSearch(vector, 10.01));
        System.out.println(binarySearch(vector, 10.01));

        //реверсировать все элементы вектора
        double[] secondVector = {1, 2, 3, 4};
        reverseElementsInVector(secondVector);
        System.out.println("Reversed vector " + toString(secondVector));

        //сортировка обменом или пузырьковая сортировка (bubble sort), а
        //также её улучшенные версии; сортировка вставками (insertion sort); сортировка
        //выбором (selection sort); сортировка слиянием (merge sort) и быстрая сортировка
        //(quick sort).
    }

    public static void quickSort(double[] vector, int left, int right){ // сортировка с выбором среднего по индексу элемента
        if (left < right){
            int div = divide(vector, left, right);
            quickSort(vector, left, div - 1);
            quickSort(vector, div + 1, right);
        }
    }

    private static int divide(double[] vector, int left, int right){
        int mediumIndex = (left + right) / 2;
        while (left < right && right < vector.length){
            while (vector[left] < vector[mediumIndex]){
                ++left;
            }
            while (vector[right] > vector[mediumIndex]) {
                --right;
            }
            if (left < right){
                vector[left] += vector[right];
                vector[right] = vector[left] - vector[right];
                vector[left] -= vector[right];
                ++left; ++right;
            }
        }
        return right;
    }

    public static void reverseElementsInVector(double[] vector){
        int size = vector.length - 1;
        int medium = size/2;
        for(int i = 0; i < medium; ++i){
            vector[i] += vector[size - i];
            vector[size - i] = vector[i] - vector[size - i];
            vector[i] -= vector[size - i];
        }
    }

    public static boolean linearSearch(double[] vector, double key){
        for(double elementInArray : vector)
            if (elementInArray == key)
                return true;
        return false;
    }

    public static boolean binarySearch(double[] vector, double key){
        int medium, left = 0, right = vector.length - 1;
        quickSort(vector, left, right);
        while ((left <= right)) {
            medium = (left + right) / 2;

            if (vector[medium] == key)
                return true;
            if (vector[medium] > key)
                right = --medium;
            else
                left = ++medium;
        }
        return false;
    }

    public static int getIndexOfFirstLocalMax(double[] vector){
        int index;
        int size = vector.length - 1;
        for (index = 1; index < size; ++index){
            if (vector[index - 1] < vector[index] && vector[index] > vector[index + 1])
                break;
        }
        return index;
    }

    public static int getIndexOfFirstLocalMin(double[] vector){
        int index;
        int size = vector.length - 1;
        for (index = 1; index < size; ++index){
            if (vector[index - 1] > vector[index] && vector[index] < vector[index + 1])
                break;
        }
        return index;
    }

    public static boolean isInDescendingOrder(double[] vector){
        for (int i = 1; i < vector.length; ++i){
            if (vector[i] >= vector[i - 1])
                return false;
        }
        return true;
    }

    public static boolean isInAscendingOrder(double[] vector){
        for (int i = 1; i < vector.length; ++i){
            if (vector[i] <= vector[i - 1])
                return false;
        }
        return true;
    }

    public static double findArithmeticMean(double[] vector){
        double am = 0.0;
        for(double element : vector){
            am += element;
        }
        return am/vector.length;
    }

    public static double findGeometricMean(double[] vector){
        double gm = 1.0;
        for (double element : vector){
            gm *= element;
        }
        return Math.exp(Math.log(gm)/vector.length);
    }

    public static boolean isThereMaxAndMin(double max, double min){
        if (min == max)
            return false;
        return true;
    }

    private static double getMax(double[] vector){
        double max = Double.MIN_VALUE;
        for(double element : vector){
            if (element > max)
                max = element;
        }
        return max;
    }

    private static double getMin(double[] vector){
        double min = Double.MAX_VALUE;
        for(double element : vector){
            if (element < min)
                min = element;
        }
        return min;
    }

    private static String toString(double[] vector){
        StringBuilder s = new StringBuilder();
        for(double x : vector)
            s.append(x + " ");
        return s.toString();
    }
}
