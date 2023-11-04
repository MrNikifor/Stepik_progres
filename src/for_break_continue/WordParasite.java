package for_break_continue;
/*Пользователь вводит слова до тех пор, пока не введёт "СТОП". Среди введённых слов могут быть слова - паразиты,
 а именно: "'ээээ" или "потом". Слова-паразиты не считаются нормальными словами.
        Необходимо выяснить, было ли среди введённых слов слово "Куб". Если да, то выведите,
         каким по счёту нормальным словом оно было введено. В противном случае выведите на экран слово "NO".

        Sample Input 1:

        Привет
        ээээ
        Я
        люблю
        рисовать
        круги
        и
        Куб
        Это
        Прикольно)
        СТОП

        Sample Output 1:

        7

        Sample Input 2:

        Привет
        ээээ
        Я
        потом
        ээээ
        в
        Куб
        СТОП

        Sample Output 2:

        4
        */


import java.util.Scanner;

public class WordParasite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countcub = 0;
        int count = 0;
        for (String str = sc.nextLine(); !str.equals("СТОП"); str = sc.nextLine()) {
            if (str.equals("ээээ") || str.equals("потом")) {
                continue;
            }
            count++;
            if (str.equals("Куб")) {
                countcub = count;
            }
        }
        System.out.println(countcub != 0 ? countcub : "NO");
    }
}
/*

    public static void main(String[] args) {
        int count = 0;
        int cubeCount = 0;
        String stop = "СТОП";
        try (Scanner sc = new Scanner(System.in)) {
            for (String word = sc.nextLine(); !word.equalsIgnoreCase(stop) ; word = sc.nextLine()) {
                if (word.equalsIgnoreCase("ээээ") || word.equalsIgnoreCase("потом")) {
                    continue;
                }
                count++;
                if (word.equalsIgnoreCase("Куб")) {
                    cubeCount = count;
                }
            }
            System.out.println(cubeCount != 0 ? cubeCount : "NO");
        }

    }
}*/
