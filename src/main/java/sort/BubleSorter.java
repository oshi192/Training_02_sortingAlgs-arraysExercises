package sort;

public class BubleSorter extends Sorter {

    public BubleSorter(int[] arrays) {
        super(arrays);
    }

    public void sort() {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                conditionalSwap(j);
            }
        }
    }

}
