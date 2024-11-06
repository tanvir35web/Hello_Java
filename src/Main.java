import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        tda.insertValueInTheArray(0, 0, 12);
        tda.insertValueInTheArray(1, 2, 34);
        tda.insertValueInTheArray(0, 1, 70);

        System.out.println(Arrays.deepToString(tda.arr));
        tda.getCellValue(1,2);
    }
}