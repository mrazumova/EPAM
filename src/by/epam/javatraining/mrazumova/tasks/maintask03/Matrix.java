package by.epam.javatraining.mrazumova.tasks.maintask03;

public class Matrix {

    public static void main(String[] args) {
        double[][] matrix = { {1, 2, 3}, {4 , 5, 6}, {7, 8, 9}};

        //min and max elements in array
        double max = getMax(matrix), min = getMin(matrix);
        if (max == min)
            System.out.println("No such elements.");
        else
            System.out.println("Max: " + max + "\nMin: " + min);

        //arithmetic and geometric means of elements in array
        System.out.println("Geometric mean: " + findGeometricMean(matrix));
        System.out.println("Arithmetic mean: " + findArithmeticMean(matrix));

        //Is matrix simmetric?
        System.out.println("Simmetric? " + isSimmetric(matrix));

        //indexes of first local min and max
        int[] lmax = getLocalMax(matrix);
        int[] lmin = getLocalMin(matrix);
        if(lmax[0] == 0)
            System.out.println("Local max not found.");
        else
            System.out.println("Local max is: " + matrix[lmax[0]][lmax[1]]);
        if(lmin[0] == 0)
            System.out.println("Local min not found.");
        else
            System.out.println("Local min is: " + matrix[lmin[0]][lmin[1]]);

        //transpose matrix
        System.out.println("Transpose: ");
        transpose(matrix);
        toString(matrix);
    }

    public static double getMax(double[][] matrix){
        double max = matrix[0][0];
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix[i].length; ++j){
                if (max < matrix[i][j])
                    max = matrix[i][j];
            }
        return max;
    }

    public static double getMin(double[][] matrix){
        double min = matrix[0][0];
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix[i].length; ++j){
                if (min > matrix[i][j])
                    min = matrix[i][j];
            }
        return min;
    }

    public static double findArithmeticMean(double[][] matrix){
        double am = 0.0;
        for(double[] arr : matrix)
            for(double element : arr)
                am += element;
        return am/(matrix.length*matrix[0].length);
    }

    public static double findGeometricMean(double[][] matrix){
        double gm = 0.0;
        for(double[] arr : matrix)
            for(double element : arr)
                gm += element;
        return Math.exp(Math.log(gm)/(matrix.length*matrix[0].length));
    }

    public static boolean isSimmetric(double[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i])
                    return false;
            }
        }
        return true;
    }

    public static void transpose(double [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                matrix[i][j] += matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] -= matrix[j][i];
            }
        }
    }

    public static int[] getLocalMax(double[][] matrix){
        int[] max = new int[2];
        boolean f = true;
        int rows = matrix.length - 1;
        for (int i = 1; i < rows && f; ++i){
            int cols = matrix[i].length - 1;
            for(int j = 1; j < cols && f; ++j){
                if (compareMax(matrix, i, j)) {
                    max[0] = i;
                    max[1] = j;
                    f = false;
                }
            }
        }
        return max;
    }

    public static boolean compareMax(double[][] matrix, int i, int j){
        if (matrix[i][j] > matrix[i-1][j-1] ||
                matrix[i][j] > matrix[i+1][j+1] ||
                matrix[i][j] > matrix[i+1][j-1] ||
                matrix[i][j] > matrix[i-1][j+1] ||
                matrix[i][j] > matrix[i][j-1] ||
                matrix[i][j] > matrix[i][j+1] ||
                matrix[i][j] > matrix[i+1][j] ||
                matrix[i][j] > matrix[i-1][j]) {
            return true;
        }
        return false;
    }

    public static boolean compareMin(double[][] matrix, int i, int j){
        if (matrix[i][j] < matrix[i-1][j-1] ||
                matrix[i][j] < matrix[i+1][j+1] ||
                matrix[i][j] < matrix[i+1][j-1] ||
                matrix[i][j] < matrix[i-1][j+1] ||
                matrix[i][j] < matrix[i][j-1] ||
                matrix[i][j] < matrix[i][j+1] ||
                matrix[i][j] < matrix[i+1][j] ||
                matrix[i][j] < matrix[i-1][j]) {
            return true;
        }
        return false;
    }

    public static int[] getLocalMin(double[][] matrix){
        int[] min = new int[2];
        boolean f = true;
        int rows = matrix.length - 1;
        for (int i = 1; i < rows && f; ++i){
            int cols = matrix[i].length - 1;
            for(int j = 1; j < cols && f; ++j){
                if(compareMin(matrix, i, j)){
                    min[0] = i;
                    min[1] = j;
                }
            }
        }
        return min;
    }

    public static void toString(double[][] matrix){
        for(double[] array : matrix) {
            for (double element : array)
                System.out.print(element + " ");
            System.out.println();
        }
        System.out.println();
    }
}
