import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controlator {


    /**
     * Genera un arrarlist de numeros aleatorios en la cual el usuario ingresa la cantidad de numeros que desea.
     * @param n
     * @return
     * @throws IOException
     */
    public ArrayList<Integer> intGenerator (int n) throws IOException {
        Random rand = new Random();
        int nums = n;
        int i = 0;
        int number;
        ArrayList<Integer> arrayNums = new ArrayList<Integer>();

        while (i<nums)
        {
            number = i;
            arrayNums.add(number);
            i++;
        }
               return arrayNums;
    }

    /**
     * Guarda el arraylist de numeros en un txt file
     * @param arrayNums
     * @throws IOException
     */
    public void saveDates (ArrayList<Integer> arrayNums) throws IOException {

        String path = "C:\\Users\\USUARIO\\OneDrive\\UVG\\Clases\\Tercer Semestre\\Estructura de datos\\Codes\\HDT3-Sorts\\numbers.txt";
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (int number : arrayNums) {
                writer.write(String.valueOf(number));
                writer.newLine();
            }
            writer.close();
            System.out.println("Done writing to file " + path);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file " + path);
            e.printStackTrace();
        }
    }

    /**
     * Lee el txt file y lo guarda en un arraylist
     * @return
     */
    public ArrayList<String> readFile() {
        final ArrayList<String> expressions = new ArrayList<String>();
        try {
            File file = new File("C:\\Users\\USUARIO\\OneDrive\\UVG\\Clases\\Tercer Semestre\\Estructura de datos\\Codes\\HDT3-Sorts\\numbers.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
                expressions.add(sc.nextLine().trim());

            sc.close();
            return expressions;

        } catch (Exception e) {
            return expressions;
        }
    }

    /**
     * Convierte el arrarlist en un array
     * @param arrayListNumbers
     * @return
     */
    public int [] arrayConverter (ArrayList<String> arrayListNumbers){
        int[] intNumbers = new int[arrayListNumbers.size()];
        int i = 0;
        while (i<arrayListNumbers.size())
        {
            intNumbers[i] = Integer.parseInt(arrayListNumbers.get(i));
            i++;
        }
        return intNumbers;
    }



        public static long temp(int n) {

            if (n == 0 || n == 1) {
                return n;
            } else {
                return temp(n - 1) + temp(n - 2);
            }
        }

}
