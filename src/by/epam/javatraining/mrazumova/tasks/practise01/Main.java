package by.epam.javatraining.mrazumova.tasks.practise01;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("by/epam/javatraining/mrazumova/tasks/practise01/in.txt"));
            int n = sc.nextInt();
            if (n < 0)
                throw new Exception("Incorrect value of n.");

            int [] array = new int[n];
            for (int i = 0; i < n; ++i) {
                array[i] = sc.nextInt();
            }

            if (isMarks(array))
                sort(array);
            System.out.println(Arrays.toString(array));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static boolean isMarks(int[] array) throws Exception{
        for (int value : array) {
            if (value > 10 || value < 1)
                throw new Exception("Incorrect marks");
        }
        return true;
    }

    private static void sort(int[] array){
        int index = 0;
        for(int j = 10; j > 5; j -= 2){
            for(int i = 0; i < array.length; ++i){
                if(array[i] == j){
                    swap(array, index, i);
                    ++index;
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
