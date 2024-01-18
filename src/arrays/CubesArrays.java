package arrays;
/*
Кубы
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона.
Используя данные из массива найдите их кубы.
Sample Input:
8
11
Sample Output:
512
1331
*/

import java.util.Scanner;

public class CubesArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int[] arr = new int[1001];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i * i;
        }
        System.out.println(arr[a] + "\n" + arr[b]);
    }
}
