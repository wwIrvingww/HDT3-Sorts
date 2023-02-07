import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void xd(String[] args) throws IOException {
        //Instanciar la clase
        Controlator controlator = new Controlator();
        //Generar entre 10-3000 numeros aleatorios
        ArrayList<Integer> arrayList = controlator.intGenerator();
        System.out.println("Arrarlist desordenada"+"\n"+arrayList);
        //Guardar los numeros en un txt file
        controlator.saveDates(arrayList);
        //Leer el txt file
        ArrayList<String> dates = controlator.readFile();
        //Aquí se arruina
        //Guardar los datos en un array
        int [] arrayNumbs = new int [arrayList.size()];
        arrayNumbs = controlator.arrayConverter(dates);


        //---------------------------------------------------//
        //Prueba de Gnome sort//
        /**GnomeSort gnomeSort = new GnomeSort();
        gnomeSort.gnomeSort(arrayNumbs, arrayNumbs.length);
        System.out.println("Arrary ordenado"+"\n"+arrayNumbs[0]+"\n"+arrayNumbs[1]+"\n"+arrayNumbs[2]);*/
        //Sí

        //---------------------------------------------------//
        //Prueba de Merge sort
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arrayNumbs,0, (arrayNumbs.length - 1));
        System.out.println("Arrary ordenado"+"\n"+arrayNumbs[0]+"\n"+arrayNumbs[1]+"\n"+arrayNumbs[2]+"\n"+arrayNumbs[3]+"\n"+arrayNumbs[4]);
        //No

        //---------------------------------------------------//
        //Prueba de Quick sort//
        /**QuickSort quickSort = new QuickSort();
        quickSort.quick(arrayNumbs,0,arrayNumbs.length-1);
        System.out.println("Arrary ordenado"+"\n"+arrayNumbs[0]+"\n"+arrayNumbs[1]+"\n"+arrayNumbs[2]+"\n"+arrayNumbs[3]+"\n"+arrayNumbs[4]);
        //Sí*/

        //---------------------------------------------------//
        //Prueba de Radix sort//
        /**RadixSort radixSort = new RadixSort();
        radixSort.radixSort(arrayNumbs);
        System.out.println("Arrary ordenado"+"\n"+arrayNumbs[0]+"\n"+arrayNumbs[1]+"\n"+arrayNumbs[2]+"\n"+arrayNumbs[3]+"\n"+arrayNumbs[4]);*/
        //Sí//

        //---------------------------------------------------//
        //Prueba de Bubble sort//
        /**BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arrayNumbs);
        System.out.println("Arrary ordenado"+"\n"+arrayNumbs[0]+"\n"+arrayNumbs[1]+"\n"+arrayNumbs[2]+"\n"+arrayNumbs[3]+"\n"+arrayNumbs[4]);
        //Sí/*/
    }

    public static void main(String[] args) {
        Controlator controlator = new Controlator();
        ArrayList<String> dates = controlator.readFile();
        int k = 0;
        for (String xd:dates) {
            k++;
        }
        int [] arrayNumbs = new int [k];
        arrayNumbs = controlator.arrayConverter(dates);
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arrayNumbs,0, (arrayNumbs.length - 1));
        for (int uwu: arrayNumbs) {
            System.out.println(uwu);
        }
    }
}
