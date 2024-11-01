public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int lengthOfArray1 = array1.length;
        int lengthOfArray2 = array2.length;
        int[] mergedArray = new int[lengthOfArray1 + lengthOfArray2];

        int i = 0, j = 0, k = 0;

        // Traverse both arrays and insert the smaller element into the merged array
        while (i < lengthOfArray1 && j < lengthOfArray2) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < lengthOfArray1) {
            mergedArray[k++] = array1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < lengthOfArray2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    };
    public static void main(String[] args) {
        int[] array1 = {7, 9, 10, 13, 19, 25};
        int[] array2 = {1, 3, 5, 8, 11, 15, 16, 17, 20, 50 };

        int[] mergedArray = mergeSortedArrays(array1, array2);

        System.out.print("Merged array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

    }
}

