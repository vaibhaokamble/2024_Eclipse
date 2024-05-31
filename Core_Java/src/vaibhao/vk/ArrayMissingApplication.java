package vaibhao.vk;

class FindMissing {
    private int[] array;

    // Method to set the array
    void setArray(int[] a) {
        array = a;
    }

    // Method to find and print missing elements from the array
    void findMissing() {
        int max = array[array.length - 1];
        int index = 0;

        for (int i = 1; i <= max; i++) {
            if (index < array.length && array[index] == i) {
                index++;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

public class ArrayMissingApplication {
    public static void main(String[] args) {
        // Define the array
        int[] a = {1, 5, 8, 12, 14};

        // Create an object of FindMissing class
        FindMissing findMissing = new FindMissing();

        // Set the array
        findMissing.setArray(a);

        // Find and print missing elements
        System.out.println("Missing elements from the array:");
        findMissing.findMissing();
    }
}
