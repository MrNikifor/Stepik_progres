package cycles;

/*Min и Max

Задача на поиск минимума и максимума. Пользователь вводит натуральное число n, затем n целых чисел.
Необходимо определить и вывести на экран минимальное и максимальное из них.
Обратите внимание, что в большинстве задач как минимальное и максимальное значения часто используются -2*109 и 2*109 соответственно.
Но в олимпиадных задачах всегда смотрите на ограничения по числам (в них всегда оговорены границы, в которых будут лежать значения переменных).

Sample Input:
5
6
10
-7
13
4
Sample Output:
-7
13*/


import java.util.Scanner;

public class Min_and_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int max = num2;
        int min = num2;
        for (int i = 1; i <= num; i++) {
            num2 = sc.nextInt();
            if (min > num2)
                min = num2;
            if (max < num2)
                max = num2;
        }
        System.out.println(min + "\n" + max);
    }
}
