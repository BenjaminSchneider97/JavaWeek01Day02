import java.util.Scanner;

public class IntermediateA4 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n = num.nextInt();

        System.out.print("Enter the second number: ");
        int m = num.nextInt();

        if (n > m ){
            System.out.println(n + " is bigger than " + m);
        } else if (m > n){
            System.out.println(m + " is bigger than " + n);
        }
    }
}
