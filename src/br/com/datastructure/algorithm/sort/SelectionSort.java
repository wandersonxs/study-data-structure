package br.com.datastructure.algorithm.sort;


import java.util.Arrays;

/**
 * Selection Sort algorithm is slow, but in average it is faster than Bubble Sort algorithm.
 * 1 - In-place algorithm
 * 2 - O(n2) complexity time - quadratic
 * 3 - It will take 100 steps to sort 10 items, 10000 to sort 100 items , 1000000 to sort 1000 items ...
 * 4 - Algorithm degrades quickly
 * 5 - Does not require as much swapping as bubble sort
 * 6 - Unstable Algotithm
*/
public class SelectionSort {

    public static void main(String[] args) {

        int[] iArray = new int[]{49, 51, 100, -7, 19, 8 , 43, 23, 10, 44};
        int countLoopToSort = 0;

        for (int lastUnsortedIndex = iArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                ++countLoopToSort;
                if(iArray[i] > iArray[largest]){
                    largest = i;
                }
            }
            swap(iArray,lastUnsortedIndex, largest);
        }

        Arrays.stream(iArray).forEach(System.out::println);
        System.out.println("Count number of times loop = " + countLoopToSort);
    }


    private static void swap(int[] iArray , int lastUnsortedIndex, int largest){
        int tempValue = iArray[lastUnsortedIndex];
        iArray[lastUnsortedIndex] = iArray[largest];
        iArray[largest] = tempValue;
    }

}
