package cycles;

import java.util.Scanner;

/*Напишите программу, которая выводила бы на экран числа (например число а) следующим образом: a a.$

Входные данные
Вводятся два натуральных числа a и b (a <= b).

Выходные данные
Выведите ответ на задачу.

Sample Input:
10
25
Sample Output:
10 10.$
11 11.$
12 12.$
13 13.$
14 14.$
15 15.$
16 16.$
17 17.$
18 18.$
19 19.$
20 20.$
21 21.$
22 22.$
23 23.$
24 24.$
25 25.$*/
public class Dollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      /*  for (int i = a; i <= b; i++) {
            System.out.println(i + " " + i + ".$");
        }*/
        while (a <= b) {
            System.out.println(a + " " + a + ".$");
            a++;
        }
    }
}
