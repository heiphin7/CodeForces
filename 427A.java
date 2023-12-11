import java.util.Scanner;
/*
В первой строке записано целое число n — количество событий. В следующей строке записано n целых чисел, описывающих события, через пробел.
Если число равняется -1, значит, произошло одно преступление. 
В противном случае, число будет положительным (не больше 10) и будет равняться количеству полицейских, нанятых в этот момент. События заданы в хронологическом порядке.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      // Считывание данных
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[n];
      // Заполняем массив через цикл
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        /*
          Инициализируем 2 переменные
          1: Для того, чтобы считать количество свободных полицейских на данный момент
          2: Для того, что считать количество нераскрытых преступлений
        */
        int freepolice = 0;
        int sum = 0;
      
        for (int i = 0; i < n; i++) {
          // Если число положительное, это означает пополенение в стан полицейских
            if(array[i] >= 1){
              // добавляем в нашу переменную свободных полицейских
                freepolice += array[i];
            }else{
              // Преступления
              // Если будет совершено преступление, при этом нету свободных полицейских,
              // Тогда мы увеличиваем счётчки нераскрытых преступлений
                if(freepolice <= 0){
                    sum++;
                }else{
                  // А если было совершено преступление, при это были свободные полицейские,
                  // тогда просто отнимаем 1-го полицейского от количества полицейских
                    freepolice--;
                }
            }
        }
      // И затем просто выводим количество нераскрытых преступлений
        System.out.println(sum);
    }
}