package Exercicio5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        System.out.println("=== CONVERSOR ===\n");
        
        Conversor conversor = new Conversor();
        
        System.out.printf("Digite um número para calcular o grau: ");
        double celsios = scan.nextDouble();
        double temperaturaF = conversor.converter(celsios);
        System.out.println("Resultado " + String.format("%.2f", temperaturaF));
        System.out.println();
        
        System.out.printf("Digite um número para calcular a milha: ");
        double milha = scan.nextDouble();
        double distanciaM = conversor.converter(milha);
        System.out.println("Resultado: " + String.format("%.2f", milha));
        System.out.println();
        
        scan.nextLine();
        

        System.out.print("Digite um texto para converter: ");
        String texto = scan.nextLine();
        String textoConvertido = conversor.converter(texto);
        System.out.println("Resultado: " + textoConvertido + "\n");
        
        System.out.println("--- Explicação ---");
        System.out.println("A sobrecarga de métodos permite implementar várias versões");
        System.out.println("do método converter() com funcionalidades distintas.");
        System.out.println("\nComo funciona:");
        System.out.println("- O compilador identifica qual versão executar baseando-se");
        System.out.println("  nos tipos e quantidade de parâmetros fornecidos");
        System.out.println("- Mesmo nome de método, assinaturas diferentes");
        System.out.println("- Facilita o uso: um único nome para operações relacionadas");
        System.out.println("\nNeste exemplo:");
        System.out.println("1. converter(double) - recebe apenas temperatura");
        System.out.println("2. converter(double, String) - recebe distância e unidade");
        System.out.println("3. converter(String) - recebe texto");
    }
}