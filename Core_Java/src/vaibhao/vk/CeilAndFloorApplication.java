package vaibhao.vk;

import java.util.*;

class FindFloorCeil {
    private int[] array;

    // Method to set the array
    void setValue(int[] arr) {
        array = arr;
    }

    // Method to find floor and ceil of a given value x
    int[] getFloorCeil(int x) {
        int[] result = new int[2];
        result[0] = -1; // Initialize floor to -1
        result[1] = -1; // Initialize ceil to -1

        int low = 0, high = array.length - 1;

        // Binary search to find ceil
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x) {
                result[0] = array[mid];
                result[1] = array[mid];
                return result;
            } else if (array[mid] < x) {
                result[0] = array[mid]; // Update floor
                low = mid + 1;
            } else {
                result[1] = array[mid]; // Update ceil
                high = mid - 1;
            }
        }

        return result;
    }
}

public class CeilAndFloorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sorted array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Value to find floor and ceil for
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        // Create an object of FindFloorCeil class
        FindFloorCeil findFloorCeil = new FindFloorCeil();

        // Set the array
        findFloorCeil.setValue(arr);

        // Find floor and ceil of x
        int[] floorCeil = findFloorCeil.getFloorCeil(x);

        // Check if floor or ceil found or not
        if (floorCeil[0] != -1) {
            System.out.println("Floor: " + floorCeil[0]);
        } else {
            System.out.println("Floor does not exist in the array.");
        }

        if (floorCeil[1] != -1) {
            System.out.println("Ceil: " + floorCeil[1]);
        } else {
            System.out.println("Ceil does not exist in the array.");
        }
    }
}
