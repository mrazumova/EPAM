package by.epam.javatraining.mrazumova.tasks.maintask03;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Vector {

    public static void main(String[] args) throws IOException {
        int sizeOfVector = 25;
        double[] vector = new double[sizeOfVector];
        Scanner sc = new Scanner(new File("src\\by\\epam\\javatraining\\mrazumova\\tasks\\maintask03\\in.txt"));
        for (int i = 0; i < sizeOfVector; ++i){
            vector[i] = sc.nextDouble();
        }
        sc.close();

        //min and max elements in array = O(n) and O(n)
        double max = getMax(vector), min = getMin(vector);
        if (min!=max)
            System.out.println("Max: " + max + "\nMin: " + min);
        else
            System.out.println("Not found.");

        //arithmetic and geometric means of elements in array = O(n) and O(n)
        System.out.println("The geometric mean: " + findGeometricMean(vector) + "\nThe arithmetic mean: " + findArithmeticMean(vector));

        //Are elements sorted? = O(n) and O(n)
        if (isInAscendingOrder(vector) || isInDescendingOrder(vector))
            System.out.println("Sorted");
        else
            System.out.println("Not sorted");

        //indexes of first local min and max = O(n) and O(n)
        min = getIndexOfFirstLocalMin(vector);
        max = getIndexOfFirstLocalMax(vector);
        if (min == max)
            System.out.println("False");
        else{
            System.out.println("First local min: " + min);
            System.out.println("First local max: " + max);
        }

        //linear search = O(n)
        System.out.println(linearSearch(vector, 10.01));

        //binary search = O(logn) (+ quick sort = O(nlogn))
        quickSort(vector, 0, vector.length - 1);
        System.out.println(binarySearch(vector, 10.01));
        System.out.println("Quick sort: " + toString(vector));

        //reverse all elements in vector = O(n)
        double[] secondVector = {1, 2, 3, 4};
        reverseElementsInVector(secondVector);
        System.out.println("Reversed vector " + toString(secondVector));

        //bubble sort = O(n*n)
        double[] bubbleSortVector = {1, 78, 12, 34, 23, 91, 19, 11, 8, 3};
        bubbleSort(bubbleSortVector);
        System.out.println("Bubble sort: " + toString(bubbleSortVector));

        //selection sort = O(n*n)
        double[] selectionSortVector = {1, 78, 12, 34, 23, 91, 19, 11, 8, 3};
        selectionSort(selectionSortVector);
        System.out.println("Selection sort: " + toString(selectionSortVector));

        //insertion sort = O(n*n)
        double[] insertionSortVector = {1, 78, 12, 34, 23, 91, 19, 11, 8, 3};
        insertionSort(insertionSortVector);
        System.out.println("Insertion sort: " + toString(insertionSortVector));

        //merge sort = O(n*n)
        double[] mergeSortVector = {1, 78, 12, 34, 23, 91, 19, 11, 8, 3};
        mergeSort(mergeSortVector,0, mergeSortVector.length);
        System.out.println("Merge sort: " + toString(mergeSortVector));
    }

    public static void mergeSort(double[] vector, int left, int right){
        if(left + 1 < right){
            int medium = (left + right)/2;
            mergeSort(vector, left, medium);
            mergeSort(vector, medium, right);
            merge(vector, left, medium, right);
        }
    }

    private static void merge(double[] vector, int left, int medium, int right){
        double copyOfLeftArray[] = Arrays.copyOfRange(vector, left, medium);
        double copyOfRightArray[] = Arrays.copyOfRange(vector, medium, right);

        int index = left, leftIndex = 0, rightIndex = 0;

        while (leftIndex < copyOfLeftArray.length && rightIndex < copyOfRightArray.length) {
            if (copyOfLeftArray[leftIndex] < copyOfRightArray[rightIndex]) {
                vector[index] = copyOfLeftArray[leftIndex];
                ++leftIndex;
            }
            else {
                vector[index] = copyOfRightArray[rightIndex];
                ++rightIndex;
            }
            ++index;
        }

        while (leftIndex < copyOfLeftArray.length) {
            vector[index] = copyOfLeftArray[leftIndex];
            ++leftIndex;
            ++index;
        }

        while (rightIndex < copyOfRightArray.length) {
            vector[index] = copyOfRightArray[rightIndex];
            ++rightIndex;
            ++index;
        }
    }

    public static void bubbleSort(double[] vector){
        int size = vector.length;
        for(int i = 0; i < size; ++i){
            for (int j = i; j < size; ++j){
                if (vector[i] > vector[j]){
                    vector[i] += vector[j];
                    vector[j] = vector[i] - vector[j];
                    vector[i] -= vector[j];
                }
            }
        }
    }

    public static void selectionSort(double[] vector){
        int size = vector.length;
        for (int i = 1; i < size; ++i){
            int minIndex = getMinIndexInSegment(vector, i, size);
            if (vector[minIndex] < vector[i - 1]){
                vector[i - 1] += vector[minIndex];
                vector[minIndex] = vector[i - 1] - vector[minIndex];
                vector[i - 1] -= vector[minIndex];
            }
        }
    }

    public static void insertionSort(double[] vector){
        int size = vector.length;
        for(int i = 1; i < size; ++i)
            for(int j = i; j > 0 && vector[j - 1] > vector[j]; --j){
                vector[j - 1] += vector[j];
                vector[j] = vector[j - 1] - vector[j];
                vector[j - 1] -= vector[j];
            }
    }

    public static void quickSort(double[] vector, int left, int right) {
        int leftBorder = left, rightBorder = right;
        int mediumIndex = (leftBorder + rightBorder) / 2;
        do{
            while (vector[leftBorder] < vector[mediumIndex])
                ++leftBorder;
            while (vector[rightBorder] > vector[mediumIndex])
                --rightBorder;
            if (leftBorder <= rightBorder){
                swap(vector, leftBorder, rightBorder);
                ++leftBorder;
                --rightBorder;
            }
        } while (leftBorder < rightBorder);

        if (left < rightBorder)
            quickSort(vector, left, rightBorder);
        if (leftBorder < right)
            quickSort(vector, leftBorder, right);
    }

    public static void reverseElementsInVector(double[] vector){
        int size = vector.length - 1;
        int medium = (size+1)/2;
        for(int i = 0; i < medium; ++i){
            swap(vector, i, size - i);
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
        while (left <= right) {
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

    public static double getMax(double[] vector){
        double max = vector[0];
        for(double element : vector){
            if (element > max)
                max = element;
        }
        return max;
    }

    public static double getMin(double[] vector){
        double min = vector[0];
        for(double element : vector){
            if (element < min)
                min = element;
        }
        return min;
    }

    private static int getMinIndexInSegment(double[] vector, int start, int end){
        int minIndex = start;
        if (start < end){
            for (int i = start; i < end; ++i){
                if (vector[i] < vector[minIndex])
                    minIndex = i;
            }
        }
        return minIndex;
    }

    private static String toString(double[] vector){
        StringBuilder s = new StringBuilder();
        for(double x : vector)
            s.append(x + " ");
        return s.toString();
    }

    private static void swap(double[] vector, int i, int j){
        double t = vector[i];
        vector[i] = vector[j];
        vector[j] = t;
    }
}
