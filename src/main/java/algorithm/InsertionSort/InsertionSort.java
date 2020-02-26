package algorithm.InsertionSort;

import java.util.Arrays;

/**
 * 插入排序 时间复杂度：O(n^2)
 */
public class InsertionSort {
    public static void insertionSort(int[] array){
        if(array.length == 0){
            return;
        }
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i+1];
            int preIndex = i;
            while(preIndex >= 0 && current <array[preIndex]){
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
    }
    public static void main(String[] args) {
        int[] array= {1,4,5,2,8,6,7,9,11,3,10,15,13,12,14};
        System.out.println("排序前："+Arrays.toString(array));
        insertionSort(array);
        System.out.println("排序后："+Arrays.toString(array));
    }
}
