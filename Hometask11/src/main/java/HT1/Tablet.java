package HT1;

public class Tablet {

    private String brand;

    private int price;

    public Tablet(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
