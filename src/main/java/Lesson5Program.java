import java.util.Scanner;
public class Lesson5Program {
    public static void main(String[] args) {
        System.out.println("Условие: Вывести n-ый член последовательности Фибоначчи");
        Scanner scanner = new Scanner(System.in);

            System.out.println("Введите число");
            while (!scanner.hasNextInt()) {
                String text = scanner.next();
                System.out.println("Вы ввели - " + text + ".Введите только целое число !");
            }
            int index = scanner.nextInt();
            System.out.println("Сделан правильный ввод " + index);

            int fibonachi = fibonachi(index);
            System.out.println("Число Фибоначчи = " + fibonachi);

    }
    public static int fibonachi(int index) {
        for (int i = 1; i >= index; i++) {
            if (i * i == index)
            return i;
        }

    }
}