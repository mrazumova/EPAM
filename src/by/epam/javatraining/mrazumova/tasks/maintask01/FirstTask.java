package by.epam.javatraining.mrazumova.tasks.maintask01;
import java.util.Scanner;

public class FirstTask {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 8;
        while (number!=0){
            System.out.print("Enter number of task or 0 to exit: ");
            number = sc.nextInt();
            switch(number){
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                case 6:
                    task6();
                    break;
                case 7:
                    task7();
                    break;
                default:
                    break;
            }
        }
    }

    static void task1(){
        System.out.print("Enter 3 numbers: ");
        int a, b, c;
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        if (a==b && a==c)
            System.out.println("Numbers are equal.");
        else
            System.out.println("Numbers are not equal.");
    }

    static void task2(){
        System.out.print("Enter weight: ");
        double kg;
        kg = sc.nextDouble();
        System.out.print("In miligramms:" + kg*1000000 +"\n" +
                "In gramms:" + kg * 1000 +"\n" +
                "In tons:" + kg/1000 +"\n");
    }

    static void task3(){
        System.out.print("Enter R1, R2: ");
        double r1, r2;
        r1 = sc.nextDouble(); r2 = sc.nextDouble();
        System.out.println("Square is " + Math.PI*(r1*r1 - r2*r2));
    }

    static void task4(){
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int last;
        boolean flag = true;
        for (int i = 0; i < 3; ++i){
            last = n % 10;
            n = n/10;
            if (n%10 > last)
                flag = false;
        }
        if (flag)
            System.out.println("Increasing sequence");
        else
            System.out.println("Decreasing sequence");
    }

    static void task5(){
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        double arifm = 0.0, geom = 1.0;
        for (int i = 0; i < 7; ++i){
            arifm += n % 10;
            geom *= n % 10;
            n = n / 10;
        }
        System.out.println("The geometric mean: " + arifm/7 + "\nThe arithmetic mean: " + Math.exp(Math.log(geom)/7));
    }

    static void task6(){
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int reverse = 0;
        for (int i = 0; i < 6; ++i){
            reverse += n % 10;
            reverse *= 10;
            n = n /10;
        }
        reverse += n;
        System.out.println("Reverse number: " + reverse);
    }

    static void task7(){
        System.out.print("Enter a, b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a is: " + a + ", b is: " + b);
    }
}
