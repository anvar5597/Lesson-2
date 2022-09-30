import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        // ikkita amal orqali a^4
        int b = a * a;
            b = b * b;
        System.out.println("ikkita amal orqali a^4 " + b);

        //3ta amal orqali a^6
        int c = a * a;
        c = c * c * c;
        System.out.println("3ta amal orqali a^6  " + c);

        //5ta amal orqali a^15
        int d = a * a;
        d = d * d * a;
        d = d * d * d;
        System.out.println("3ta amal orqali a^15   " + d);




    }
}
