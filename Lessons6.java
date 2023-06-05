public class Lessons6 {
    public static void main(String[] args) {

      //Первая задача
      int [] array = {1, 3, 4, 1, 5, 5};
      double a = 0;
      for (int i = 0; i < array.length; i++) {
          a += array [i];
      }
      System.out.printf("Среднее значение = %f", (a / array.length));


       //Вторая задача
       int [] array = {1, 3, 4, 1, 5, 5};
       for (int i = 0; i < array.length; i++) {
           for (int j = i + 1; j < array.length; j++) {
               if ( array[i] == array[j]) {
                   System.out.print(array[i] + " ");
                }
            }
        }

        //Третья задача
        int [] array = {1, 3, -6, 23, 14, 2};
        int x = 0, a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                a = 1;
            }
        }
        if (a == 1) {
            System.out.print("True");
        } else System.out.print("False");


        //Четвертая задача
        int [] array = {1, 3, -6, 23, 14, 2};
        int x = 5, a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                a = i;
            }
        }
        if (a != 0) {
            System.out.print("Индекс = " + a);
        } else System.out.print("Не найдено");


        //Пятая задача
        int [] array1 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int [] array2 = {1, 3, -6, 23, 14, 2};
        int n1 = 3, m1 = 8, n2 = 1, m2 = 3;
        System.out.print("[ ");
        for (int i = n1; i <= m1; i++) {
            System.out.print(array1 [i] + " ");
        }
        System.out.println("]");
        System.out.print("[ ");
        for (int i = n2; i <= m2; i++) {
            System.out.print(array2 [i] + " ");
        }
        System.out.print("]");


        //Шестая задача
        int [] array = {1, 3, -6, 23, 14, 2};
        int min = array [0], max = array [0];
        for (int i = 0; i < array.length; i++) {
            if (max < array [i]) {
                max = array [i];
            }
            if (min > array [i]) {
                min = array[i];
            }

        }
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);


        //Седьмая задача
        int [] array = {1, 3, -6, 23, 14, 2};
        int min1 = array[1], min2 = array[1];
        for (int i = 0; i < array.length; i++) {
            if (min1 > array[i]) {
                min2 = min1;
                min1 = array[i];
            }
        }
        System.out.println("Наименьший элемент = " + min1);
        System.out.println("Второй наименьший элемент = " + min2);

        //Восьмая задача
        int [] array = {1, 2, 3, 0, 4, 6};
        int a = array[1];
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j < array.length; j++) {
                
            }
        }

        //Девятая задача
        int [] [] twoDimArray = {{4, 2, 3}, {2, 7, 2}};
        System.out.println("После изменения строк и столбцов указанного массива");
        for (int j = 0; j < twoDimArray[0].length; j++) {
            for (int i = 0; i < twoDimArray.length; i++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }


        //Десятая задача
        int [] [] twoDimArray = {{10, 20, 30}, {40, 50, 60}};
        int sum = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[0].length; j++) {
                sum += twoDimArray[i][j];
            }
        }
        System.out.println("Сумма = " + sum);


        //Одиннадцатая задача
        int [] [] twoDimArray = {{10, 20}, {40, 50}};
        if (twoDimArray.length == twoDimArray[0].length) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }


        //Двенадцатая задача
        int n = 5;
        int [] [] twoDimArray = new int [n] [n];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[0].length; j++) {
                twoDimArray [i][j] = (i + 1) * (j + 1);
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }


        //Тренадцатая задача
        int [] [] twoDimArray = {{10, 20, 30}, {40, 50, 60}};
        int max = twoDimArray[0][0], min = twoDimArray[0][0];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[0].length; j++) {
                if (twoDimArray[i][j] > max) {
                    max = twoDimArray [i][j];
                }
                if (twoDimArray[i][j] < min) {
                    min = twoDimArray[i][j];
                }
            }
        }
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
    }

}