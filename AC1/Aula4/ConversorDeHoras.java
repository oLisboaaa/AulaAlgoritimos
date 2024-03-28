
import java.util.Scanner;
public class ConversorDeHoras{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Conversor de Horas em minutos");
        System.out.println("Digite as horas que devem ser convertidas");
        int hr = scan.nextInt(); // hr define horas
        
        int result = hr * 60; // define as horas em minutos de 'hr'
        
        System.out.println(hr +" horas em  minutos são "+result+" minutos");
        scan.close();

    }
}
