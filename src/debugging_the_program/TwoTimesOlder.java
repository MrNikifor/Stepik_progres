package debugging_the_program;

import java.util.Scanner;

/*У старшего брата  маленького Лёши день рождения в тот же день, что и у него. Лёше сейчас n лет, а его брату - k лет. Сейчас 2020 год. необходимо определить, в каком году Брат Лёши будет ровно вдвое старше? Если такое невозможно, то выведите в консоль слово "Никогда".
Входные данные:
два целых числа n и  k (k > n)
Выходные данные:
ответ на задачу
Sample Input 1:
4
9
Sample Output 1:
2021
Sample Input 2:
6
7
Sample Output 2:
Никогда
*/
public class TwoTimesOlder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        if ((k - 2 * n) >= 0) {
            System.out.println(2020 + (k - 2 * n));
        } else {
            System.out.println("Никогда");
        }
        /* int n = scan.nextInt(), k = scan.nextInt(), year = 2020;
        scan.close();
        System.out.print(k - (2 * n) < 0 ? "Никогда" : k - (2 * n) + year);*/
    }
}
