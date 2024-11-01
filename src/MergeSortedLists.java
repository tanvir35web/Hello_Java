import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 5, 7, 9, 11, 56, 80, 106, 999);
        List<Integer> list2 = List.of(2, 4, 6, 8, 55, 80);

        List<Integer> mergedList = mergeSortedLists(list1, list2);
        System.out.println("Merged list: " + mergedList);
    }

    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        // Merge both lists while there are elements in both
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }

        // Add any remaining elements from list1
        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }

        // Add any remaining elements from list2
        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        return merged;
    }
}
