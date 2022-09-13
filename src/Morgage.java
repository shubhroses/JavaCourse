import java.text.NumberFormat;
import java.util.Scanner;

public class Morgage {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        Double principal = scanner.nextDouble();

        System.out.println("Annual Interest Rate: ");
        Double interest = scanner.nextDouble();
        Double monthlyInterest = (interest/100)/12;

        System.out.println("Period (Years): ");
        int years = scanner.nextInt() * 12;

        Double numerator = principal * monthlyInterest * Math.pow(1 + monthlyInterest, years);
        Double denomenator = Math.pow(1 + monthlyInterest, years) - 1;

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String re = currency.format(numerator/denomenator);

        System.out.println("Mortgage: " + re);

    
    }
}
