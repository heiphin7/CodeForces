import java.util.Scanner;
/*

Слово или предложение на некотором языке называется панграммой, если в нем встречаются все символы алфавита этого языка хотя бы один раз.
Панграммы часто используют в типографии для демонстрации шрифтов или тестирования средств вывода различных устройств.

*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine().toLowerCase(); // Принимаем строку
      // Для проверку, является ли строка панграммой я использовал подсчёт уникальных символов в строке и записал в переменную
        long count = str.chars().distinct().count();
      // Если количество уникальных букв больше или равна 26 (Столько букв в англ алфавите)
      // То выводим YES, иначе - NO
        if(count >=26){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
