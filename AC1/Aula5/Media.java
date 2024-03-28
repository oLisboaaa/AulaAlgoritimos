package Aula5;

import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        double valor1, valor2, valor3, media = 0.0; // definir variaveis com valor igual em uma linha só
        int qntItens = 3;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o valor 1: ");
        valor1 = scan.nextDouble(); // nextDouble para ler um dado do tipo double, nextInt para int e nextFloat para float

        System.out.print("Insira o valor 2: ");
        valor2 = scan.nextDouble();

        System.out.print("Insira o valor 3: ");
        valor3 = scan.nextDouble();

        media = (valor1+valor2+valor3)/qntItens;
        System.out.println("o valor é de " +media);
        scan.close();       
    }
}