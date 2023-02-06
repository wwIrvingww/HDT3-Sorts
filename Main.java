import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Controlator controlator = new Controlator();
        ArrayList<Integer> array = controlator.intGenerator();
        controlator.saveDates(array);
        ArrayList<String> dates = controlator.readFile();
        System.out.println(dates);



    }
}
