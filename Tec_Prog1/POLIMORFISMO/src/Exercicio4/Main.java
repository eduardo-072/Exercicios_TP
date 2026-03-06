// Main.java
package Exercicio4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pagamento pagamentoGenerico = new Pagamento();
        Pagamento pagamentoBoleto = new PagamentoBoleto();

        PagamentoCartao pagamentoCartao = new PagamentoCartao();

        pagamentoGenerico.processarPagamento();
        pagamentoBoleto.processarPagamento();
        System.out.println();

        System.out.print("Digite o valor do pagamento: R$ ");
        double valor = scan.nextDouble();

        pagamentoCartao.processarPagamento();
        
        System.out.println();
        pagamentoCartao.Cashback(valor);
        scan.close();
        
        System.out.println("\n--- Explicação ---");
        System.out.println("O polimorfismo por sobrescrita facilita a implementação de");
        System.out.println("diferentes formas de pagamento dentro de um sistema sem alterar");
        System.out.println("o código da classe base.");
        System.out.println("\nVantagens:");
        System.out.println("1. Facilita manutenção: novas formas de pagamento podem ser");
        System.out.println("   adicionadas sem modificar código existente");
        System.out.println("2. Código mais limpo: não precisa de vários if/else");
        System.out.println("3. Extensibilidade: fácil adicionar PagamentoPix, etc.");
    }
}