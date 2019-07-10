package by.epam.javatraining.mrazumova.tasks.maintask01;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SomeTasksAdded {
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
                default:
                    break;
            }
        }
    }

    static void task1(){
        System.out.print("Enter coordinates: ");
        int ax, ay, bx, by, cx, cy;
        ax = sc.nextInt(); ay = sc.nextInt();
        bx = sc.nextInt(); by = sc.nextInt();
        cx = sc.nextInt(); cy = sc.nextInt();
        double a = Math.pow((Math.pow(ax-bx, 2) + Math.pow(ay-by, 2)), 0.5);
        double b = Math.pow((Math.pow(ax-cx, 2) + Math.pow(ay-cy, 2)), 0.5);
        double c = Math.pow((Math.pow(cx-bx, 2) + Math.pow(cy-by, 2)), 0.5);
        if ((a+b > c)&& (a+c > b) &&(b+c > a)){
            if ((c>a && c>b && a*a+b*b==c*c)
                    ||(a>c && a>b && c*c+b*b==a*a)
                    ||(b>a && b>c && a*a+c*c==b*b))
                System.out.println("Right triangle");
            else
                System.out.println("Triangle");
        }
        else
            System.out.println("Not triangle");
    }

    static void task2(){
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        int heads = 3;
        if (age > 299)
            heads += age - 299;
        if (age > 199)
            heads += (Math.min(299, age) - 199)*2;
        heads += Math.min(199, age) * 3;
        System.out.println("Number of heads: " + heads + ", number of eyes: " + heads*2);
    }

    static void task3(){
        System.out.print("Enter letter: ");
        char letter = sc.next().toLowerCase().charAt(0);
        variant1(letter);
        variant2(letter);
        variant3(letter);
        variant4(letter);
        variant5(letter);
    }

    static void task4(){
        System.out.print("Enter date as dd mm yyyy: ");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        boolean isExist = true;
        if (dd == daysInMonth(mm, yyyy)){
            if (mm == 12){
                ++yyyy;
                dd = 1; mm = 1;
            }
            else {
                if (mm > 0 && mm < 12) {
                    dd = 1;
                    ++mm;
                } else
                    isExist = false;
            }
        }
        else {
            if (dd > 0 && dd < daysInMonth(mm, yyyy))
                ++dd;
            else
                isExist = false;
        }
            if (isExist)
                System.out.println("Next date is " + dd + " " + mm + " " + yyyy);
            else
                System.out.println("Date not exist.");
    }

    static void variant1(char l){
        String letter = Character.toString(l);
        if (letter.equals("a") || letter.equals("e") || letter.equals("y")
                || letter.equals("u") || letter.equals("i") || letter.equals("o"))
            System.out.print("true ");
        else
            System.out.print("false ");
    }

    static void variant2(char l){
        String letter = Character.toString(l);
        if (Pattern.compile("[aeyuio]").matcher(letter).matches())
            System.out.print("true ");
        else
            System.out.print("false ");
    }

    static void variant3(char letter){
        if (letter == 97 || letter == 101
                || letter == 105 || letter == 111 || letter == 117
                || letter == 121)
            System.out.print("true ");
        else
            System.out.print("false ");
    }

    static void variant4(char letter){
        if (Character.toString(letter).contains("a") ||
                Character.toString(letter).contains("e") ||
                Character.toString(letter).contains("y")||
                Character.toString(letter).contains("u") ||
                Character.toString(letter).contains("i") ||
                Character.toString(letter).contains("o"))
            System.out.print("true ");
        else
            System.out.print("false ");
    }

    static void variant5(char letter){
        switch (letter){
            case 'a':
                System.out.println("true");
                break;
            case 'e':
                System.out.println("true");
                break;
            case 'y':
                System.out.println("true");
                break;
            case 'u':
                System.out.println("true");
                break;
            case 'i':
                System.out.println("true");
                break;
            case 'o':
                System.out.println("true");
                break;
            default:
                System.out.println("false");
        }
    }

    static boolean isLeapYear(int year){
        if ((year%400 == 0) || (year%4 == 0 && year % 100!=0))
            return true;
        return false;
    }

    static int daysInMonth(int month, int year){
        if (month == 2)
            if (isLeapYear(year))
                return 29;
            else
                return 28;
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;
        return 30;
    }

}
