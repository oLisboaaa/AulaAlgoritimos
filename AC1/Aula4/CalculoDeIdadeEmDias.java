
import java.util.Scanner;
public class CalculoDeIdadeEmDias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Conversor de idade em dias");
        System.out.println("Digite uma idade");
        int idd = scan.nextInt(); // idd define a idade em anos
        
        int dias =(idd * 365); // dias define quantos dias possuem em 'idd'
       
        System.out.println(idd + " anos de idade em dias são " + dias + " dias de idade");
        scan.close();
    }
}