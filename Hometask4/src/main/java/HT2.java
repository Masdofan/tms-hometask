import java.util.Arrays;
import java.util.Scanner;

public class HT2 {

    public static void main(String[] args) {

//        Создайте и заполните массив случайным числами и выведете
//        максимальное, минимальное и среднее значение.
//        Для генерации случайного числа используйте метод Math.random().
//        Пусть будет возможность создавать массив произвольного размера.
//        Пусть размер массива вводится с консоли.

        Scanner arrLengthIn = new Scanner(System.in);

        int arrLength = arrLengthIn.nextInt();

        int[] arr = new int [arrLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for ( int value : arr ) {
            sum += value;
        }

        System.out.println(sum);

        int arrAvg = sum / arr.length;

        System.out.println("Min: " + arr[0]);

        System.out.println("Max: " + arr[arrLength - 1]);

        System.out.println("Average: " + arrAvg);
    }
}
