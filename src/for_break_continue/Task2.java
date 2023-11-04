package for_break_continue;

import java.util.Scanner;

/*
Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел. Необходимо найти и вывести на экран количество чётных.
Sample Input:
3
7
2
9
Sample Output:
1
*/
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        int sum = 0;
        while (a > 0) {
            a--;
            int x = sc.nextInt();
            if (x % 2 == 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
