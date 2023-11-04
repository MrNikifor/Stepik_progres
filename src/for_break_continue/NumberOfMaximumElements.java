package for_break_continue;
/*Последовательность состоит из натуральных чисел и завершается числом 0.
        Всего вводится не более 10000 чисел (не считая завершающего числа 0).
        Определите, сколько элементов этой последовательности равны ее наибольшему элементу.
        Числа, следующие за числом 0, считывать не нужно.
        Sample Input:
        1
        2
        4
        5
        2
        5
        3
        0
        Sample Output:
        2*/

import java.util.Scanner;

public class NumberOfMaximumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = 0;
        for (int num = sc.nextInt(); num != 0; num = sc.nextInt()) {
            if (max < num) {
                max = num;
                count = 0;
            }
            if (num == max) {
                count++;
            }
        }
  /*      while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }*/
        System.out.println(count);
    }
}
