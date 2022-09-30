import java.util.Scanner;

public class TakrorlanuvchiRaqam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10 ;
        int d = n % 10 ;

        System.out.println((a == b || a==c || a==d) ?
                ((a!=b && b==c || a!=b && b==d ) ?
                        "Takrorlanuvchi raqam " + a +" va " + b:
                        ((a!=c && b!=c && c==d) ? "Takrorlanuvchi raqamlar " + a + " va " + c :
                                "Takrorlanuvchi raqam " + a ) ) :
                ((b == c || b == d) ? "Takrorlanuvchi raqam " + b :
                        ((c == d ) ? "Takrorlanuvchi raqam " + c :
                "Takrorlanuvchi raqam yo`q") ));

    }

}
