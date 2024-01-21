package arrays;

import java.util.Scanner;

/*
Шеренга

Петя перешёл в другую школу. На уроке физкультуры ему понадобилось определить своё место в строю.
Помогите ему это сделать.
Входные данные:
Программа получает на вход невозрастающую последовательность натуральных чисел (сначала вводится количество,
 затем сами числа), означающих рост каждого человека в строю. После этого вводится число X – рост Пети.
 Все числа во входных данных натуральные и не превышают 200.
Выходные данные:
Выведите номер, под которым Петя должен встать в строй. Если в строю есть люди с одинаковым ростом, таким же,
как у Пети, то он должен встать после них.
Sample Input:
7
165
163
160
160
157
157
155
162
Sample Output:
3
*/
public class TheLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int petya = in.nextInt();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (petya == 0) break;
            if (arr[i] >= petya) {
                count++;
            }
        }
        System.out.println(count);
    }
}
