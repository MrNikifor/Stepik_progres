package debugging_the_program;

import java.util.Scanner;

/*
Делители
Вводится натуральное число n. Необходимо определить количество его делителей.
Sample Input:
100
Sample Output:
9
*/
public class Dividers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
