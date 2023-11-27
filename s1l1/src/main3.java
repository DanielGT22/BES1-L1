import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("base");
        int base = scanner.nextInt();
        System.out.println("Hai inserito: " + base);
        System.out.println("inserisci l'altezza");
        int altezza = scanner.nextInt();
        System.out.println("hai inserito" + " " + altezza);
        System.out.println("perimetro di questo rettangolo è " + " " + ((base * 2) +  (altezza * 2) ));

        System.out.println("check if even");
        int oddEven = scanner.nextInt();

        System.out.println("num inserito è " +  ((oddEven % 2 == 0 )  ? "pari" : "dispari"));

        System.out.println("lato 1 triangolo");
        double lato1 = scanner.nextDouble();

        System.out.println("lato 2 triangolo");
        double lato2 = scanner.nextDouble();

        System.out.println("lato 3 triangolo");
        double lato3 = scanner.nextDouble();
        double perimetro = lato1 + lato2 + lato3;
        System.out.println("Il perimetro del triangolo è: " + perimetro);
        double perimetro2 = perimetro / 2;
        double area = Math.sqrt(perimetro2 * (perimetro2 - lato1) * (perimetro2 - lato2) * (perimetro2 - lato3));
        System.out.println("L'area è: " + area);

        scanner.close();
    }}

