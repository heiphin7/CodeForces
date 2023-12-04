import java.util.Scanner;

public class Football{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // Тут всё очень просто, ищем 7 единиц или 7 нулей подряд через команду constains
        if(str.contains("1111111") || str.contains("0000000")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
