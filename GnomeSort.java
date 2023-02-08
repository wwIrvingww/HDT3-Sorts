import java.util.Arrays;

public class GnomeSort {
        void gnomeSort(int arr[], int n)
        {
            int index = 0;

            while (index < n) {
                if (index == 0)
                    index++;
                if (arr[index] >= arr[index - 1])
                    index++;
                else {
                    int temp = 0;
                    temp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = temp;
                    index--;
                }
            }
            return;
        }
}
//Fuente del código:
//https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
