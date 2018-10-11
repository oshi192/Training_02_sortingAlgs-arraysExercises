package sort;

public class InsertionSorter extends Sorter {

    public InsertionSorter(int[] arrays) {
        super(arrays);
    }

    public void sort() {
        for (int i = 1; i < arrays.length; i++) {
            int tmp = arrays[i];
            int index = i - 1;
            while(index >= 0 && arrays[index] > tmp){
                arrays[index + 1] = arrays [index];
                index--;
            }
            arrays[index + 1] = tmp;
        }
    }
}
