import java.util.Scanner;

public class HT0 {

    public static void main(String[] args) {
//        Создайте массив целых чисел. Напишете программу, которая выводит
//        сообщение о том, входит ли заданное число в массив или нет.
//        Пусть число для поиска задается с консоли (класс Scanner).

        Scanner input = new Scanner(System.in);

        int[] arr = new int[]{10, 15, 20, 30, 40};

        int found = input.nextInt();

        for(int el : arr ) {

            if (el == found) {
                System.out.println("Found");
            }


        }


    }
}
