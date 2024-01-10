package cycles;

import java.util.Scanner;

/*
Вывод чисел "вниз" Pro

Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.

Входные данные
Заданы три целых числа а, b, с, где a > b

Выходные данные
Выведите единственное число - ответ на задачу.

Sample Input:

20
1
2

Sample Output:

20
18
16
14
12
10
8
6
4
2

*/
public class OutputNumbersDownPro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();
        long c = in.nextInt();
        for (long i = a; i >= b; i -= c) {
            System.out.println(i);
        }
    }
}
