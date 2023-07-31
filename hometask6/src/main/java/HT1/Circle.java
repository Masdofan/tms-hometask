package HT1;

public class Circle extends Figure {

    public int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    @Override
    public int perimeter() {
        return rad * 3;
    }

    @Override
    public int square() {
        return rad * rad;
    }
}
