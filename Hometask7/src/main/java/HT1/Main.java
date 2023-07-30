package HT1;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone(220, "Iphone");
        Phone phone2 = new Phone(114, "Samsung", 500);
        Phone phone3 = new Phone(308, "Xiaomi", 400);

        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Weight: " + phone1.getWeight());
        phone1.receiveCall("Олег");

        System.out.println("Phone 2:");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.getModel());
        System.out.println("Weight: " + phone2.getWeight());
        phone2.receiveCall("Вася");

        System.out.println("Phone 3:");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.getModel());
        System.out.println("Weight: " + phone3.getWeight());
        phone3.receiveCall("Петя");

        phone2.receiveCall("Женя", 203);

        phone1.sendMessage(101, 102, 103);

    }

}
