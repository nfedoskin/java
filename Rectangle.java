public class Rectangle {
    int x;
    int y;
    public Rectangle (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int returnArea () {
        int s = x * y;
        return s;
    }
    public static void main (String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 9);
        Rectangle rectangle2 = new Rectangle(10, 14);
        System.out.println("Площадь прямоугольника равна: " + rectangle1.returnArea());
        System.out.println("Площадь прямоугольника равна: " + rectangle2.returnArea());
    }
}
