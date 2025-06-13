public class MinMerge {
    public static int findMinOps(int[] arr, int n) {
        int i=0 ,j=n-1,count =0 ;
        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]<arr[j]){
                arr[i+1]+=arr[i];
                i++;
                count ++;
            }
            else{
                arr[j-1]+=arr[j];
                j--;
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] arr1 = {15, 4, 15}; // Already a palindrome
        int n1 = arr1.length;
        System.out.println("Test Case 1 Output: " + findMinOps(arr1, n1));

        int[] arr2 = {1, 4, 5, 1}; // Needs 1 merge
        int n2 = arr2.length;
        System.out.println("Test Case 2 Output: " + findMinOps(arr2, n2));

        int[] arr3 = {11, 14, 15, 99}; // Needs 3 merges (worst case)
        int n3 = arr3.length;
        System.out.println("Test Case 3 Output: " + findMinOps(arr3, n3));

        int[] arr4 = {5, 3, 3, 4}; // Needs 3 merges
        int n4 = arr4.length;
        System.out.println("Test Case 4 Output: " + findMinOps(arr4, n4));

        int[] arr5 = {1, 2, 3, 2, 1}; // Already palindrome
        int n5 = arr5.length;
        System.out.println("Test Case 5 Output: " + findMinOps(arr5, n5));
    }
}


