package debugging_the_program;

import java.util.Scanner;

/*
Другая система счисления

Вводятся целые неотрицательные числа n и k, причём 2 < k < 10.
Переведите число n из десятичной системы счисления в систему счисления с основанием k.
Sample Input:
6
2
Sample Output:
110

Для перевода чисел из десятичной с/с в любую другую, необходимо делить десятичное число на основание системы,
в которую переводят, сохраняя при этом остатки от каждого деления. Результат формируется справа налево.
Деление продолжается до тех пор, пока результат деления не станет меньше делителя.
*/
public class OtherCalculationSystem {
    public static void main(String[] args) {
/*        Scanner in = new Scanner(System.in);
        int decim = in.nextInt(), sys = in.nextInt();
        StringBuilder res = new StringBuilder();
        if (decim == 0) {
            System.out.println(decim);
        } else {
            for (; decim > 0; decim /= sys) {
                res.append(decim % sys);
            }

            System.out.println(Integer.parseInt(String.valueOf(res.reverse())));
        }*/
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int bitness = scr.nextInt();

        System.out.println(Integer.toString(num, bitness));
    }
}
/*n = 6
 * k = 2
 * делим десятичное число на основание системы с остатком 6/2 = 3
 *
 * */