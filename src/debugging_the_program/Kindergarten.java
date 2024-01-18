package debugging_the_program;

import java.util.Scanner;

/*
Детский Сад

Для постановки Сказки красная шапочка в детском саду "Солнышко" было решено выбрать самого маленького по
росту ребёнка на роль красной шапочки и самого большого на роль волка.
На вход программе даётся число n, затем 2*n  строк. Каждая пара строк - Имя ребёнка и его рост.
Выведите  на разных строках два имени: ребёнка, который будет играть красную шапочку и ребёнка,
который будет играть волка. Если детей одного наименьшего или наибольшего роста несколько,
то выберите первого из встретившихся. Гарантируется, что все имена различны и есть минимум 1 ребёнок.
В силу специфики работы Scanner для считывания строки используйте именно sc.next();

Sample Input 1:
3
Вася
130
Маша
110
Коля
140
Sample Output 1:
Маша
Коля

Sample Input 2:
4
Алина
120
Вася
140
Маша
110
Коля
140
Sample Output 2:
Маша
Вася
*/
public class Kindergarten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String wolf = "", redHat = "";
        int max = 0, min = 200;
        for (int i = 0; i < num; i++) {
            String s = in.next();
            int n = in.nextInt();
            if (n < min) {
                redHat = s;
                min = n;
            }
            if (n > max) {
                wolf = s;
                max = n;
            }
        }
        System.out.println(redHat + "\n" + wolf);
    }
}
