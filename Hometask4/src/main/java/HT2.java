import java.util.Arrays;
import java.util.Scanner;

public class HT2 {

    public static void main(String[] args) {

//        Создайте и заполните массив случайным числами и выведете
//        максимальное, минимальное и среднее значение.
//        Для генерации случайного числа используйте метод Math.random().
//        Пусть будет возможность создавать массив произвольного размера.
//        Пусть размер массива вводится с консоли.

        Scanner arrLength = new Scanner(System.in);

        double[] arr = new double [arrLength.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        System.out.println(Arrays.toString(arr));
    }
}
