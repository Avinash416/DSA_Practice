package Array;
public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr={3,5,2,6,1,7,4};
        int[] arr2={};
        cyclicSort(arr);
        for (int j : arr) {
            System.out.println(arr2 + "");
        }
    }
    static void cyclicSort(int[] arr){
        int i =0;
        while (i <arr.length){
            if(arr[i] != i+1){
                swap(arr,i,arr[i]-1);
            }else i++;
        }
    }
    static void swap(int[] arr, int first ,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

//Dry Run of the Code:
//Let's dry run the code with the initial array {3, 5, 2, 1, 4}.
//
//Initial Array: [3, 5, 2, 1, 4]
//
//i = 0: arr[0] = 3, which is not 1. Swap arr[0] with arr[2] (3 should be at index 2).
//Array after swap: [2, 5, 3, 1, 4]
//Array: [2, 5, 3, 1, 4]
//
//i = 0: arr[0] = 2, which is not 1. Swap arr[0] with arr[1] (2 should be at index 1).
//Array after swap: [5, 2, 3, 1, 4]
//Array: [5, 2, 3, 1, 4]
//
//i = 0: arr[0] = 5, which is not 1. Swap arr[0] with arr[4] (5 should be at index 4).
//Array after swap: [4, 2, 3, 1, 5]
//Array: [4, 2, 3, 1, 5]
//
//i = 0: arr[0] = 4, which is not 1. Swap arr[0] with arr[3] (4 should be at index 3).
//Array after swap: [1, 2, 3, 4, 5]
//Array: [1, 2, 3, 4, 5]
//
//i = 0: arr[0] = 1, which is correct. Increment i.
//i = 1: arr[1] = 2, which is correct. Increment i.
//i = 2: arr[2] = 3, which is correct. Increment i.
//i = 3: arr[3] = 4, which is correct. Increment i.
//i = 4: arr[4] = 5, which is correct. Increment i.
//Final Sorted Array: [1, 2, 3, 4, 5]
//
//The array is now sorted, and the algorithm terminates.