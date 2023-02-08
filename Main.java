import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {
        //Preguntar longitud del array
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese la cantidad de numeros que desea en el array");
       int n = sc.nextInt();
       //Instanciar el controlador
       Controlator controlator = new Controlator();
       controlator.readFile();
       ArrayList<Integer> arrayList = controlator.intGenerator(n);
       controlator.saveDates(arrayList);
       ArrayList<String> dates = controlator.readFile();
       int [] arrayNumbs = new int [n];
       arrayNumbs = controlator.arrayConverter(dates);

       //Preguntar que metodo de ordenamieno desea usar
       System.out.println("Ingrese el metodo de ordenamiento que desea usar\n"+"1.Gnome Sort\n"+"2.Merge Sort\n"+"3.Quick Sort\n"+"4.Radix sort\n"+"5.Bubble Sort\n");
       int option = sc.nextInt();

       //Usar metodo de ordenamiento solicitado
       switch (option){
           case 1:{
               GnomeSort gnomeSort = new GnomeSort();
               gnomeSort.gnomeSort(arrayNumbs, arrayNumbs.length);
               long finEjecucion = System.nanoTime();
           }
           case 2:{
               MergeSort mergeSort = new MergeSort();
               mergeSort.sort(arrayNumbs,0, (arrayNumbs.length - 1));
               long finEjecucion = System.nanoTime();
           }
           case 3:{
               QuickSort quickSort = new QuickSort();
               quickSort.quick(arrayNumbs,0,arrayNumbs.length-1);
               long finEjecucion = System.nanoTime();
           }
           case 4:{
                RadixSort radixSort = new RadixSort();
                radixSort.radixSort(arrayNumbs);
               long finEjecucion = System.nanoTime();
           }
           case 5:{
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.bubbleSort(arrayNumbs);
               long finEjecucion = System.nanoTime();
           }

       }
       System.out.println("Array ordenado");
       for (int i: arrayNumbs) {
            System.out.println(i);
       }
    }
}
