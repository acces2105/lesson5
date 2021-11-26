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

        int fibonachi = fibonachi(index, 0, 1);
        System.out.println("Число Фибоначчи = " + fibonachi);
    }

    // метод вычисления Фибоначчи в цикле от числа переданного через консоль...
    public static int fibonachi(int index, int arg0, int arg1) {
        if (index == 0) {
            return arg0;
        }
        if (index == 1) {
            return arg1;
        } else {
            for (long i = 0; i <= index; ++i) {
                int next = arg0 + arg1;
                arg0 = arg1;
                arg1 = next;
            }
            return arg1;
        }
    }
}

        //    //if (i*i == index)
        //  return i++;
        /// return index;
        // }
        // return "";

        //}
//public static int fibonachi(int index) {
      //  for (int i = 1; i<index; ++i) //{
        //    //if (i*i == index)
          //  return i++;
       /// return index;
   // }
    // return "";

    //}
//}