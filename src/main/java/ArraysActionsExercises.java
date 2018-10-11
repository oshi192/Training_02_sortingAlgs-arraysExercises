import jdk.nashorn.internal.ir.WhileNode;
import sort.Sorter;

import java.util.Arrays;

public class ArraysActionsExercises {
    static int[] arrays = Sorter.generateRandomArray(25);

    public static void main(String[] args) {
        printArray();
        sumElements();
        findMaxElement();
        findMinElement();
        findMiddleAryphmeticElement();
        findEqualsElementsValue(10);
        findZeroElements();
        findSmallerZeroElements();
//        multEachElements(10);
//        printArray();
        addIndexValueToElements();
        printArray();
//        evenValuesToZero();
//        printArray();
//        withNotEvenIndexesToZero();
//        printArray();
        findFirstPositiveValue();
        findLastNegativeValue();
        checkForIncrease();
        checkForDecrease();
        loopShiftToRight(4);
        printArray();
    }

    private static void printArray() {
        System.out.println(Arrays.toString(arrays));
    }

    private static void sumElements() {
        int sum = 0;
        for (int i : arrays) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    private static void findMaxElement() {
        int elementValue = arrays[0];
        int elementIndex = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (elementValue < arrays[i]) {
                elementIndex = i;
                elementValue = arrays[i];
            }
        }
        System.out.println("maxValue : " + elementValue + " maxIndex : " + elementIndex);
    }

    private static void findMinElement() {
        int elementValue = arrays[0];
        int elementIndex = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (elementValue > arrays[i]) {
                elementIndex = i;
                elementValue = arrays[i];
            }
        }
        System.out.println("minValue : " + elementValue + " minIndex : " + elementIndex);
    }

    private static void findMiddleAryphmeticElement() {
        int sum = 0;
        for (int i : arrays) {
            sum += i;
        }
        System.out.println("middle Aryphmetic value = " + sum * 1.0 / arrays.length);
    }

    private static void findEqualsElementsValue(int compareElement) {
        int theNumber = 0;
        for (int i : arrays) {
            if (i == compareElement) {
                theNumber++;
            }
        }

        System.out.println("found " + theNumber + " elements with value: " + compareElement);
    }

    private static void findZeroElements() {
        int theNumber = 0;
        for (int i : arrays) {
            if (i == 0) {
                theNumber++;
            }
        }
        System.out.println("found " + theNumber + " elements with 0 value");
    }

    private static void findSmallerZeroElements() {
        int theNumber = 0;
        for (int i : arrays) {
            if (i > 0) {
                theNumber++;
            }
        }
        System.out.println("found " + theNumber + " elements bigger than 0");
    }

    private static void multEachElements(int value) {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] *= value;
        }
        System.out.println("multiply each elements to " + value);
    }

    private static void addIndexValueToElements() {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] += i;
        }
        System.out.println("add index value to elements");
    }

    private static void evenValuesToZero() {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                arrays[i] = 0;
            }
        }
        System.out.println("even values to zero");
    }

    private static void withNotEvenIndexesToZero() {
        for (int i = 0; i < arrays.length; i++) {
            if (i % 2 != 0) {
                arrays[i] = 0;
            }
        }
        System.out.println("elements with not even indexes values to 0");
    }

    private static void findFirstPositiveValue() {
        int index = 0;
        while (arrays[index] < 0 && index < arrays.length) {
            index++;
        }
        System.out.println("first positive value arrays[" + index + "] : " + arrays[index]);
    }

    private static void findLastNegativeValue() {
        int index = arrays.length - 1;
        while (arrays[index] >= 0 && index > 0) {
            index--;
        }
        System.out.println("last negative value arrays[" + index + "] : " + arrays[index]);
    }

    private static boolean checkForIncrease() {
        boolean result = true;
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] > arrays[i + 1]) {
                result = false;
            }
        }
        System.out.println("is increase values in array : " + result);
        return result;
    }

    private static boolean checkForDecrease() {
        boolean result = true;
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] < arrays[i + 1]) {
                result = false;
            }
        }
        System.out.println("is decre values in array : " + result);
        return result;
    }

    private static void loopShiftToRight(int value) {
        for (int i = arrays.length - 1; i >= value; i--) {
            int tmp = arrays[i];
            arrays[i] = arrays[(i + value) % arrays.length];
            arrays[(i + value) % arrays.length] = tmp;
        }
        System.out.println("shift values to the right in " + value + " positions");
    }

    //Вывести элементы, значения которых не равны значениям других элементов.

    private static void notEqualsElements(int[] secondArrays) {
        boolean result = true;
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < secondArrays.length - 1; j++) {
                if (arrays[i] == secondArrays[j]) {
                    result = false;
                }
            }
            if (result) {
                System.out.println("[" + arrays[i] + "]");
            }
        }
    }

    private static void equalsElements(int[] secondArrays) {
        boolean result = true;
        int value = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < secondArrays.length; j++) {
                if (arrays[i] == secondArrays[j]) {
                    result = false;
                }
            }
            if (result) {
                value++;
            }
        }
        System.out.println("the number of equals elements : " + value);
    }

    private static int[] merge(int[] firstArr, int[] secondArr) {
        int[] result = new int[firstArr.length + secondArr.length];
        int firstIndx = 0;
        int secondIndx = 0;
        while (firstIndx < firstArr.length & secondIndx < secondArr.length) {
            if (firstArr[firstIndx] < secondArr[secondIndx]) {
                result[firstIndx + secondIndx] = firstArr[firstIndx];
                firstIndx++;
            } else {
                result[firstIndx + secondIndx] = secondArr[secondIndx];
                secondIndx++;
            }
        }
        while (firstIndx < firstArr.length) {
            result[firstIndx + secondIndx] = firstArr[firstIndx];
            firstIndx++;
        }
        while (secondIndx < secondArr.length) {
            result[firstIndx + secondIndx] = firstArr[firstIndx];
            secondIndx++;
        }
        return result;
    }

    private static void reversePositiveValuesPosition() {
        int pointerA = 0;
        int pointerB = arrays.length - 1;
        while(pointerA>pointerB) {
            while()
        }
    }
}
