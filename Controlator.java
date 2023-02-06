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

    public void saveDates (ArrayList arrayNums) throws IOException {
        File file = createFile();
        FileWriter writer = new FileWriter(file);
        try {
            for (Object number : arrayNums) {
                writer.write(number + System.lineSeparator());
            }
            writer.close();

        }catch (IOException e){}

    }

    public File createFile () throws IOException {
        File file;
        file = new File("C:\\Users\\USUARIO\\OneDrive\\UVG\\Clases\\Tercer Semestre\\Estructura de datos\\Codes\\HDT3-Sort\\numbers.txt");
        try {
            file.createNewFile();
        }catch (IOException e){}
        return file;
    }


    public ArrayList<String> readFile() {
        final ArrayList<String> expressions = new ArrayList<String>();
        try {
            File file = new File("C:\\Users\\USUARIO\\OneDrive\\UVG\\Clases\\Tercer Semestre\\Estructura de datos\\Codes\\HDT3-Sort\\numbers.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
                expressions.add(sc.nextLine().trim());

            sc.close();
            return expressions;

        } catch (Exception e) {
            return expressions;
        }
    }
}
