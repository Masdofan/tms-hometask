import java.util.Scanner;

public class HT7sumFrom1ToInput {

    public static void main(String[] args) {

//        Напишите программу, где пользователь вводит любое целое
//        положительное число. А программа суммирует все числа от 1 до
//        введенного пользователем числа.

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum = sum + i;
            System.out.println(sum);
        }

    }
}
