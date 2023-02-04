package cn.tedu.digui;

import java.util.Scanner;

/**
 * @Author: WXJ
 * @Date: 2023/2/4 17:13
 * @Description:
 */
public class HanNuoTa {

    public static void main(String[] args) {
        while (true) {
            System.out.printf("汉诺塔的层数：");
            int n = new Scanner(System.in).nextInt();
            f(n, "A", "B", "C");
        }
    }

    private static void f(int n, String from, String mid, String to) {

        //汉诺塔 最简问题：一层汉诺塔
        if (n == 1) {
            System.out.println(from + " -> " + to);
            return;
        }

        f(n - 1, from, to, mid);
        f(1, from, mid, to);
        f(n - 1, mid, from, to);
    }
}