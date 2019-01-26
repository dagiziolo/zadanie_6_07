import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstName = new String[5];

        int i = 0;
        System.out.println("Podaj pięć imion");
        while (i < 5) {
            firstName[i] = scanner.nextLine();
            i++;
        }
        i--;

        while (i >= 0) {
            System.out.println("Cześć " + firstName[i]);
            i--;
        }
    }
}
