package cycles;

import java.util.Scanner;

/*Напишите программу, которая находит сумму натуральных чисел от 1 до n, где n вводится с клавиатуры.

Входные данные
Задано натуральное число n

Выходные данные
Выведите единственное число - ответ на задачу.

Sample Input 1:

10

Sample Output 1:

55*/
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    /*    int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }*/
        int count = 1;
        int sum = 0;
        while (count <= n) {
            sum += count++;
        }
        System.out.println(sum);
    }
}
