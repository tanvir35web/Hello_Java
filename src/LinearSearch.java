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

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 8, 5, 2, 7, 0, 9, 10};
        int target = 1;
        int arrLength = arr.length;
        int location = linearSearch(arr, target, arrLength);
        if (location != -1) {
            System.out.println(target + " পাওয়া গেছে অবস্থানে: " + location);
        } else {
            System.out.println("Target পাওয়া যায়নি");
        }
    }
}
