package cycles;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    /*    int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }*/
        int count = 1;
        int sum = 0;
        while (count <= n) {
            sum += count++;
        }
        System.out.println(sum);
    }
}
