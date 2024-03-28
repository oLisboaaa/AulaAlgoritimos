package AC1;

import java.util.Scanner;
public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cálculo da área de um quadrado");

        System.out.println("Digite a altura desse quadrado");
        int h = scan.nextInt(); // h = medida da altura do quadrado

        System.out.println("Agora digite a base desse quadrado");
        int b = scan.nextInt(); //b = medida da base do quadrado

        int area = b*h;
        
        System.out.println("A área do quadrado de base "+b+" e de altura "+h+" é de " +area);
        scan.close();
    }
}
