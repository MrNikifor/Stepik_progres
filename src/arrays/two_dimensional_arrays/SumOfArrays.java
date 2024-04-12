package arrays.two_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Вводится число n. Затем вводится 2 раза по n действительных чисел - два массива. Вывести на экран их сумму.
Sample Input:
5
-3 2.5 3.47 86 1.2
1 -2 5 -12.5 4
Sample Output:
-2.0
0.5
8.47
73.5
5.2
*/
public class SumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr1 = new double[n];
        double[] arr2 = new double[n];
        Arrays.setAll(arr1, x -> sc.nextDouble());
        Arrays.setAll(arr2, x -> sc.nextDouble());
        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i] + arr2[i]);
        }
    }
}
