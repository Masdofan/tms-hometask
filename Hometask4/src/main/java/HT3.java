import java.util.Arrays;

public class HT3 {

    public static void main(String[] args) {

//        Создайте 2 массива из 5 чисел.
//        Выведите массивы на консоль в двух отдельных строках.
//        Посчитайте среднее арифметическое элементов каждого массива и
//        сообщите, для какого из массивов это значение оказалось больше (либо
//        сообщите, что их средние арифметические равны).

        int[] arr1 = new int[] {2, 6, 10, 15, 21};

        int[] arr2 = new int[] {1, 5, 9, 14, 20};

        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr2));

        int arr1Average = (arr1[0] + arr1[1] + arr1[2] + arr1[3] + arr1[4]) / 2;

        int arr2Average = (arr2[0] + arr2[1] + arr2[2] + arr2[3] + arr2[4]) / 2;

        if (arr1Average > arr2Average) {
            System.out.println("array 1 arithmetic mean greatest");
        } else if (arr1Average < arr2Average) {
            System.out.println("array 2 arithmetic mean greatest");
        } else {
            System.out.println("arrays are equal");
        }
    }
}
