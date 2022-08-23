import java.util.Scanner;

public class counting_sort {


    public  static  int[] countSort(int[] arr){

        // find max element

        int max = Integer.MIN_VALUE;

        for(int a : arr) max = Math.max(a , max);

        int[] count = new int[max + 1];


        // creating the frequency array

        for(int  i = 0 ; i < arr.length ; i++){
            count[arr[i]]++;

        }
        // cummalative freq array

        for(int  i = 1 ; i < count.length ; i++){

            count[i] = count[i] + count[i-1];
        }
        
        // most crucial step
        // making the final ans array
        
        int[] sortedAns =new int[arr.length];

        for(int i  = arr.length - 1; i >=0 ; i--){

            sortedAns[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        return sortedAns;
    }

    public static void main(String[] args) {
        Scanner s =   new Scanner(System.in);



        int[] arr ={4, 3, 12, 1, 5, 5, 3, 94, 3, 12, 1, 5, 5, 3, 9};


        int[] ans = countSort(arr);
        for (int a : ans){

            System.out.print(a + " ");
        }
    }
}
