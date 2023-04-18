package cycles;

import java.util.Scanner;
/*Пользователь вводит слова до тех пор, пока не введёт "СТОП".
Необходимо выяснить, было ли среди введённых слов слово "Куб". Если да, то выведите "YES", если нет, то  "NO".
        Sample Input:
        Привет
        Я
        люблю
        рисовать
        круги
        и
        Куб
        Это
        Прикольно)
        СТОП

        Sample Output:
        YES
        */


public class For_flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        for (String str = sc.nextLine(); true; str = sc.nextLine()) {
            if (str.equals("СТОП")) {
                break;
            } else if (str.equals("Куб")) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
