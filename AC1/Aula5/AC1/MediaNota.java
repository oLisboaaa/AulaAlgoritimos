package Aula5.AC1;

import java.util.Scanner;
public class MediaNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double AC1,AC2,AG,AF, media = 0.0;

        System.out.println("Calculadora da media do semestre");
        System.out.print("Digite a nota da AC1: ");
        AC1 = scan.nextDouble();

        System.out.print("Digita a nota da AC2: ");
        AC2 = scan.nextDouble();

        System.out.print("Digite a nota da AG: ");
        AG = scan.nextDouble();

        System.out.print("Digite a nota da AF: ");
        AF = scan.nextDouble();

        media = (AC1*0.15)+(AC2*0.30)+(AG*0.10)+(AF*0.45);

        System.out.println("Sua media final é de "+media);
        scan.close();
    }
    
}
