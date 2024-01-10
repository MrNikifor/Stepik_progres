package cycles;

/*
Вывод чисел "вниз"

Напишите программу, которая выводит в столбик целые числа от 50 до 0  с шагом 10.

Sample Input:

Sample Output:

50
40
30
20
10
0

*/
public class OutputNumbersDown {
    public static void main(String[] args) {
        for (int i = 50; i >= 0; i -= 10) {
            System.out.println(i);
        }
    }
}
