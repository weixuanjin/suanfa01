package cn.tedu.sort;

import java.util.Arrays;

import static cn.tedu.util.ArrayUtil.random;

/**
 * @Author: WXJ
 * @Date: 2023/2/4 14:44
 * @Description:
 */

/*
插入排序
 */
public class InsertionSort {
    public static void main(String[] args) {
        Integer[] a = random(10, 1, 100);
        System.out.println(Arrays.toString(a));
        //Arrays.sort(a);
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(Integer[] a) {
        for (int i = 1; i < a.length; i++) {
            int tmp = a[i];
            int j;
            for (j = i-1; j >= 0; j--) {
                if (a[j] > tmp){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = tmp;

        }

    }
}
