import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        if (n < 0) {
            System.out.println("You entered " + n + ", which is a negative Number!");
        } else {
            System.out.println("You entered " + n + ", which is a positive Number!!");
        }

    }
}