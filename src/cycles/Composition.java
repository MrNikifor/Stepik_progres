package cycles;
/*Составьте программу, которая запрашивает ввод n чисел и считает их произведение.

Входные данные
На первой строке вводится натуральное число n. Затем вводится n строк, на каждой из которых находится ровно одно целое число.

Выходные данные
Выведите единственное число - ответ на задачу.
Примечание

В этой задаче есть достаточно большой тест, поэтому используйте тип данных long.

Sample Input 1:

3
2
5
7

Sample Output 1:

70*/

import java.util.Scanner;

public class Composition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long res = in.nextLong();
        long a;
        ;
        for (int i = 1; i < n; i++) {
            a = in.nextLong();
            res = res * a;
        }
        System.out.println(res);
    }
}
