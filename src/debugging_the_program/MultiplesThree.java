package debugging_the_program;

import java.util.Scanner;

/*
Последовательность
Маша занималась обработкой больших и не очень больших данных. На её компьютер время от времени приходили числа и
она хотела понять, каких больше: кратных 3, или отрицательных. Помогите Маше с её вопросом.
Вводятся целые числа до тех пор, пока не будет введён 0.
Если больше чисел, кратных 3, то выведите "333", если больше отрицательных чисел, то выведите "negative",
 если их одинаковое количество, то выведите "Equal".
Sample Input 1:
3
6
7
-3
5
1
2
0
Sample Output 1:
333
Sample Input 2:
-5
-6
2
7
-4
0
Sample Output 2:
negative
*/
public class MultiplesThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int three = 0;
        int negative = 0;
        int num;
        while (true) {
            num = in.nextInt();
            if (num == 0) break;
            ;
            if (num % 3 == 0) {
                three++;
            }
            if (num < 0) {
                negative++;
            }
        }
      /*  for (int i = in.nextInt(); in.nextInt() == 0; i = in.nextInt()) {
            if (i % 3 == 0) {
                three++;
            }
            if (i < 0) {
                negative++;
            }
        }*/
        System.out.println(three > negative ? "333" : three < negative ? "negative" : "Equal");
    }

}
//3 6 7 -3 5 1 2 0

