package arrays.SimpleTask;

import java.util.Arrays;
import java.util.Scanner;

/*Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Считайте их как массив на n элементов.
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
public class FindAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Arrays.setAll(arr, x -> sc.nextInt());
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Error");
    }
}
