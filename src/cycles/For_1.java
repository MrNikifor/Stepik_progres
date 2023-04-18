package cycles;

import java.util.Scanner;

/*import java.util.Scanner;
Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.
        Sample Input:
        1
        3
        Sample Output:
        6
 */
public class For_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
