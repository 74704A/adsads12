import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task7();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(findMinimum(array));
    }

    private static int findMinimum(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for(int value : array) {
            if(value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(calculateAverage(array));
    }

    private static double calculateAverage(int[] array) {
        double sum = 0;
        for(int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num) ? "Prime" : "Composite");
    }

    private static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if(num == 0) return 1;
        return num * factorial(num - 1);
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        int fibonacciNum = sc.nextInt();
        System.out.println(fibonacci(fibonacciNum));
    }

    private static int fibonacci(int num) {
        if(num == 0) return 0;
        if(num == 1) return 1;
        return fibonacci(num - 2) + fibonacci(num - 1);
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        System.out.println(pow(base, exponent));
    }

    private static int pow(int base, int exponent) {
        if(exponent == 0) return 1;
        return base * pow(base, exponent - 1);
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        permute(input.toCharArray(), 0, input.length() - 1);
    }

    private static void permute(char[] word, int start, int end) {
        if(start == end) {
            System.out.println(String.valueOf(word));
        } else {
            for(int i = start; i <= end; i++) {
                swap(word, start, i);
                permute(word, start + 1, end);
                swap(word, start, i);
            }
        }
    }

    private static void swap(char[] word, int i, int j) {
        char temp = word[i];
        word[i] = word[j];
        word[j] = temp;
    }

    public static void task8() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isDigit(str) ? "Yes" : "No");
    }

    private static boolean isDigit(String str) {
        for(char c : str.toCharArray()) {
            if(!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static void task9() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomialCoefficient(n, k));
    }

    private static int binomialCoefficient(int n, int k) {
        if(k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void task10() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(euclideanAlgorithm(a, b));
    }

    private static int euclideanAlgorithm(int a, int b) {
        if(b == 0) return a;
        return euclideanAlgorithm(b, a % b);
    }
}
    // O(n)
    // O(n)
    // O(sqrt(n))
    // O(n)
    // O(2^n)
    // O(n)
    // O(n!)
    // O(n)
    // O(n*k)
    // O(log(min(a, b)))
