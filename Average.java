public class Average {
    public void returnAverage (int x, int y, int z) {
        double aver = (x + y + z) / 2;
        System.out.println("Среднее значение трех чисел: " + aver);
    }
    public static void main (String[] args) {
        Average average = new Average();
        average.returnAverage(3, 4, 5);
    }
}
