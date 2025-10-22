package view;
import modelo.Calculadora;
import java.util.Scanner;
public class MainCalculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			Calculadora calc = new Calculadora();
			
			System.out.println("Digite o primeiro numero: ");
			int num1 = scan.nextInt();
			
			System.out.println("Digite o segundo numero: ");
			int num2 = scan.nextInt();
			
			System.out.println("Escolha uma das operações");
			System.out.println("1- Soma");
			System.out.println("2- Subtração");
			System.out.println("3-Multiplicação");
			System.out.println("4- Divisão");
			int opc = scan.nextInt();
			
			int result = 0;
			
			
			switch(opc){
			case 1: {
				result = calc.somar(num1, num2);
				System.out.println("Resultado: " + result);
				break;
			}
			
			case 2: {
				result = calc.subtrair(num1, num2);
				System.out.println("Resultado: " + result);
				break;
			}
			
			case 3: {
				result = calc.multiplicar(num1, num2);
				System.out.println("Resultado: " + result);
				break;
			}
			
			case 4: {
				result = calc.dividir(num1, num2);
				System.out.println("Resultado: " + result);
				break;
			}
			}
			
	        scan.close();
		}
	}

