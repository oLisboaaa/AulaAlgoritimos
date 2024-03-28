package Aula5;

import java.util.Scanner;
public class Media2 {
    public static void main(String[] args) {
        double soma, media = 0.0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o valor 1: ");
        soma = scan.nextDouble(); // nextDouble para ler um dado do tipo double, nextInt para int e nextFloat para float

        System.out.print("Insira o valor 2: ");
        soma = soma + scan.nextDouble(); // A + A soma as variaveis, assim podendo utilizar apenas 1 vareavel

        System.out.print("Insira o valor 3: ");
        soma = soma + scan.nextDouble();

        media = soma/3;
        System.out.println("o valor é de " +media);
        scan.close();          
    }
}