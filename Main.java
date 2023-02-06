import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //Instanciar la clase
        Controlator controlator = new Controlator();
        //Generar entre 10-3000 numeros aleatorios
        ArrayList<Integer> arrayList = controlator.intGenerator();
        System.out.println("Arrarlist desordenada"+"\n"+arrayList);
        //Guardar los numeros en un txt file
        controlator.saveDates(arrayList);
        //Leer el txt file
        ArrayList<String> dates = controlator.readFile();
        //Guardar los datos en un array
        int [] arrayNumbs = new int [arrayList.size()];
        arrayNumbs = controlator.arrayConverter(dates);


        //---------------------------------------------------//
        GnomeSort gnomeSort = new GnomeSort();
        gnomeSort.gnomeSort(arrayNumbs);
        System.out.println("Arrary ordenado"+"\n"+arrayNumbs[0]+arrayNumbs[1]+arrayNumbs[2]);












    }
}
