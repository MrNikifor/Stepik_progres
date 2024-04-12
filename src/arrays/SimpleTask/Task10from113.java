package arrays.SimpleTask;
/*

Задача 9
Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Считайте их как массив на n элементов.
Затем вводится число k. Найдите индекс элемента k. Если такого элемента нет в массиве, выведите на экран слово Error.
Sample Input 1:
5
1 2 3 5 4
5
Sample Output 1:
3
Sample Input 2:
8
1 34 56 23 76 56 90 4
3
Sample Output 2:
Error
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task10from113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Arrays.setAll(arr, x -> sc.nextInt());
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
