package cycles;
/*Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
n! = 1∙2∙3∙…∙ n.
Sample Input:
5
Sample Output:
120*/

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int factor = 1;
        for (int i = 1; i <= numbers; i++) {
            factor *= i;
        }
        System.out.println(factor);
    }
}
