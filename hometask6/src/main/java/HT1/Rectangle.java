package HT1;

public class Rectangle extends Figure {

    public int str1;

    public int str2;

    public Rectangle(int str1, int str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public int perimeter() {
        return (str1 + str2) * 2;
    }

    @Override
    public int square() {
        return str1 * str2;
    }
}
