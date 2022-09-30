import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minut = scanner.nextInt();
        int km = scanner.nextInt();
        System.out.println( (km * 1000) / (minut * 60) +  "m/s");
    }
}
