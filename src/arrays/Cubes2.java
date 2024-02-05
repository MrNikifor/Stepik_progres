package arrays;

import java.util.Scanner;

/*Вводятся числа a и b. Создайте массив, в котором будут храниться кубы чисел от a до b.
Затем вводится число n и n чисел после него. Используя данные из массива найдите кубы этих.
Если вводится число, не принадлежащее заданному диапазону, выведите на экран слово "Error".
Sample Input:
5
10
4
5
8
-1
5
Sample Output:
125
512
Error
125
*/
public class Cubes2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] arr = new int[b - a + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a * a * a;
            a++;
            //   System.out.println(arr[i]);
        }
        int n = in.nextInt();
        int n2;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            n2 = in.nextInt();
            arr2[i] = n2 * n2 * n2;
        }
        int x = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] >= arr[0] && arr2[i] <= arr[arr.length - 1]) {
                System.out.println(arr2[i]);
            } else {
                System.out.println("Error");
            }
        }
    }
}
