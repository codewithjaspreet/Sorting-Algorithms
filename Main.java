package Sorting;
// Sorting -  Space Used
//         -   Stability


// Space Used -
// In pace - Sorting algorithms which does not require any extra space for sorting
 // example : Bubble sort

// On place  -  require space
 // example : merge Sort


// Stability

// Stable : if a sorting algo after sorting the content does not change
// the sequence of similar content in which they appear , then this is stable sort
 // example :  Insertion Sort

// Unstable :  sequence changed then ,  unstable
// example : Quick

// Sorting Terminology
//increasing - order :  if successive element is greater than the previous one
//  1,3,5,7,8,11

// decreasing - order : if successive element is less than the previous one
// 11,9,7,5,3

// Non - increasing order : if successive element is less than or equal to its previous element in the sequence
// 11,9,7,5,5,3,1

// Non - decreasing order : if successive element is greater than or equal to its previous element in the sequence
// 1,3,5,7,7,9,11

public class Main {
    public static void main(String[] args) {
//            BubbleSort bubbleSort =  new BubbleSort();
//            int[] arr = {10,5,30,15,50,6};
//            bubbleSort.bubbleSort(arr);
//            bubbleSort.printArray(arr);
           // SelectionSort selectionSort =  new SelectionSort();
            int[] array = {10,3,2,5,8,4,1,9};
         //   selectionSort.selectionSort(array);
         ///   selectionSort.printArray(array);
//            InsertedSort insertedSort =  new InsertedSort();
//            insertedSort.insertionSort(array);
//            insertedSort.printArray(array);

        int arr[] = {9,5,7,4,2,1,4,8,6,3};
        BucketSort bucketSort =  new BucketSort(arr);
        bucketSort.printArray();
        bucketSort.bucketSort();
        bucketSort.printArray();

    }
}
