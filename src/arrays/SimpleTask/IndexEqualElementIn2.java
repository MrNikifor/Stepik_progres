package arrays.SimpleTask;

import java.util.Arrays;
import java.util.Scanner;

/*Вводится натуральное число n. Допишите код, который создаст массив с именем array на n элементов,
 в котором буду храниться квадраты чисел от 0 до n - 1 (элемент равен квадрату индекса).
Написанный код менять запрещено.
Sample Input 1:
5
Sample Output 1:
0 1 4 9 16
Sample Input 2:
3
Sample Output 2:
0 1 4
*/
public class IndexEqualElementIn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Arrays.setAll(arr, x -> (int) Math.pow(2, x));
        Arrays.setAll(arr, x -> x * x);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
    }
}
