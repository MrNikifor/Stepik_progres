package arrays.SimpleTask;

import java.util.Arrays;
import java.util.Scanner;

/*Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Напишите код,
который создаст массив с именем array на n элементов, в котором буду храниться введённые числа
(элемент массива равен соответствующему числу в во второй строке).
На следующей строке вводится число t - Количество запросов к вашей программе.
Каждый запрос состоит из пары целых чисел и записывается на отдельной строке.
Каждая пара чисел - индексы элементов, сумму которых вам надо найти.
Выведите на экран сумму этих двух элементов для каждого запроса на каждой строке по отдельности.
Если вдруг индекс индекс оказался вне пределов диапазона от 0 до n - 1, то выведите на экран слово Error.
Sample Input 1:
5
12 3 -4 6 2
3
0 3
1 2
3 7
Sample Output 1:
18
-1
Error
Sample Input 2:
3
9 -4 3
5
1 10
1 0
0 1
1 2
-3 7
Sample Output 2:
Error
5
5
-1
Error
*/
public class SumIndexAndErrorHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Arrays.setAll(arr, x -> sc.nextInt());
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                System.out.println(arr[a] + arr[b]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error");
            }
        }
    }
}
