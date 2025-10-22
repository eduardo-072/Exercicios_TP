package view;
import modelo.SistemasdeSeguranca;
import java.util.Scanner;
public class MainAutenticacao {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SistemasdeSeguranca IA = new SistemasdeSeguranca();
		
		boolean autenticar = false;
		
		System.out.println("Login");
		
		 while (!autenticar) {
	            System.out.print("Usuário: ");
	            String usuario = scan.nextLine();

	            System.out.print("Senha: ");
	            int senha = scan.nextInt();
	            scan.nextLine();

	            autenticar = IA.login(usuario, senha);
	        }

	        System.out.println("\nBem-vindo, " + IA.getUsuario() + "!");

	        System.out.print("\nDeseja fazer logout? (s/n): ");
	        String opcao = scan.nextLine();

	        if (opcao.equalsIgnoreCase("s")) {
	            IA.logout();
	        } else {
	            System.out.println("Sessão mantida.");
	        }

	        scan.close();
	}

}
