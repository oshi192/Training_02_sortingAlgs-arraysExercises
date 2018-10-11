package sort;

public class SelectionSorter extends Sorter {
    public SelectionSorter(int[] arrays) {
        super(arrays);
    }

    public void sort() {
        for (int i = 0; i < arrays.length - 1; i++){
            for(int j = i+1; j<arrays.length;j++){
                conditionalSwap(i,j);
            }
        }
    }
}
