package br.com.datastructure.algorithm.sort;


import java.util.Arrays;

/**
 * Insertion Sort algorithm
 * 1 - In-place algorithm
 * 2 - O(n2) complexity time - quadratic
 * 3 - It will take 100 steps to sort 10 items, 10000 to sort 100 items , 1000000 to sort 1000 items ...
 * 4 - Algorithm degrades quickly
 * 5 - Stable Algotithm
 * <p>
 * This algorithm starts assuming that the first index is sorted, that is, element index[0] is sorted and
 * all others elements are unsorted, starting from index 1.
 * So, you traverse from right to letf, cause right is elements unsorted and left elements that are sorted.
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] iArray = new int[]{49, 51, 100, -7, 19, 8, 43, 23, 10, 44};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < iArray.length; firstUnsortedIndex++) { // traverse to the unsorted numbers

            int newElement = iArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && iArray[i - 1] > newElement; i--) { // traverse the sorted numbers comparing to the new element
                iArray[i] = iArray[i - 1];
            }
            iArray[i] = newElement;
        }

        Arrays.stream(iArray).forEach(System.out::println);
    }

}
