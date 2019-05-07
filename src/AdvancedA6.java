import java.util.Scanner;

public class AdvancedA6 {
    public static void main(String[] args) {

        Scanner salary = new Scanner(System.in);

        System.out.print("Enter a basic salary: ");
        double n = salary.nextDouble();

        if (n <= 1000.00){
            double gross = n + n*0.2;
            System.out.println("Your gross salary is: " + gross);
        } else if(n >= 1000.01 && n <= 2000.00){
            double gross = n + n*0.25 + n*0.2;
            System.out.println("Your gross salary is: " + gross);
        } else{
            double gross = n + n*0.3 + n*0.3;
            System.out.println("Your gross salary is: " + gross);
        }
    }
}
