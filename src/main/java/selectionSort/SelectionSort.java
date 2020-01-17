package selectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};

        new SelectionSort().sort(array);
    }

    public void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

}
