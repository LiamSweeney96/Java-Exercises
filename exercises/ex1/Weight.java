import java.text.DecimalFormat;
import java.util.Scanner;

public class Weight {

    public static void main(String[] args) {

        DecimalFormat d = new DecimalFormat("#.#");
        double kiloMulti, kilo, pounds, resultDouble, oz, ozRound;
        String round;
        String[] result;
        System.out.println("Enter weight in kilograms: ");
        Scanner sc = new Scanner(System.in);

        // KG to pounds = (KG * 2.20462262185), set value to this
        kiloMulti = 2.20462262185;

        // Scan in value for kilograms
        kilo = sc.nextDouble();

        // Set pounds to equal scanned kilo value times 2.20462262185
        pounds = kilo * kiloMulti;

        // Round string to 2 decimal places
        round = String.format("%.2f", pounds);

        // Split the string before and after decimal point
        result = round.split("\\.");

        // Convert RHS of decimal back to double
        resultDouble = Double.parseDouble(result[1]);

        // Calculate percentage of 16 (an ounce) that resultDouble is
        oz = (16.0 / 100) * resultDouble;

        // Round to nearest .50
        ozRound = (double) Math.round(oz * 100) / 100;

        // Print result
        System.out.printf("Equivalent imperial weight is %s lb %s oz", result[0], d.format(ozRound));

    }
}
