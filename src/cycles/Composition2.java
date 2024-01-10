package cycles;

import java.util.Scanner;

/*
Произведение 2

Вводится 2 целых числа a и b (a <= b). Необходимо вычислить произведение всех чисел от а до b включительно

Входные данные
Заданы два целых числа а и b

Выходные данные
Выведите единственное число - ответ на задачу.
Примечание

В этой задаче есть достаточно большой тест, поэтому используйте тип данных long.

Sample Input:

1
5

Sample Output:

120

*/
public class Composition2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long n = in.nextInt();
        long res = 1;
        for (long i = a; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
//        Scanner sc = new Scanner(System.in);
//        long res = 1;
//        for (long a = sc.nextInt(), b = sc.nextInt(); a < b; a++, res *= a) ;
    }
}
