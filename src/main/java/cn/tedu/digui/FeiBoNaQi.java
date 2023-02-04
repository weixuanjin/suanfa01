package cn.tedu.digui;

import java.util.Scanner;

/**
 * @Author: WXJ
 * @Date: 2023/2/4 16:41
 * @Description:
 */
public class FeiBoNaQi {

    public static void main(String[] args) {
        while(true){
            System.out.print("求第几个斐波那契数：");
            int n = new Scanner(System.in).nextInt();
            long r = f(n);
            System.out.printf("第%d个斐波那契数：%d\n",n,r);
            
        }
    }

    private static long f(int n) {
        if (n < 1) return 0;
        //递归到最简问题，向前倒推
        if (n == 1 || n == 2) return 1;
        return f(n-1)+f(n-2);
    }
}