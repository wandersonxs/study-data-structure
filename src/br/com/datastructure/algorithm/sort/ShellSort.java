package br.com.datastructure.algorithm.sort;


import java.util.Arrays;

/**
 * Shell Sort algorithm
 */
public class ShellSort {

    public static void main(String[] args) {

        int[] iArray = new int[]{49, 51, 100, -7, 19, 8, 43, 23, 10, 44};

        for (int gap =  iArray.length  / 2; gap > 0 ; gap /= 2) { // traverse to the unsorted numbers

            for ( int i = gap; i < iArray.length; i++){
                int newElement = iArray[i];
                int j = i;

                while(j >= gap && iArray[j -gap] > newElement){
                    iArray[j] = iArray[j -gap];
                    j -= gap;
                }

                iArray[j] = newElement;
            }


        }

        Arrays.stream(iArray).forEach(System.out::println);
    }

}
