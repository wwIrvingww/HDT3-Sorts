public class QuickSort {
    void quick(int[] array, int low, int high) {
        if (array == null || array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quick(array, low, j);

        if (high > i)
            quick(array, i, high);
    }
}
//Fuente del código:
// https://www.geeksforgeeks.org/java-program-for-quicksort/
