import java.util.Arrays;
import java.util.Scanner;

/*
Даны три различных целых числа a, b, и c. Найдите среднее из них. Другими словами, найдите среди заданных трёх чисел число не являющееся ни минимумом, ни максимумом.
Например, средним число среди 5,2,6 будет 5, так как минимумом является 2 а максимумом 6.
*/

public  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
          // Создаём массив с длиной 3 - количество элементов по условиям задачи
            int[] array = new int[3];
          // Используя цикл считываем данные для массива
            for (int j = 0; j < 3; j++) {
                array[j] = scanner.nextInt();
            }
          // Сортируем массив
            Arrays.sort(array);
          // Вывод 2 - го элемента (1-ый индекс, так как индексы нумеруются с нуля)
            System.out.println(array[1]);
        }
    }
}
