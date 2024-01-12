package cycles;
/*Таблица умножения

Напишите программу, которая по заданному с клавиатуры числу n печатает таблицу умножения от 1 до 9.

Входные данные
Задано натуральное число n.

Выходные данные
Выведите ответ на задачу.

Sample Input 1:

2

Sample Output 1:

2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18*/

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
