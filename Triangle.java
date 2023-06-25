public class Triangle {
    int x;
    int y;
    int z;
    public Triangle (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static void main (String[] args) {
        Triangle myTriangle = new Triangle(3, 4, 5);
        double s;
        int p;
        p = myTriangle.x + myTriangle.y + myTriangle.z;
        s = Math.sqrt((p/2) * ((p/2) - myTriangle.x) * ((p/2) - myTriangle.y) * ((p/2) - myTriangle.z));
        System.out.println("Периметр треуголника равен: " + p);
        System.out.println("Площадь треугольника равна: " + s);
    }
}
