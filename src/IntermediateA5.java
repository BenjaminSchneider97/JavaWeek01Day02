import java.util.Scanner;

public class IntermediateA5 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = num.nextInt();

        if (n % 2 == 0) {
            System.out.println("Wir haben hier eine gerade Zahl");
        } else {
            System.out.println("Hier handelt es sich um eine ungerade Zahl");
        }
    }
}
