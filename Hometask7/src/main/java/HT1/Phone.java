package HT1;

import java.util.Arrays;

public class Phone {

//    Класс Phone.
//    Создайте класс Phone, который содержит переменные number, model и
//    weight.
//    Создайте три экземпляра этого класса.
//    Выведите на консоль значения их переменных.
//    Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
//    звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
//    возвращает номер телефона. Вызвать эти методы для каждого из
//    объектов.
//    Добавить конструктор в класс Phone, который принимает на вход три
//    параметра для инициализации переменных класса - number, model и
//    weight.
//    Добавить конструктор, который принимает на вход два параметра для
//    инициализации переменных класса - number, model.
//    Добавить конструктор без параметров.
//    Вызвать из конструктора с тремя параметрами конструктор с двумя.
//    Добавьте перегруженный метод receiveCall, который принимает два
//    параметра - имя звонящего и номер телефона звонящего. Вызвать этот
//    метод.
//    Создать метод sendMessage с аргументами переменной длины. Данный
//    метод принимает на вход номера телефонов, которым будет отправлено
//    сообщение. Метод выводит на консоль номера этих телефонов.

    public int number;

    public String model;

    public int weight;

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name, int numberCall) {
        System.out.println("Звонит " + name);
        System.out.println("Номер: " + numberCall);
    }

    public void sendMessage(int ... number) {
        System.out.println("Номера телефонов: " + Arrays.toString(number));
    }

}



