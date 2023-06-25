public class Student {

    String name;
    String surname;
    String address;
    int id;

    public String toString () {
        return String.format("Имя: %s, Фамилия: %s, Адрес: %s, id: %d", name, surname, address, id);
    }

    public static void main (String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.name = "Алиса";
        student1.surname = "Смит";
        student1.address = "Коктем-2";
        student1.id = 24;

        student2.name = "Азамат";
        student2.surname = "Мусагалиев";
        student2.address = "Абылай-Хана";
        student2.id = 10;

        student3.name = "Кристина";
        student3.surname = "Орбакайте";
        student3.address = "Москва";
        student3.id = 15;

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
