package Array;

public class ArrayIsPalindrome {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        isPalindrome(arr);
    }

    private static void isPalindrome(int[] arr) {
        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length-i-1]){
                System.out.println("Not Palindrome");
                break;
            }
        }
        System.out.println("Palindrome");
    }
}
