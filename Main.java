import java.util.Arrays;
import java.util.Scanner;
/*
Вам дан массив a
, состоящий из n
 (n≥3
) целых положительных чисел. Известно, что в этом массиве, все числа, кроме одного, совпадают (например, в массиве [4,11,4,4]
 все числа, кроме одного, равны 4
).

Выведите номер элемента, который не совпадает с остальными. Числа в массиве пронумерованы с единицы.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ввод числа а, обозначающий количество циклов
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            // Создаём массив чисел и записываем в него значения с помощью цикла
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
            }
            // Создаём копию массива и сортируем его
            int[] v = Arrays.copyOf(array, array.length);
            Arrays.sort(v);
            for (int j = 0; j < n; j++) {
                // С помощью цикла сравниваем второй минимальный элемент отсортированного массива\
                // и сравниваем мы его со всеми числами исходного набора чисел
                if(array[j] != v[1]){
                    // Находим и выводим, вывод j + 1 так как индексы начинаются с нуля
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}