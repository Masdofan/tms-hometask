package HT1;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[5];

        figures[0] = new Rectangle(10, 20);
        figures[1] = new Rectangle(5, 12);
        figures[2] = new Triangle(1, 2, 3);
        figures[3] = new Circle(28);
        figures[4] = new Triangle(4, 5, 6);

        int sum = 0;

        for (Figure figure : figures) {
            int perimeter = figure.perimeter();
            sum = sum + perimeter;
        }

        System.out.println(sum);




    }
}
