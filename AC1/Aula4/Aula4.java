package Aula4;

import java.util.Scanner;
public class Aula4{
      public static void main(String[] args) {
             System.out.println("Programa de soma");
             System.out.println("Digite o primeiro numero");
             
             Scanner scanner = new Scanner(System.in);
             
             int primeiroNumero = scanner.nextInt();
             System.out.println("Digite outro numero");
             
             int segundoNumero = scanner.nextInt();
             int resultado = primeiroNumero + segundoNumero;
             
             System.out.println("O resultado da sua soma e " + resultado);
             scanner.close();
      }
}
