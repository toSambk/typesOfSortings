package bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] array) {

        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};

        new BubbleSort().sort(array);
    }

}
