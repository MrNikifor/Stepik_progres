package arrays;

import java.util.Scanner;

/*Вводится список (сначала количество элементов, потом сами элементы).
Найдите сумму всех элементов и выведите её. А потом выведите введённые числа в обратном порядке.
Sample Input:
4
1
2
3
4
Sample Output:
10
4
3
2
1
*/
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
