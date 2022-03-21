package Sorting;

// Divide the given array into two part
// take first element from unsorted array and find its correct position  in sorted array
// Repeat until unsorted array is empty



//when to use
//when we have insufficient memory
//easy to implement
//when we have repeated inflow of number and we want to keep them sorted


// when to avoid
// when time is concern
// Time  = O(N^2) , space = O(1)
public class InsertedSort {
        public void insertionSort(int[] arr){
                for (int i = 1 ; i<arr.length;i++){
                        int temp = arr[i] , j = i;
                        while (j>0 && arr[j-1]>temp){
                                arr[j] = arr[j-1];
                                j--;
                        }
                        arr[j] = temp;
                }
        }


        void printArray(int[] arr){
                for (int i = 0 ;i<arr.length ;i++){
                        System.out.print(arr[i] +  " ");
                }
                System.out.println();
                
        }
    public static void main(String[] args) {
    }
}
