package debugging_the_program;

import java.util.Scanner;

/*
Повторение на флаги

Вводится количество чисел n, затем n чисел. Необходимо выяснить есть ли среди них такое, которое заканчивается на 4? Если такое число имеется среди введённых выведите на экран слово "Yes", иначе "No".

Sample Input:

5
21
32
45
64
98

Sample Output:

Yes

*/
public class RepeatingFlags {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean is4 = false;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a % 10 == 4) {
                is4 = true;
                break;
            }
            if (is4) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

/*    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean is_4 = false;
        for (int i = 0; i < n; i++){
        int a = sc.nextInt();
        if (a % 10 == 4){
        is_4 = true;
        break;
        }
        }
        if (is_4)
        System.out.println("Yes");
        else
        System.out.println("No");
        }*/
