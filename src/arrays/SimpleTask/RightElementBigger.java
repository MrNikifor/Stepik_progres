package arrays.SimpleTask;

import java.util.Arrays;
import java.util.Scanner;

/*Вводится натуральное число n (n > 1). На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. Найдите количество элементов, которые больше предыдущего элемента.
Sample Input 1:
5
1 3 -4 6 2
Sample Output 1:
2
Sample Input 2:
4
5 3 2 0
Sample Output 2:
0
*/
public class RightElementBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Arrays.setAll(arr, x -> sc.nextInt());
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
