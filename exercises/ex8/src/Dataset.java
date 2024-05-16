import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Dataset {

    ArrayList<Double> data = new ArrayList<>();

    public Dataset (String filename) throws IOException {

        Scanner sc = new Scanner(Paths.get(filename));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            data.add(Double.valueOf(line));
        }
        sc.close();
    }

    public int size () {
        return data.size();
    }

    public double meanValue () {

        double sum = 0;

        if (data.size() == 0) {
            throw new ArithmeticException("Arithmetic Exception Thrown!");
        }

        for (int i = 0; i < size(); i++) {
            sum += data.get(i);
        }

        return sum / data.size();
    }

}
