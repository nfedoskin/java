public class Main {

    static void minAge (int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("Наименьшее значение: " + a);
        } else if (b < a && b < c) {
            System.out.println("Наименьшее значение: " + b);
        } else {
            System.out.println("Наименьшее значение: " + c);
        }
    }

    static void average (int a, int b, int c) {
        System.out.println("Среднее значение: " + ((a + b + c) / 3));
    }

    static void vowelNumber (String str1) {
        int count = 0;
        String str2 = "AEIOUYaeiouy";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println("Количество гласных в строке: " + count);
    }

    static void word (String str) {
        String[] subStr = str.split(" ");
        System.out.println("Количество слов в строке: " + subStr.length);
    }

    static void number (int num) {
        String str = Integer.toString(num);
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) == '2')
                a++;
        }
        System.out.println("Количество цифр 2 в числе: " + a);
    }

    static void vowels (String str1) {
        boolean a = true;
        String str2 = "AEIOUYaeiouy";
        for (int i = 0; i < str1.length(); i++) {
            if (a == true) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) != str2.charAt(j))
                        a = false;
                    else {
                        a = true;
                        break;
                    }
                }
            }
            else break;
        }
        System.out.println("Ожидаемый результат: " + a);
    }

    static void area (int n, int len) {
        double s = 0;
        s = (n / 4 * Math.pow(len, 2) * (1.0 / Math.tan(Math.PI / n)));
        System.out.println("Площадь пятиугольника равна " + s);
    }

    static void sumOfNumber (String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.digit(str.charAt(i), 10);
        }
        System.out.println("Сумма = " + sum);
    }

    public static void main (String [] args) {

        minAge(25, 37, 29);

        average(25, 45,65);

        vowelNumber("DarTech123");

        word("Java is good to learn Object Oriented programming.");

        number(1254212);

        vowels("AIEEE");

        area(5, 6);

        sumOfNumber("252");
    }
}