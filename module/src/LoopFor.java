/**
 * В данном классе реализован вывод в консоль чисел в диапазоне от 1 до 100 кратных цифре 4.
 */
public class LoopFor {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (multipleFour(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * В данном методе определяется кратность переданного в аргументах числа цифре 4.
     *
     * @param number Переданное число.
     * @return true - переданное число кратно цифре 4, false - переданное число не кратно цифре 4.
     */
    public static boolean multipleFour(int number) {
        return number % 4 == 0;
    }
}
