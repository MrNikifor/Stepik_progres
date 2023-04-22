package cycles;

import java.util.Scanner;

public class RedefinitionBinaryCalculus {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }

        StringBuilder num = new StringBuilder(Integer.toBinaryString(n));
        System.out.println(num.reverse());

    }
}
