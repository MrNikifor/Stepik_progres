package for_break_continue;

import java.util.Scanner;

/*
Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел.
Необходимо найти и вывести на экран их сумму.
Sample Input:
3
7
2
9
Sample Output:
18
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        int sum = 0;
        while (a > 0) {
            a--;
            int x = sc.nextInt();
            sum = sum + x;
        }
        System.out.print(sum);
    }
}
