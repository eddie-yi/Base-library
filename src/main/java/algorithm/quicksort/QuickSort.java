package algorithm.quicksort;

import java.util.Arrays;

/**
 * 快速排序  时间复杂度：O(nlogn)
 */
public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(high<low){
            return;
        }
        i=low;
        j=high;
        //temp是基准位
        temp=arr[low];
        while (i<j){
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j){
                j--;
            }
            //再看左边，一次往右递增
            while (temp>=arr[i]&&i<j){
                i++;
            }
            if(i<=j){
                t=arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        //最后将基准位与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j - 1);
        //递归调用右半数组
        quickSort(arr,j+1,high);
    }
    public static void main(String[] args) {
        int[] array= {1,4,5,2,8,6,7,9,11,3,10,15,13,12,14};
        System.out.println("排序前："+ Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println("排序后："+Arrays.toString(array));
    }
}
