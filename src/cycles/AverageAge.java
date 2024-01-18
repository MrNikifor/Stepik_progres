package cycles;

import java.util.Scanner;
import java.util.stream.IntStream;

/*Средний возраст

В компьютер вводятся по очереди данные об имени и возрасте n учащихся класса. Напишите программу, которая вычисляет
средний возраст учащихся класса.

Входные данные
Вводится натуральное число n - количество человек в классе. Затем вводится n пар строчек. Каждая пара состоит из имени и возраста ученика.  

Выходные данные
Выведите единственное действительное число - ответ на задачу.

Sample Input 1:

3
Иван
15
Маша
14
Олег
13

Sample Output 1:

14.0*/
public class AverageAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();
        double sum = 0;
        for (int i = 0; i < inp; i++) {
            String s = in.next();
            sum += in.nextInt();
        }
        System.out.println(sum / inp);
       /* Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        System.out.println(
                IntStream.generate(() -> {
                            sc.nextLine();
                            return Integer.parseInt(sc.nextLine());
                        })
                        .limit(n)
                        .average().orElse(0)
        );*/
    }

}
