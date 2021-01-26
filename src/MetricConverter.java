import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String from = scanner.nextLine();
        String to = scanner.nextLine();
        if (from.equals("mm")){
            if (to.equals("cm")){
                number = number / 10;
            } else {
                number = number / 1000;
            }
        } else if (from.equals("cm")){
            if (to.equals("mm")){
                number = number * 10;
            } else {
                number = number / 100;
            }
        }else {
            if (to.equals("cm")){
                number = number * 100;
            } else {
                number = number * 1000;
            }
        }
        System.out.printf("%.3f", number);
    }
}
