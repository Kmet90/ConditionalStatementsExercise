import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int minutes = hour * 60 + min + 15;
        hour = minutes / 60;
        min = minutes % 60;
        if (hour == 24) {
            hour = 0;
        }
        if (min < 10){
            System.out.printf("%d:0%d", hour, min);
        }
        else {
            System.out.printf("%d:%d", hour, min);
        }
    }
}
