package HT1;

public class Triangle extends Figure {

    public int str1;

    public int str2;

    public int str3;

    public Triangle(int str1, int str2, int str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    @Override
    public int perimeter() {
        return str1 + str2 + str3;
    }

    @Override
    public int square() {
        return str1 * str2 * str3;
    }
}
