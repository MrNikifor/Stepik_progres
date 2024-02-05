package arrays.SimpleTask;

import java.util.Arrays;
import java.util.Scanner;

/*Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Допишите код, который создаст массив с именем array на n элементов,
в котором буду храниться введённые числа (элемент массива равен соответствующему числу в во второй строке).

Написанный код менять запрещено.
Sample Input 1:
5
12 3 -4 6 2
Sample Output 1:
12 3 -4 6 2
Sample Input 2:
3
9 -4 3
Sample Output 2:
9 -4 3
*/
public class EnteringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Arrays.setAll(arr, x -> (int) Math.pow(2, x));
        Arrays.setAll(arr, x -> sc.nextInt());
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
    }

}
