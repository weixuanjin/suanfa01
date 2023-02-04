package cn.tedu.util;

import java.util.Random;

public class ArrayUtil {
    /**
     * 交换数组i,j位置的值
     */
    public static <T> void swap(T[] a, int i, int j) {
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    /**
     * 创建长度是len的数组，并填满随机值，随机值范围[min, max)
     * @param len
     * @param min
     * @param max
     * @return
     */
    public static Integer[] random(int len, int min, int max) {
        Integer[] a = new Integer[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = min+new Random().nextInt(max-min);
        }
        return a;
    }

    public static Integer[] numbers(int from, int to) {
        Integer[] a = new Integer[to - from + 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = from + i;
        }
        return a;
    }
}
