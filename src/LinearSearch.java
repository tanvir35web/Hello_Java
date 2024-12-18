public class LinearSearch {
    public static int linearSearch(int[] arr, int target, int arrLength) {
        int location = -1;

        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == target) {
                location = i;
                break;
            }
        }
        return location;
    }

    public static  int linearSearch2(int[] arr, int target, int arrLength) {
        int location = -1;
        // Starting from the end of the list
        int i = arrLength - 1; // Java arrays are 0-indexed, so last element is at n-1
        while (i >= 0 && arr[i] != target) {
            i = i - 1;
        }

        if (i >= 0) {
            location = i; // If key is found, update location with index
        }

        return location; // Returns -1 if not found or the index if found
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 8, 5, 2, 7, 0, 9, 10};
        int target = 9;
        int arrLength = arr.length;
        int location = linearSearch2(arr, target, arrLength);
        if (location != -1) {
            System.out.println(target + " Found located at index: " + location);
        } else {
            System.out.println("Target not found");
        }
    }
}
