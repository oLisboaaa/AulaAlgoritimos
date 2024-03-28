package AC1;

import java.util.Scanner;
public class PerimetroQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Módulo de cálculo do perimetro de um quadrado equilátero");
        System.out.println("Digite a medida de um dos lados do quadrado");
        
        int lado = scan.nextInt(); //define o tamanho dos lados do quadrado
        
        int per = lado*4;
        
        System.out.println("O perimetro do quadrado de lado "+lado+" é de "+per);
        scan.close();
    }
}
