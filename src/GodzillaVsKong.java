import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double statist = Double.parseDouble(scanner.nextLine());
        double priceSatist = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double fullPrice = statist * priceSatist;

        if (statist >= 150) {
            fullPrice = fullPrice * 0.9;
        }
        double price = decor + fullPrice;
        if (budget >= price) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - price);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", price - budget);
        }
    }
}
