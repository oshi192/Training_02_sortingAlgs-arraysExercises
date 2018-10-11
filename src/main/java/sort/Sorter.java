package sort;

import java.util.Arrays;
import java.util.Random;

abstract public class Sorter {
    private static Random random = new Random();
    int[] arrays;
    public abstract void sort();

    protected Sorter(int[] arrays) {
        this.arrays = arrays;
    }


    void conditionalSwap(int i) {
        if(arrays[i]>arrays[i+1]){
            int tmp = arrays[i];
            arrays[i] = arrays[i + 1];
            arrays[i + 1] = tmp;
        }
    }
    void conditionalSwap(int i1,int i2) {
        if(arrays[i1]>arrays[i2]){
            int tmp = arrays[i1];
            arrays[i1] = arrays[i2];
            arrays[i2] = tmp;
        }
    }

    public static  int[] generateRandomArray(int arrayLength){
        int[] arrays = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            arrays[i] = random.nextInt()%17-10;
        }
        return arrays;
    }

    public void printArray(){
        System.out.println(Arrays.toString(arrays));
    }


}
