import java.util.Scanner;

public class AdvancedA7 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = num.nextDouble();

        System.out.print("Enter the second number: ");
        double b = num.nextDouble();

        System.out.print("Enter the third number: ");
        double c = num.nextDouble();

        if (a < b && b < c){
            System.out.println("The highest number is " + c + ", the second highest number is " + b + " and the smallest number is " + a);
        } else if (a < c && c < b){
            System.out.println("The highest number is " + b + ", the second highest number is " + c + " and the smallest number is " + a);
        } else if (b < c && c < a){
            System.out.println("The highest number is " + a + ", the second highest number is " + c + " and the smallest number is " + b);
        } else if (b < a && a < c){
            System.out.println("The highest number is " + c + ", the second highest number is " + a + " and the smallest number is " + b);
        } else if (c < a && a < b){
            System.out.println("The highest number is " + b + ", the second highest number is " + a + " and the smallest number is " + c);
        } else if (c < b && b < a){
            System.out.println("The highest number is " + a + ", the second highest number is " + b + " and the smallest number is " + c);
        }
    }
}
