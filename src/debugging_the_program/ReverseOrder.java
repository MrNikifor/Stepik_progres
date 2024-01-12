package debugging_the_program;

import java.util.Scanner;

/*
В обратном порядке через одного
Вводятся два целых числа: a и b (a <=b ). Выведите на экран все числа от b до а через одно на разных строчках.
Sample Input:
3 11
Sample Output:
11
9
7
5
3
*/
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = b; i >= a; i -= 2) {
            System.out.println(i);
        }

    }
}
