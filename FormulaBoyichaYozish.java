import java.util.Scanner;

public class FormulaBoyichaYozish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println( n + " + " + n*11 + " + " + n*111 + " + " +  n*1111 + " = " + n*1234);
    }
}
