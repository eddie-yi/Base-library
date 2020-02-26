package algorithm.bubbleSort;

import java.util.Arrays;

/**
 * 冒泡排序  时间复杂度为：O(n^2)
 */
public class Bubble {
    public static int[] bubbleSort(int[] array) {
        if(array.length == 0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j+1]<array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array= {1,4,5,2,8,6,7,9,11,3,10,15,13,12,14};
        System.out.println("排序前："+ Arrays.toString(array));
        bubbleSort(array);
        System.out.println("排序后："+Arrays.toString(array));
    }

}
