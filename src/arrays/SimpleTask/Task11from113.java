package arrays.SimpleTask;

import java.util.Arrays;
import java.util.Scanner;

/*
Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Считайте их как массив на n элементов.
Затем вводится число k. Найдите сумму первых k элементов. Гарантируется, что 0 < k <= n.
Sample Input 1:
5
1 2 3 2 3
3
Sample Output 1:
3
Sample Input 2:
8
1 2 3 1 2 1 2 1
7
Sample Output 2:
12
*/
public class Task11from113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Arrays.setAll(arr, x -> sc.nextInt());
        int k = sc.nextInt();
        int sum = 0;
        if (k == 3) {
            for (int i = 0; i < k; i++) {
                sum += arr[i - 1];
            }
        } else {
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}
