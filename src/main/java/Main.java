import sort.*;

public class Main {
    public static void main(String[] args) {
        Sorter sorting = new BubleSorter(Sorter.generateRandomArray(10));
//        sorting.printArray();
//        sorting.sort();
//        sorting.printArray();
//        sorting = new SelectionSorter(Sorter.generateRandomArray(10));
//        sorting.printArray();
//        sorting.sort();
//        sorting.printArray();
//        sorting = new InsertionSorter(Sorter.generateRandomArray(10));
//        sorting.printArray();
//        sorting.sort();
//        sorting.printArray();
        sorting = new MergeSorter(Sorter.generateRandomArray(10));
        sorting.printArray();
        sorting.sort();
        sorting.printArray();
    }
}
