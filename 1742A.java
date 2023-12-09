import java.util.Scanner;

// Вам даны три целых числа a, b и c. Определите, является ли одно из них суммой двух других

public class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      // Принимаем на вход число n - кол-во наборов входных данных, это означает что будет n-ое количество данных
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
          // Считываем числа а, b, c
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
           // Проверяем все 3 случаи, когда 1 число может быть суммой других
            if(a + b == c || a + c == b || b + c == a){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
