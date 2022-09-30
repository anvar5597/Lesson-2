import java.util.Scanner;

public class Task2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print( "number1= " );
            int x = scanner.nextInt();
            System.out.print( "number2= " );
            int y = scanner.nextInt();
            x +=y;
            y=x-y;
            x = x-y;
            System.out.println( "number1= " + x + "\nnumber2= " + y);
        }
    }
