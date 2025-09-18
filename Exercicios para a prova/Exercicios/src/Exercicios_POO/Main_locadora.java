package Exercicios_POO;
import Exercicios_POO.Loja;
import java.util.Scanner;
 
public class Main_locadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locadora loc = new Locadora(5);
				
		System.out.println("Exibindo todos os filmes de locadora");
		loc.Listar();
		int opc = scan.nextInt();
	do {
		System.out.println("--- Menu da Locadora ---");
		System.out.print("Escolha uma opção: ");
        System.out.println("1. Ver faturamento total esperado");
        System.out.println("2. Alugar um filme");
        System.out.println("3. Devolver um filme");
        System.out.println("4. Sair");
        
        switch(opc) {
        case 1: 
        	double Faturamento = loc.Faturamento();
        	System.out.println("\nFaturamento total (se todos forem alugados): R$ " + Faturamento);
            break;
        	
		case 2:
		    System.out.println("\nDigite o número do filme para alugar (0 a " + (loc.qtd - 1) + "): ");
		    int filmeAlugado = scan.nextInt();
		    loc.alugar(filmeAlugado);
		    System.out.println("Filme alugado com sucesso!");
		    break;
       
		case 3:
			System.out.println("\nDigite o número do filme para devolver ele (0 a " + (loc.qtd - 1) + "): ");
		    int filmeDevolvido = scan.nextInt();
		    loc.devolucao(filmeDevolvido);
		    break;
			
        
        case 4:
        	System.out.println("Saindo da loja, Obrigado pela preferência");
        	break;
        	
        default:
            System.out.println("Opção inválida! Tente novamente.");
            break;
	
		} 
	
		} while (opc != 4);
			scan.close();
	}
}
