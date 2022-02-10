import java.util.Scanner;
/*
 * В данном классе происходит чтение целого числа из консоли и следующие действия с ним:
 * 1. Нахождение суммы цифр из которых оно состоит;
 * 2. Нахождения нечётных цифр из которых состоит число;
 * 3. Нахождение максимальной цифры числа.
 */

public class Numbers {
    public static void main(String[] args) {
        int sumNumbers = 0; // Сумма цифр числа.
        int sumOddNumbers = 0; // Сумма нечётных цифр числа.
        int maxNumber = 0; // Максимальная цифра числа.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();

        while (number > 0) {
            if (maxNumber < number % 10) {
                maxNumber = number % 10;
            }
            if (!((number % 10) % 2 == 0)) {
                sumOddNumbers += number % 10;
            }
            sumNumbers += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр числа равна: " + sumNumbers);
        System.out.println("Сумма нечётных цифр числа равна: " + sumOddNumbers);
        System.out.println("Максимальная цифра числа равна: " + maxNumber);
    }
}
