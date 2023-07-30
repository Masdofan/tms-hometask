import java.util.Arrays;
import java.util.Scanner;

public class HT1 {

    public static void main(String[] args) {

//        Создайте массив целых чисел. Удалите все вхождения заданного
//        числа из массива.
//        Пусть число задается с консоли (класс Scanner). Если такого числа нет -
//        выведите сообщения об этом.
//        В результате должен быть новый массив без указанного числа.

        Scanner input = new Scanner(System.in);

        int[] sourse = new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45};

        int value = input.nextInt();

        int count = 0;

        for ( int el : sourse ) {
            if (el != value) {
                count++;
            }
        }

        int[] destenation = new int[count];

        int indexDest = 0;

        for (int i = 0; i < sourse.length; i++) {
            if (sourse[i] != value) {
                destenation[indexDest] = sourse[i];
                indexDest++;
            }
        }

        System.out.println(Arrays.toString(destenation));


    }
}
