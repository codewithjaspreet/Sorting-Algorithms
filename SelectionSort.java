package Sorting;

// IN case of selection sort we repeatedly find the minimum element and move
// it to the sorted part of array to make unsorted part sorted


// when to use :
// when we have insufficient memory
// easy to implement

// when to avoid :
// when time is concern
public class SelectionSort {
 // Time  = O(N^2) , Space = O(1)
        public void selectionSort(int[] a){
                for (int j= 0 ; j<a.length;j++) {
                        int minIndex  = j;
                        for (int i = j+1 ;i<a.length;i++){
                                if (a[i] < a[minIndex]){
                                        minIndex = i;
                                }
                        }
                        if (minIndex!=j){
                                int temp = a[j];
                                a[j] = a[minIndex];
                                a[minIndex] = temp;


















































                        }

                }
        }


        void printArray(int[] arr){
                for (int i = 0 ; i<arr.length;i++){
                        System.out.print(arr[i] + " ");
                }
                System.out.println();
        }
    public static void main(String[] args) {
                SelectionSort sort =  new SelectionSort();
                int[] arr = {4,1,9,2,3,6};
                sort.selectionSort(arr);
                sort.printArray(arr);

    }
}
