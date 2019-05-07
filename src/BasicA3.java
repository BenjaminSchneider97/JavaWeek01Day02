import java.util.Scanner;

public class BasicA3 {

    public static void main(String[] args){
    Scanner eingabe= new Scanner(System.in);

    System.out.println("Bitte geben Sie eine Zahl ein zwischen 1 und 7:");

    String name= eingabe.nextLine();

/*  if(zahl==1){
        System.out.println("Heute ist Montag");
    }
    if(zahl==2){
        System.out.println("Heute ist Dienstag");
    }
     else if(zahl==3) {
        System.out.println("Heute ist Mittwoch");
    }
     else if (zahl ==4) {
        System.out.println("Heute is Donnerstag");
    }
     else if (zahl == 5){
        System.out.println("Heute ist Freitag");
    }
     else if (zahl==6){
        System.out.println("Heute ist Samsatg");
    }
    else if (zahl==7){
        System.out.println("Heute ist Sonntag");
    }
    else {
        System.out.println("ES gibt nur 7 Wochentage");
    }
*/
       String name1 = "Maria";
       String name2 = "Stefan";
       String name3 = "David";
       String name4 = "Johanna";




        switch(name) {
            case "Maria":
                System.out.println("Maria putze bitte deine Zähne");
                break;
            case "Stefan":
                System.out.println("Stefan es ist Dienstag");
                break;
            case "David":
                System.out.println("David es ist schon spät");
                break;
            case "Johanna":
                System.out.println("Trage den Müll heraus");
                break;


                default:
                System.out.println("Ich habe keine Kinder");
        }
    }
}
