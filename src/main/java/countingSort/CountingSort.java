package countingSort;

import java.util.Arrays;

public class CountingSort {

    public static int[] countingSort(int[] theArray, int maxValue) {

        // Массив со "счётчиками" размером от 0 до максимального значения
        int numCounts[] = new int[maxValue + 1];
        // В соответствующей ячейке (индекс = значение) увеличиваем счётчик
        for (int num : theArray) {
            numCounts[num]++;
        }
        // Подготавливаем массив для отсортированного результата
        int[] sortedArray = new int[theArray.length];
        int currentSortedIndex = 0;
        // идём по массиву со "счётчиками"
        for (int n = 0; n < numCounts.length; n++) {
            int count = numCounts[n];
            // идём по количеству значений
            for (int k = 0; k < count; k++) {
                sortedArray[currentSortedIndex] = n;
                currentSortedIndex++;
            }
        }
        return sortedArray;

    }

    public static void main(String[] args) {

        int[] array = {10, 2, 10, 3, 1, 2, 5};

        Arrays.stream(countingSort(array, 10)).forEach(x-> System.out.println(" " + x));



    }

}
