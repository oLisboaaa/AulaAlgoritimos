package Aula4;

import java.util.Scanner;
public class QuadradoNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Cálculo de Quadrado de um número");
        System.out.println("Digite o número desejado");
        int n1 = scan.nextInt(); // define o numero que será elevado ao quadrado
       
        int quad = n1 * n1; // quad define o resultado de n1
       
        System.out.println("O quadrado do número " + n1 +" é "+quad);
        scan.close();
    }
}
