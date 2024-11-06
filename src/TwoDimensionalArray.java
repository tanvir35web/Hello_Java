public class TwoDimensionalArray {
    int arr[][] = null;

    //constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Value inserted successfully");
            } else {
                System.out.println("Value already present in the array");
            }
        } catch (Exception e) {
            System.out.println("Invalid index for 2D array!");
        }
    }

    // Accessing cell value from the given array
    public void getCellValue(int row, int col) {
        System.out.println("\nAccessing Row#" + row + ", Col#" + col);
        try {
            System.out.println("Cell value is: " + arr[row][col]);
        } catch (Exception e) {
            System.out.println("Invalid index for 2D array!");
        }
    }

}
