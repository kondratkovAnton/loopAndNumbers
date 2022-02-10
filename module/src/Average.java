/**
 * В данном классе происходит вычисление среднего арифметического числа:
 * 1. Для всех чисел из заданного диапазона чисел;
 * 2. Только для чётных чисел из заданного диапазона чисел.
 */
public class Average {
    public static void main(String[] args) {
        int start = 3; // Начальное число диапазона чисел.
        int end = 15; // Конечное число диапазона чисел.
        double sumNumbrs = 0; // Сумма чисел из диапазона чисел.
        int countNumbers = 0; // Количество чисел в диапазоне чисел.
        double sumEvenNumbers = 0; // Сумма чётных чисел из диапазона чисел.
        int countEvenNumbers = 0; // Количество чётных чисел в диапазоне чисел.

        for (int i = start; i <= end; i++) {
            sumNumbrs += i;
            countNumbers++;
            if (i % 2 == 0) {
                sumEvenNumbers += i;
                countEvenNumbers++;
            }
        }
        System.out.println("Среднее арифметическое равно: " + sumNumbrs / countNumbers);
        System.out.println("Среднее арифметическое чётных чисел равно: " + sumEvenNumbers / countEvenNumbers);
    }
}
