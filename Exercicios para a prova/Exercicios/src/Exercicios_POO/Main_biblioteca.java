package Exercicios_POO;
import java.util.Scanner;
import Exercicios_POO.Biblioteca;
public class Main_biblioteca {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        String[] livros = {"Dom Quixote", "Dom Peperonni", "Senhor dos Anéis"};
        int[] diasAtrasados = {2, 2, 5};
        double[] multa = {10.5, 7.0, 0.8};
        String[] livrosDisponiveis = {"Dom Quixote", "Dom Peperonni", "Senhor dos Anéis"};
        
        Biblioteca biblioteca = new Biblioteca(livros, diasAtrasados, multa, livrosDisponiveis);
        
        System.out.println("Veja os livros disponiveis: Digite ver");
    
        biblioteca.MostrarLivros();

        biblioteca.emprestarLivro("1984");
        
        double totalMulta = biblioteca.calcMulta();
        System.out.println("Multa total: R$ " + totalMulta);
        
        double mediaDias = biblioteca.diasAtrasados();
        System.out.println("Média de dias atrasados: " + mediaDias);
        
        System.out.println("Livros disponíveis para empréstimo:");
        for (String livro : livrosDisponiveis) {
            if (livro != null) {
                System.out.println("- " + livro);
            }
        }
        
        System.out.print("Digite o título do livro que deseja retirar: ");
        String livroEmprestado = scan.nextLine();
        
        biblioteca.emprestarLivro(livroEmprestado);
        
        System.out.print("Digite o título do livro que deseja devolver: ");
        String livroDevolvido = scan.nextLine();
        System.out.print("Informe os dias de atraso: ");
        int diasAtraso = scan.nextInt();
        
        biblioteca.devolverLivro(livroDevolvido, diasAtraso);
        
        scan.close();
    }
}
