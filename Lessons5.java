public class Lessons5 {
    public static void main(String[] args) {

        /*
        // Первая задача
        int a = 2, b = 2;
        if (a == b) {
            System.out.println("Квадрат");
        }
            else {
                System.out.println("Прямоугольник");
            }

        // Вторая задача
        int price = 5500;
        if (price >= 5000) {
            System.out.println("Итого: " + (price - (price * 0.1)));
        } else {
            System.out.println("Итого: " + price);
        }

        // Третья задача
        int grade = 56;
        if (grade < 25) {
            System.out.println("Ваша оценка - F");
        } else if ((grade >= 25) && (grade < 45) ) {
            System.out.println("Ваша оценка - E");
        } else if ((grade >= 45) && (grade < 50) ) {
            System.out.println("Ваша оценка - D");
        } else if ((grade >= 50) && (grade < 60) ) {
            System.out.println("Ваша оценка - C");
        } else if ((grade >= 60) && (grade < 80) ) {
            System.out.println("Ваша оценка - B");
        } else {
            System.out.println("Ваша оценка - A");
        }

        // Четвертая задача
        int a = 12345;
        int b = 0;
        do {
            b = a % 10;
            System.out.print(b);
            a /= 10;
        }
        while (a > 0);

        // Пятая задача
        int a = 21;
        for (int i = 2;  i < a; i++) {
            if ((a % i) == 0) {
                System.out.println(a + " Не простое число");
                break;
            }
            if ((i+1) == a) {
                System.out.println(a + " Простое число");
            }
        }

        //Шестая задача
        for (int i = 1; i < 41; i++) {
            System.out.print("*");
            if ((i % 10) == 0 ) {
                System.out.println("");
            }
        }
        int a = 0;
        for (int i = 1; i < 6; i++) {
            do {
                System.out.print("*");
                a++;
            } while (a < i);
            System.out.println("");
            a = 0;
        }

        //Седьмая задача
        int a = 2, b = 5, i = a;
        do {
            ++i;
            a = a + i;
        } while (i < b);
        System.out.println("Сумма натуральных чисел = " + a);

        //Восьмая задача
        int salary = 50;
        char cls = 'C';
        if (cls == 'A') {
            System.out.println("Зарпалата вместе с бонусами = " + (salary + salary * 0.5));
        } else if (cls == 'B') {
            System.out.println("Зарпалата вместе с бонусами = " + (salary + salary * 0.25));
        }   else System.out.println("Зарплата = " + salary);

         */
        //Девятая задача
        int n = 10, a = 0, b = 1, c = 0;
        for (int i = 0; i <= n; i++) {
            a = b + c;
            System.out.print(a + " ");
            b = c;
            c = a;            ;
        }

    }
}
