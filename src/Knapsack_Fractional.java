import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;

    // Item constructor
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class FractionalKnapsack {

    // Function to get the maximum value when items are sorted by value-to-weight ratio
    public static double getMaxValue(int W, Item[] items) {
        double totalValue = 0.0;

        for (Item item : items) {
            if (W == 0) break; // Knapsack is full

            if (item.weight <= W) {
                // Take the whole item
                W -= item.weight;
                totalValue += item.value;
            } else {
                // Take the fraction of the item that fits
                totalValue += (double) item.value * W / item.weight;
                W = 0; // Knapsack is full
            }
        }

        return totalValue;
    }

    // Wrapper function that sorts items if they are not pre-sorted
    public static double fractionalKnapsack(int W, Item[] items) {
        // Sort items by value-to-weight ratio in descending order if not pre-sorted
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item a, Item b) {
                double r1 = (double) a.value / a.weight;
                double r2 = (double) b.value / b.weight;
                return Double.compare(r2, r1); // Descending order
            }
        });

        return getMaxValue(W, items); // Call the optimized function
    }

    public static void main(String[] args) {
        Item[] items = { new Item(60, 10), new Item(100, 20), new Item(120, 30) };
        int W = 50;

        double maxValue = fractionalKnapsack(W, items);
        System.out.println("Maximum value in knapsack = " + maxValue);
    }
}
