package arrays;

import java.util.Scanner;

/*Дан список (сначала количество элементов, потом сами элементы). Потом водятся два числа: a и b.
Поменяйте местами значения a-ого и b-ого элементов массива и выведите его на экран построчно.
Гарантируется, что а и b не выходят за границы размеров массива.
Sample Input:
5
12
78
45
378
12
2
4
Sample Output:
12
78
12
378
45
*/
public class SwapPlaice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int a = in.nextInt(), b = in.nextInt();
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
