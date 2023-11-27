import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi un animale");
    String animale = scanner.nextLine();
        System.out.println("Hai inserito: " + animale);
        System.out.println("Dammi ora una pianta");
    String pianta = scanner.nextLine();
        System.out.println(animale + " " + pianta);
        System.out.println("qualsiasi cosa");
    String anything = scanner.nextLine();
        System.out.println(animale + " " + pianta + " " +  anything);
        System.out.println("Inverso" + " " + anything + " " +  pianta + " " + animale);


        scanner.close();
}}

