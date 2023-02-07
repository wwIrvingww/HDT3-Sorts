import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controlator {
    public ArrayList<Integer> intGenerator () throws IOException {
        Random rand = new Random();
        int nums = rand.nextInt(10,3000);
        int i = 0;
        int number;
        ArrayList<Integer> arrayNums = new ArrayList<Integer>();

        while (i<nums)
        {
            number = rand.nextInt(10,3000);
            arrayNums.add(number);
            i++;
        }
               return arrayNums;
    }


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


    public File createFile () throws IOException {
        File file;
        file = new File("C:\\Users\\USUARIO\\OneDrive\\UVG\\Clases\\Tercer Semestre\\Estructura de datos\\Codes\\HDT3-Sorts\\numbers.txt");
        try {
            file.createNewFile();
        }catch (IOException e){}
        return file;
    }

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

}
