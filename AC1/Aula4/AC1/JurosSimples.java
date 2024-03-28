package AC1;

import java.util.Scanner;
public class JurosSimples {
  
 public static void main(String[] args)
 {
         Scanner scan=new Scanner(System.in);

         System.out.println("Caculador de juros simples");
         System.out.println("Digite o valor da parcela");
         double parcela = scan.nextDouble(); // define o valor da parcela
         
         System.out.println("Digite a porcentagem de juros por mês com numros inteiros");
         double jur = scan.nextDouble();
         double juros = jur/100; // define a taxa de juros e divide por 100 para %
         
         System.out.println("Digite o numero de parcelas em meses");
         double quant = scan.nextDouble(); // quantidade de parcelas em mese
            
         double result = parcela*juros*quant; // formula para calculo de juros simples J=C*i*t

         System.out.println("O valor de juros a ser pago é de " + result);
        scan.close();
 }

}