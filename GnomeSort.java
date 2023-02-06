import java.util.Arrays;

public class GnomeSort {
        int []  gnomeSort(int[] nums)
        {
            int i=1;
            int j=2;

            while(i < nums.length) {
                if ( nums[i-1] <= nums[i] )
                {
                    i = j; j++;
                } else {
                    int tmp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i--] = tmp;
                    i = (i==0) ? j++ : i;
                }
            }
            return nums;
        }
}
//Fuente del código:
// https://www.w3resource.com/java-exercises/sorting/java-sorting-algorithm-exercise-13.php
