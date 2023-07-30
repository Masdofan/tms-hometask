public class HT5odd199 {

    public static void main(String[] args) {

        //При помощи цикла for вывести на экран нечетные числа от 1 до 99

        for (int i = 1; i <= 99; i++){
            int odd = i % 2;
            if (odd == 0){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }

}
