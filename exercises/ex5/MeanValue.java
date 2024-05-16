public class MeanValue {
    public static double meanValue(double[] data) {

        double total = 0, count = 0, result = 0;

        for (double values : data) {
            total += values;
            count++;
        }

        result = total / count;
        return result;
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("Usage: java MeanValue <values...>");
            System.exit(1);
        }

        double[] values = new double[args.length];

        for (int i = 0; i < args.length; i++) {
            values[i] = Double.parseDouble(args[i]);
        }

        double v = meanValue(values);
        System.out.printf("Mean value = %.3f", v);




    }
}
