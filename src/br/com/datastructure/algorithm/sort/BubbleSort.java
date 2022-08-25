package br.com.datastructure.algorithm.sort;


import java.util.Arrays;

/**
 * Bubble Sort is the slowest algorithm.
 * 1 - In-place algorithm
 * 2 - O(n2) complexity time - quadratic
 * 3 - It will take 100 steps to sort 10 items, 10000 to sort 100 items , 1000000 to sort 1000 itens ...
 * 4 - Algorithm degrades quickly
 * 5 - Stable Algotithm
*/
public class BubbleSort {

    public static void main(String[] args) {

        int[] iArray = new int[]{49, 51, 1, -7, 9, 8 , 43, 23, 10, 44};
        int unsortedPartitionIndex = iArray.length;
        int countLoopToSort = 0;

        while (unsortedPartitionIndex >= 0) {
            for (int i = 0; i < iArray.length -1; i++) {

                ++countLoopToSort;

                int valueCurrentSlot = iArray[i];
                int valueNextSlot = iArray[i + 1];

                if(valueCurrentSlot > valueNextSlot){
                    iArray[i] = valueNextSlot;
                    iArray[i + 1] = valueCurrentSlot;
                }

            }
            unsortedPartitionIndex--;
        }

        Arrays.stream(iArray).forEach(System.out::println);
        System.out.println("Count number of times loop = " + countLoopToSort);
    }

}
