package cycles;

import java.util.Scanner;

/*
Произведение чисел числа

Дано натуральное число. Найдите произведение его цифр.

Входные данные
Задано натуральное число n.

Выходные данные
Выведите ответ на задачу.

Sample Input:

156

Sample Output:

30

*/
public class DerivativesOfNumberNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = 1;

        for (int i = num; i != 0; i /= 10) {
            n *= i % 10;
        }
        System.out.println(n);

    }
}
