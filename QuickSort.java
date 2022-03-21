package Sorting;

public class QuickSort {

        public static void quickSort(int low , int high,int[] array){
                if (low<high){
                        int pivot = partition( low , high,array);
                        quickSort(low,pivot-1,array);
                        quickSort(pivot+1,high , array);
                }
        }
        public  static  int partition(int low , int high , int[]  array){
                int pivot  = array[low];
                int i  = low;
                int j = high;
                while (i<j){
                        while (array[i] <=pivot){
                                i++;
                        }
                        while (array[j]>pivot){
                                j--;
                        }
                        if (i<j){
                                swap(array,i,j);
                        }
                }
                swap(array,j,low);
                return j;
        }
        public static void swap(int[] array , int i , int j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
        }
    public static void main(String[] args) {
                int [] arr = {4,6,2,5,7,9,1,3};
                quickSort(0,arr.length-1,arr);
                for (int i = 0 ; i<arr.length;i++){
                        System.out.print(arr[i] + " ");
                }
            System.out.println();

    }
}
