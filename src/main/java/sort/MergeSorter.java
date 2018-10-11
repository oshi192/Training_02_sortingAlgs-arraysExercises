package sort;

public class MergeSorter extends Sorter{
    private int [] tempMergArr;
    public MergeSorter(int[] arrays) {
        super(arrays);
        tempMergArr = new int[arrays.length];
    }

    public void sort() {
        separate(0,arrays.length-1);
    }
    private void separate(int lowerIndex, int higherIndex){
        if (lowerIndex < higherIndex) {
            int middle = (lowerIndex + higherIndex)/2;
            separate(lowerIndex, middle);
            separate(middle + 1, higherIndex);
            merge(lowerIndex, middle,higherIndex);
        }
    }
    private void merge(int lowerIndex, int middle, int higherIndex){
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = arrays[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        /*????????????????????????????*/
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                arrays[k] = tempMergArr[i];
                i++;
            } else {
                arrays[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arrays[k] = tempMergArr[i];
            k++;
            i++;
        }
    }

}
