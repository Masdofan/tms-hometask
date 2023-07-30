import java.util.Scanner;

public class HT3evenodd {

    public static void main(String[] args) {
        /*Напишите программу, которая будет принимать на вход число и на
выход будет выводить сообщение четное число или нет. */
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        int value = input.nextInt();
        int remain = value % 2;
        if (remain == 0){
            System.out.println("Число четное");
        }else if (remain != 0){
            System.out.println("Число нечетное");
        }

    }
}
