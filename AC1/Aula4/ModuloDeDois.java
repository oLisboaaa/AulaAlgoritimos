
import java.util.Scanner;
public class ModuloDeDois {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Cálculo de um módulo de dois números");
        System.out.println("Digite o primeiro número");
        int n1 = scan.nextInt(); // n1 define o numero 1
        
        System.out.println("Digite o segundo número");
        int n2 = scan.nextInt(); // n2 define o numero 2
        
        int result = n1 % n2;
        
        System.out.println("O módulo entre "+n1+ " e "+n2+ " é igual a "+result);
        scan.close();
    }
}
