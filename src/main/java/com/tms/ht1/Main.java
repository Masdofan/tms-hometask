package com.tms.ht1;

public class Main {

//    Напишите программу, которая создает три объекта класса CreditCard у
//    которых заданы номер счета и начальная сумма
//    Тестовый сценарий для проверки:
//    Положите деньги на первые две карточки и снимите с третьей.
//    Выведите на экран текущее состояние всех трех карточек.

    public static void main(String[] args) {

        CreditCard cc1 = new CreditCard(1, 1000);  //Мне лень писать (и придумывать) 16-ти значные
                                                                      //числа поэтому будет 1,2,3
        CreditCard cc2 = new CreditCard(2, 10000);

        CreditCard cc3 = new CreditCard(3, 20000);

        cc1.balancePlus(421);

        cc2.balancePlus(2000);

        cc3.balanceMinus(21000);

        cc1.getInfo();
        cc2.getInfo();
        cc3.getInfo();

    }
}
