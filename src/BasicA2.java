import java.util.Scanner;
public class BasicA2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n = in.nextDouble();

        if (n == 0){
            System.out.println("The number you entered is zero!");
        } else if(n < -1000000){
            System.out.println("You entered " + n + " which is a large negative number!");
        } else if (n > -10 && n < 0){
            System.out.println("You entered " + n + " which is a small negative number!");
        } else if (n < -9){
            System.out.println("You entered " + n + " which is a negative number!");
        } else if (n > 1000000){
            System.out.println("You entered " + n + " which is a large positive number");
        } else if (n < 1){
            System.out.println("You entered " + n + " which is a small positive number!");
        } else if (n > 0){
            System.out.println("You entered " + n + " which is a positive number!");
        }
    }
}
