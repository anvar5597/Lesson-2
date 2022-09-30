import java.util.Scanner;

public class ShowTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secund = scanner.nextInt();
        int hour = secund/3600;
        int minut = (secund - hour * 3600) / 60;
        int sekund = secund - hour * 3600 - minut * 60;
        System.out.println(hour + ":" + minut + ":"  + sekund);
    }
}
