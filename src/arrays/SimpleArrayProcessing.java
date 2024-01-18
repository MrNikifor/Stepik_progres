package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число,
на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.
Sample Input:
4
1
2
3
5
2
Sample Output:
2
4
6
10
*/
public class SimpleArrayProcessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int a = in.nextInt();
            arr[i] = a;
        }
        int c = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * c);
        }
    }
}
