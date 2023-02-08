import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SortTest  {
    @Test
    public void bubbleTest () throws Exception {
        BubbleSort bubbleSort = new BubbleSort();
        int [] array = new int[3];
        array[0] = 2;
        array[1]=3;
        array[2]=1;

        bubbleSort.bubbleSort(array);
        boolean recibido = false;
        if (array[0]<array[1] & array[1]<array[2]){
            recibido = true;
        }
        boolean esperado = true;
        assertEquals(recibido,esperado);

    }



    @Test
    public void gnomeTest () throws Exception {
        GnomeSort gnomeSort = new GnomeSort();
        int [] array = new int[3];
        array[0] = 2;
        array[1]=3;
        array[2]=1;

        gnomeSort.gnomeSort(array, array.length);
        boolean recibido = false;
        if (array[0]<array[1] & array[1]<array[2]){
            recibido = true;
        }
        boolean esperado = true;
        assertEquals(recibido,esperado);

    }

    @Test
    public void mergeTest () throws Exception {
        MergeSort mergeSort = new MergeSort();
        int [] array = new int[3];
        array[0] = 2;
        array[1]=3;
        array[2]=1;

        mergeSort.sort(array,0,(array.length-1));
        boolean recibido = false;
        if (array[0]<array[1] & array[1]<array[2]){
            recibido = true;
        }
        boolean esperado = true;
        assertEquals(recibido,esperado);

    }

    @Test
    public void quickTest () throws Exception {
        QuickSort quickSort = new QuickSort();
        int [] array = new int[3];
        array[0] = 2;
        array[1]=3;
        array[2]=1;

        quickSort.quick(array,0,array.length-1);
        boolean recibido = false;
        if (array[0]<array[1] & array[1]<array[2]){
            recibido = true;
        }
        boolean esperado = true;
        assertEquals(recibido,esperado);

    }
    @Test
    public void radixTest () throws Exception {
        RadixSort radixSort = new RadixSort();
        int [] array = new int[3];
        array[0] = 2;
        array[1]=3;
        array[2]=1;

        radixSort.radixSort(array);
        boolean recibido = false;
        if (array[0]<array[1] & array[1]<array[2]){
            recibido = true;
        }
        boolean esperado = true;
        assertEquals(recibido,esperado);

    }

    @Test
    public void controladorTest () throws Exception {
        Controlator controlator = new Controlator();
        ArrayList arrayList = controlator.intGenerator(5);
        int esperado = 5;

        assertEquals(5, arrayList.size());

    }


}
