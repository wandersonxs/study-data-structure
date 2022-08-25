package br.com.datastructure.challenges.algorithm.arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,14,15,16,17,18,20};
        getMissingNumber(numbers);
    }

    private static void getMissingNumber(int[] numbers) {
        int total = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = numbers[i] * (numbers[i] + 1) / 2;
            sum += numbers[i];
        }
        System.out.println("Total = " + total);
        System.out.println("Missing number = " + (total - sum));
    }

}
