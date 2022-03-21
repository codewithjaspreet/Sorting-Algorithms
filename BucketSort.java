package Sorting;

// Create buckets and distribute elements of array into buckets
// sort buckets individually
// Merge buckets after sorting
 // numberOfBuckets = round(sqrt(number oof elements))
// appropriate bucket = ceil(value*numberOfBuckets/maxvalue)


// when input uniformly distributed over range
// example = 1,2,3,4,5,3,8,7,9
// not for : 1,2,4,91,95
// avoid : when space is  a concern

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
        int[] arr;

        public BucketSort(int[] arr) {
                this.arr = arr;
        }

        public void printArray() {
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i]+" ");
                }
        }

        // Print Buckets
        public void printBucket(ArrayList<Integer>[] buckets) {
                for (int i =0; i<buckets.length; i++) {
                        System.out.println("\nBucket#" + i + ":");
                        for (int j =0 ; j<buckets[i].size(); j++) {
                                System.out.print(buckets[i].get(j)+ " ");
                        }
                }
        }

        // BucketSorting
        public void bucketSort() {
                int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
                int maxValue = Integer.MIN_VALUE;
                for (int value : arr) {
                        if (value > maxValue) {
                                maxValue = value;
                        }
                }

                ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
                for (int i=0; i<buckets.length; i++) {
                        buckets[i] = new ArrayList<Integer>();
                }

                for (int value: arr) {
                        int bucketNumber = (int) Math.ceil(((float)value * numberOfBuckets)/(float)maxValue);
                        buckets[bucketNumber-1].add(value);
                }

                System.out.println("\n\nPrinting buckets before sorting...");
                printBucket(buckets);

                for(ArrayList<Integer> bucket: buckets) {
                        Collections.sort(bucket);
                }

                System.out.println("\n\nPrinting buckets after sorting...");
                printBucket(buckets);

                int index = 0;
                for(ArrayList<Integer> bucket: buckets) {
                        for(int value : bucket) {
                                arr[index] = value;
                                index++;
                        }
                }

        }



}
