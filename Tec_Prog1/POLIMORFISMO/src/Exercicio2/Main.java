package Exercicio2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		 System.out.println("Escolha uma opção:");
		 System.out.println("1 - Somar dois inteiros");
	     System.out.println("2 - Somar três inteiros");
	     System.out.println("3 - Somar dois números decimais");
	     System.out.print("Opção: ");
	     
	     int opcao = scan.nextInt();

	   switch (opcao) {
	            case 1:
        int num1 = scan.nextInt();
	    System.out.print("Digite o segundo número inteiro: ");
	    int num2 = scan.nextInt();
	    System.out.println("Resultado: " + calc.somar(num1, num2));
	      break;

	            case 2:
	    System.out.print("Digite o primeiro número inteiro: ");
	    int num3 = scan.nextInt();
	    System.out.print("Digite o segundo número inteiro: ");
	    int num4 = scan.nextInt();
	    System.out.print("Digite o terceiro número inteiro: ");
	    int num5 = scan.nextInt();
	    System.out.println("Resultado: " + calc.somar(num3, num4, num5));
	      break;

	            case 3:
	    System.out.print("Digite o primeiro número decimal: ");
	    double d1 = scan.nextDouble();
	    System.out.print("Digite o segundo número decimal: ");
	    double d2 = scan.nextDouble();
        System.out.println("Resultado: " + calc.somar(d1, d2));
	   break;

	            default:
	                System.out.println("Opção inválida!");
	                break;
	        }

	        scan.close();
	        System.out.println();
	        
	        System.out.println(" Explicação da sobrecarga");
	        System.out.println("Sobrecarga (Overload) permite criar várias versões do mesmo");
	        System.out.println("método com diferentes assinaturas (número ou tipo de parâmetros).");
	        System.out.println("O compilador escolhe qual versão executar com base nos argumentos.");
	        System.out.println("\nDiferença para Sobrescrita (Override):");
	        System.out.println("- Sobrecarga: mesmo método, assinaturas diferentes, mesma classe");
	        System.out.println("- Sobrescrita: mesmo método, mesma assinatura, classes diferentes (herança)");

	}

}
