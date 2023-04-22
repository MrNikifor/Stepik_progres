package cycles;

import java.util.Scanner;

/*По данному целому числу a и натуральному n вычислите сумму 1+a+a2+...+an,
не используя формулу суммы геометрической прогрессии. Время работы программы должно быть пропорционально n.Входные данные
        Вводятся 2 числа - a и n.Выходные данные
        Необходимо вывести  значение суммы.
        Sample Input:
        2 2
        Sample Output:
        7
        */
public class GeometricProgression {
    public static void main(String[] args) {
//        Решение 1
      /*  Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int sum_x = 1;
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum_x *= a;
            sum += sum_x;
        }
        System.out.println(sum);*/

//        Решение 2
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + (int) Math.pow(a, i); // Math.pow - возводит значение первого аргумента в степень второго аргумента
        }
        System.out.println(sum);
    }
}
