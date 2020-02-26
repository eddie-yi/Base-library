package algorithm.shellSort;

import java.util.Arrays;

/**
 * 希尔排序(经过改良更高效的插入排序) 时间复杂度：O(n^2)
 */
public class ShellSort {
    public static int[] shellSort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 2, 8, 6, 7, 9, 11, 3, 10, 15, 13, 12, 14};
        System.out.println("排序前：" + Arrays.toString(array));
        shellSort(array);
        System.out.println("排序后：" + Arrays.toString(array));
    }
}
