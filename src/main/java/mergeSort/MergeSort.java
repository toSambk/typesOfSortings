package mergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] source, int left, int right) {

        // Выберем разделитель, т.е. разделим пополам входной массив
        int delimiter = left + ((right - left) / 2) + 1;
        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить(
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        // Создаём временный массив с нужным размером
        int[] buffer = new int[right - left + 1];
        // Начиная от указанной левой границы идём по каждому элементу
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            // Мы используем delimeter чтобы указывать на элемент из правой части
            // Если delimeter > right, значит в правой части не осталось недобавленных элементов
            if (delimiter > right || source[cursor] > source[delimiter]) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);

        Arrays.stream(buffer).forEach(x-> System.out.print(" " + x));
        System.out.println();

    }

    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};

        mergeSort(array, 0, 6);

        Arrays.stream(array).forEach(x-> System.out.print(" " + x));
    }


}
