package debugging_the_program;

import java.util.Scanner;

/*Вася заказал посылку из интернет магазина в постамат. Через некоторое время ему пришло сообщение с пинкодом,
который, в том числе, может начинаться с 0. Постамат даёт пользователю 5 попыток ввода пинкода,
если пользователь вводит неправильный пинкод, то система отправляет СМС с новым пинкодом. Определите,
сможет ли Вася забрать свою посылку?

На вход программе даются строки попарно: пароль, который пришёл Васе и пароль, который он ввёл.
Если Вася вводит неверный пароль, то на экран выводится "INCORRECT n" (где n - номер попытки),
а если правильный, то "CORRECT". Если Вася исчерпал все попытки, то появляется строка "Error".*/
public class CorrectionCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        while (true) {
            String correct = in.nextLine();
            String vasya = in.nextLine();
            counter++;
            if (correct.equals(vasya)) {
                System.out.println("CORRECT");
                break;

            } else {
                System.out.println("INCORRECT " + counter);
            }
            if (counter == 5) {
                System.out.println("Error");
                break;
            }
        }
    }
}
