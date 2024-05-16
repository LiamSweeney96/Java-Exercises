import java.util.Scanner;

public class Spheroid {

    public static void main(String[] args) {

        double c, a, ecc, vol;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter equatorial radius in km: ");
        c = sc.nextDouble();

        if (c <= 0) {
            System.out.print("Error: equatorial radius must be larger than 0");
            System.exit(1);
        }

        System.out.println("Enter polar radius in km: ");
        a = sc.nextDouble();

        if (a <= 0) {
            System.out.print("Error: polar radius must be larger than 0");
            System.exit(1);
        }
        if (a > c) {
            System.out.print("Error: equatorial radius must be larger than polar radius");
            System.exit(1);
        }

        ecc = Math.sqrt(1 - (Math.pow(a, 2) / Math.pow(c, 2)));
        vol = (4.00 * Math.PI * Math.pow(c, 2) * a) / 3.00;

        System.out.printf("Eccentricity = %.3f", ecc);
        System.out.printf("\nVolume = %g cubic km", vol);

    }

}
