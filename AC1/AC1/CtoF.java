package AC1;

import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Conversor de graus Celsius para graus Fahrenheit");
        System.out.println("Digite em graus Celsius");
        int cel = scan.nextInt(); // cel = Celsuis

        double fhr = (cel*9/5)+32; // fhr = Fahrenheit + fórmula para conversão de celsius para fahrenheit
        
        System.out.println(cel+"° graus Celsius são "+fhr+"° graus Fahrenheit");
        scan.close();
    }
    
}
