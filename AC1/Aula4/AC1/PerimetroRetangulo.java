package AC1;

import java.util.Scanner;
public class PerimetroRetangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cáculo do perimetro de um retângulo");
        System.out.println("Digite a altura desse retângulo");
        int h = scan.nextInt(); // define a altura do retangulo
        
        System.out.println("Agora digite a base desse retângulo");
        int b = scan.nextInt(); // define a base do retangulo
        
        int per =  (h+b)*2;
        
        System.out.println("o perímetro do retângulo de base "+b+" e altura "+h+" é de "+per);
        scan.close();      
    }
}
