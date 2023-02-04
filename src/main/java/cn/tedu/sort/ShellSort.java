package cn.tedu.sort;

import java.util.Arrays;

import static cn.tedu.util.ArrayUtil.random;

/**
 * @Author: WXJ
 * @Date: 2023/2/4 14:44
 * @Description:
 */

/*
希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        Integer[] a = random(10, 1, 100);
        System.out.println(Arrays.toString(a));
        //Arrays.sort(a);
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(Integer[] a) {
        for (int gap = a.length/2; gap >= 1; gap /= 2) {
            for (int i = gap; i < a.length ; i++) {
                int tmp = a[i];
                int j;
                for (j = i; j >= gap; j-=gap) {
                    if (a[j - gap] > tmp){
                        a[j] = a[j-gap];
                    } else{
                        break;
                    }
                }
                a[j] = tmp;
            }

        }
    }
}
