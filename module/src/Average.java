import java.util.Scanner;

/**
 * В данном классе происходит вычисление среднего арифметического числа:
 * 1. Для всех чисел из заданного диапазона чисел;
 * 2. Только для чётных чисел из заданного диапазона чисел.
 */
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число диапазона чисел: ");
        int start = scanner.nextInt();
        System.out.println("Введите конечное число диапазона чисел: ");
        int end = scanner.nextInt();
        double sumNumbers = 0;
        int countNumbers = 0;
        double sumEvenNumbers = 0;
        int countEvenNumbers = 0;

        for (int i = start; i <= end; i++) {
            sumNumbers += i;
            countNumbers++;
            if (i % 2 == 0) {
                sumEvenNumbers += i;
                countEvenNumbers++;
            }
        }
        System.out.println("Среднее арифметическое равно: " + sumNumbers / countNumbers);
        System.out.println("Среднее арифметическое чётных чисел равно: " + sumEvenNumbers / countEvenNumbers);
    }
}
