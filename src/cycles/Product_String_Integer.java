package cycles;

import java.util.Scanner;

/*Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП" (гарантируется, что других слов не будет).
Найдите произведение ненулевых чисел. Если же такое произведение найти не удалось, то выведите на экран "Не найдено".
Для того, чтобы превратить String в другой тип данных используйте конструкцию подобную этой:
String s = "45";
int n = Integer.parseInt(s); //в переменной n окажется число 45
Sample Input:
3
0
2
4
СТОП
Sample Output:
24*/
public class Product_String_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number_str;
        boolean flag = false;
        int var = 1;
        for (number_str = sc.nextLine(); !number_str.equals("СТОП"); number_str = sc.nextLine()) {
            int number_int = Integer.parseInt(number_str);
            if (number_int != 0) {
                var *= number_int;
                flag = true;
            }
        }
        System.out.println(flag ? var : "Не найдено");
    }
}
