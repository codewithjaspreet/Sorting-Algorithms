package Sorting;
// also called Sinking sort
// We repeatedly compare each pair  of adjacent items and swap them if they are in the wrong order
// Time complexity = O(N^2)
// Space complexity = O(1)

// when to use :
// when the input is almost sorted
// space is a concern
// easy to implement


// when to avoid
// average time complexity is poor

public class BubbleSort {
        void bubbleSort(int[] arr){
                int n = arr.length;
                for (int i = 0 ; i<n-1;i++){
                        for (int j = 0 ; j<n-i-1;j++){
                                if (arr[j]>arr[j+1]){
                                        int temp = arr[j];
                                        arr[j] = arr[j+1];
                                        arr[j+1] = temp;
                                }
                        }
                }
        }
        void printArray(int[] arr){
                int n = arr.length;
                for (int i = 0 ; i<n-1;i++){
                        System.out.print(arr[i] + " ");
                }
                System.out.println();
        }
    public static void main(String[] args) {
    }
}
