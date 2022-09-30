import java.util.Scanner;

public class AllOperators {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print( "number1= " );
            int x = scanner.nextInt();
            System.out.print( "number2= " );
            int y = scanner.nextInt();
            System.out.println(  x + " + " + y + " = " +  (x + y));
            System.out.println(  x + " - " + y + " = " +  (x - y));
            System.out.println(  x + " * " + y + " = " +  (x * y));
            System.out.println(  x + " / " + y + " = " +  (x / y));
            System.out.println(  x + " % " + y + " = " +  (x % y));
            System.out.println(  x + " > " + y + " = " +  (x > y));
            System.out.println(  x + " < " + y + " = " +  (x < y));
            System.out.println(  x + " = " + y + " = " +  (x == y));

        }
    }


