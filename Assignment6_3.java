package AssignmentSession6;

import java.util.Scanner;

public class Assignment6_3 {

	int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
    	Scanner input = new Scanner(System.in);
    	
        Assignment6_3 a63 = new Assignment6_3(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        System.out.println("Out of all of the numbers in this array: \n{2, 3, 4, 10, 40} \nPick a number to get the result of the index.");
        System.out.println("Enter the element: ");
        int num = input.nextInt();
        int result = a63.binarySearch(arr, num); 
        if (result == -1) 
            System.out.println("The element was not found."); 
        else
            System.out.println("Element found at "
                               + "index " + result); 
    } 
}
