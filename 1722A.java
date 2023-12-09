import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Исходное имя
        String name = "Timur";
        // Преобразуем имя в массив символов и сортируем его
        char[] nameArray = name.toCharArray();
        Arrays.sort(nameArray);
        String sortedName = new String(nameArray);

        // Инициализация сканнера для ввода данных
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Количество тестов

        // Цикл для обработки каждого теста
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt(); // Длина строки
            String s = scanner.next(); // Строка для сравнения
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sortedS = new String(sArray);

            // Сравниваем отсортированные строки и выводим результат
            System.out.println(sortedS.equals(sortedName) ? "YES" : "NO");
        }
    }
}
