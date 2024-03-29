package arrays.SimpleTask;

import java.util.Arrays;
import java.util.Scanner;

/*Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Напишите код, который создаст массив с именем array на n элементов,
в котором буду храниться введённые числа (элемент массива равен соответствующему числу в во второй строке).
На следующей строке вводится 2 числа - индексы элементов, сумму которых вам надо найти.
Выведите на экран сумму этих двух элементов.
Если вдруг индекс индекс оказался вне пределов диапазона от 0 до n - 1, то выведите на экран слово Error.

Sample Input 1:
5
12 3 -4 6 2
0 3
Sample Output 1:
18
Sample Input 2:
3
9 -4 3
1 10
Sample Output 2:
Error
*/
public class SumIndexAndError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Arrays.setAll(arr, x -> sc.nextInt());
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(arr[a] + arr[b]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
        }
    }
}
