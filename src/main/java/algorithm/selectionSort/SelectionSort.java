package algorithm.selectionSort;

import java.util.Arrays;

/**
 * 选择排序  时间复杂度:O(n^2)
 */
public class SelectionSort {
    public static int[] selectionSort(int[] array){
        if(array.length==0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if(array[j]<array[minIndex]){//找到最小的数
                    minIndex = j;//将最小的数的索引保存
                }
            }
            int temp =array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array= {1,4,5,2,8,6,7,9,11,3,10,15,13,12,14};
        System.out.println("排序前："+ Arrays.toString(array));
        selectionSort(array);
        System.out.println("排序后："+Arrays.toString(array));
    }

}
