package AC1;

import java.util.Scanner;
public class RaizCubica{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Cálculo de raiz cúbica");
        System.out.println("Digite o número desejado");
        double n1 = scan.nextDouble(); // define o numero no qual será extraido a raiz cubica
        
        double cub = (double) Math.cbrt(n1); // cub está como um tipo 'double'. A função Math.cbrt(n1) está sendo utilizada para calcular a raiz cúbica da variável
        
        System.out.println("A raiz cúbica do número "+n1+ " é aproximadamente a " +cub);
        scan.close();
    }


}