package by.epam.javatraining.mrazumova.tasks.hometask01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n < 0)
                throw new Exception("n should be more than 0.");
            System.out.println("The result is: " + getSum(n));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static double getSum(int n){
        double sum = 1;
        double curr = 1;
        for (int i = 1; i < n; ++i){
            curr *= -2.0/i;
            sum += curr;
        }
        return sum;
    }
}
