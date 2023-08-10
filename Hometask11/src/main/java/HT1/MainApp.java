package HT1;

public class MainApp {

    public static void main(String[] args) {

        Phone phone1 = new Phone("brand1", 10000);
        Phone phone2 = new Phone("brand2", 20000);
        Phone phone3 = new Phone("brand3", 30000);
        Phone phone4 = new Phone("brand4", 40000);
        Phone phone5 = new Phone("brand5", 50000);
        Phone phone6 = new Phone("brand6", 60000);
        Phone phone7 = new Phone("brand7", 70000);
        Phone phone8 = new Phone("brand8", 80000);
        Phone phone9 = new Phone("brand9", 90000);
        Phone phone10 = new Phone("brand10", 100000);
        Phone phone11 = new Phone("brand11", 110000);
        Phone phone12 = new Phone("brand12", 120000);

        GenericCollection<Phone> phoneCollection = new CollectionImpl<>();

        phoneCollection.add(phone1);
        phoneCollection.add(phone2);
        phoneCollection.add(phone3);
        phoneCollection.add(phone4);
        phoneCollection.add(phone5);
        phoneCollection.add(phone6);
        phoneCollection.add(phone7);
        phoneCollection.add(phone8);
        phoneCollection.add(phone9);
        phoneCollection.add(phone10);
        phoneCollection.add(phone11);
        phoneCollection.add(phone12);

        phoneCollection.showCollection();

        System.out.println(phoneCollection.getElem(5).toString());

//        ------------------------------------------------------------


        Tablet tablet1 = new Tablet("brand1", 10000);
        Tablet tablet2 = new Tablet("brand2", 20000);
        Tablet tablet3 = new Tablet("brand3", 30000);
        Tablet tablet4 = new Tablet("brand4", 40000);
        Tablet tablet5 = new Tablet("brand5", 50000);
        Tablet tablet6 = new Tablet("brand6", 60000);
        Tablet tablet7 = new Tablet("brand7", 70000);
        Tablet tablet8 = new Tablet("brand8", 80000);
        Tablet tablet9 = new Tablet("brand9", 90000);
        Tablet tablet10 = new Tablet("brand10", 100000);
        Tablet tablet11 = new Tablet("brand11", 110000);
        Tablet tablet12 = new Tablet("brand12", 120000);

        GenericCollection <Tablet> tabletCollection = new CollectionImpl<>();

        tabletCollection.add(tablet1);
        tabletCollection.add(tablet2);
        tabletCollection.add(tablet3);
        tabletCollection.add(tablet4);
        tabletCollection.add(tablet5);
        tabletCollection.add(tablet6);
        tabletCollection.add(tablet7);
        tabletCollection.add(tablet8);
        tabletCollection.add(tablet9);
        tabletCollection.add(tablet10);
        tabletCollection.add(tablet11);
        tabletCollection.add(tablet12);

        tabletCollection.showCollection();

        tabletCollection.delete(8);

        tabletCollection.showCollection();

//        ------------------------------------------------------------

        Laptop laptop1 = new Laptop("brand1", 10000);
        Laptop laptop2 = new Laptop("brand2", 20000);
        Laptop laptop3 = new Laptop("brand3", 30000);
        Laptop laptop4 = new Laptop("brand4", 40000);
        Laptop laptop5 = new Laptop("brand5", 50000);
        Laptop laptop6 = new Laptop("brand6", 60000);
        Laptop laptop7 = new Laptop("brand7", 70000);
        Laptop laptop8 = new Laptop("brand8", 80000);
        Laptop laptop9 = new Laptop("brand9", 90000);
        Laptop laptop10 = new Laptop("brand10", 100000);
        Laptop laptop11 = new Laptop("brand11", 110000);
        Laptop laptop12 = new Laptop("brand12", 120000);

        GenericCollection <Laptop> laptopCollection = new CollectionImpl<>(15);

        laptopCollection.add(laptop1);
        laptopCollection.add(laptop2);
        laptopCollection.add(laptop3);
        laptopCollection.add(laptop4);
        laptopCollection.add(laptop5);
        laptopCollection.add(laptop6);
        laptopCollection.add(laptop7);
        laptopCollection.add(laptop8);
        laptopCollection.add(laptop9);
        laptopCollection.add(laptop10);
        laptopCollection.add(laptop11);
        laptopCollection.add(laptop12);

        laptopCollection.showCollection();

        System.out.println(laptopCollection.contains(laptop7));

        laptopCollection.clear();

        laptopCollection.showCollection();


    }

}
