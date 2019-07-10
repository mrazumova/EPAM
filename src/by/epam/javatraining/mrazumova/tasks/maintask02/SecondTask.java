package by.epam.javatraining.mrazumova.tasks.maintask02;
import java.util.Random;

public class SecondTask {

    public static void main(String[] args) {
        //first task
        getDropsAndCount();
        //second task
        System.out.println("Max numeral: " + maxNumeral(756456));
        System.out.println("Palindrom: " + isPalindrom(756456));
        System.out.println("Prime: " + isPrime(756456));
        System.out.print("Prime dividers: "); getPrimeDividers(756456);
        System.out.println("Greatect common divider: " + getGCD(86, 756456) +
                "\nLeast common multiple: " + getLCM(86, 756456));
        System.out.println("Number of different numerals: " + getNumberOfDifferentNumerals(756456));
        //task 3
        System.out.println("Is number perfect? - " + isPerfectNumber(497));
        //task 4
        System.out.println("Friend numbers search: ");
        findFriendNumbers(0, 3000);
    }

    public static void getDropsAndCount(){
        int headsCount = 0, numberOfDrops = 100000;
        Random random = new Random();
        for (int i = 0; i < numberOfDrops; ++i){
            if (random.nextBoolean())
                ++headsCount;
        }
        System.out.println("Heads:" + headsCount + "; tails: " + Integer.toString(numberOfDrops - headsCount));
    }

    public static int maxNumeral(long number){
        int max = 0;
        while (number!=0){
            if(number%10>max)
                max = (int) number % 10;
            number /= 10;
        }
        return max;
    }

    public static boolean isPalindrom(long number){
        long n = number/10;
        long reverse = number%10;
        while (n!=0){
            reverse = reverse * 10 + n%10;
            n /= 10;
        }
        if (number == reverse)
            return true;
        return false;
    }

    public static boolean isPrime(long number){
        for (int i = 2; i <= Math.pow(number, 0.5); ++i){
            if(number%i==0)
                return false;
        }
        return true;
    }

    public static long getLCM(long num, long number){
        return num*number/getGCD(num, number);
    }

    public static long getGCD(long num, long number){
        return gcd(num, number);
    }

    private static long gcd(long n1, long n2){
        if (n2==0)
            return n1;
        return gcd(n2, n1%n2);
    }

    public static void getPrimeDividers(long number){
        for (int i = 2; i <= Math.pow(number, 0.5); ++i){
            if (isPrime(i))
                if (number%i==0)
                    System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void findFriendNumbers(int start, int end){
        for(int i = start; i < end + 1; ++i){
            for (int j = i + 1; j < end + 1; ++j){
                if (isFriendNumber(i, j))
                    System.out.print("[" + i + ", " + j +"]  ");
            }
        }
    }

    public static boolean isFriendNumber(int num1, int num2){
        if (getSummOfDividers(num1) == num2 && getSummOfDividers(num2) == num1)
            return true;
        return false;
    }

    public static int getNumberOfDifferentNumerals(long number){
        int count = 0;
        for(int i = 0; i < 10; ++i) {
            for(long num = number; num != 0L; num /= 10L) {
                if (num % 10L == (long)i) {
                    ++count;
                    break;
                }
            }
        }
        return count;
    }

    public static boolean isPerfectNumber(int number){
        if (getSummOfDividers(number) == number)
            return true;
        return false;
    }

    public static int getSummOfDividers(int number){
        int dividers = 0;
        for (int i = 1; i < number; ++i){
            if (number%i==0)
                dividers += i;
        }
        return dividers;
    }
}
