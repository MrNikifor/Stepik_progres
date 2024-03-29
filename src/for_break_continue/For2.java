package for_break_continue;
/*Напишем программу, которая считывает целые числа с клавиатуры и находит их сумму, если они заканчиваются на 7.
Если ввели число, кратное 7, то программа должна завершиться (оно не суммируется).
Во время решения задачи воспользуемся break и continue.
        Sample Input:
        1
        2
        17
        27
        14
        37
        45
        12
        Sample Output:
        44
        */


import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = sc.nextInt(); true; i = sc.nextInt()) {
            if (i % 7 == 0) {
                break;
            } else if (i % 10 == 7) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
