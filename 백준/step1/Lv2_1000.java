package 백준.step1;

import java.util.Scanner;

public class Lv2_1000 {
    public static void main(String[] args) {
        // step1. 입출력과 사칙연산

        /**
         * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
         * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
         */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);

        sc.close();
    }
}
