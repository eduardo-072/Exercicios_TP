package view;
import modelo.PagamentoCartao;
import modelo.PagamentoDinheiro;
public class MainPagamento {

	public static void main(String[] args) {
		
		double produto = 20;
		PagamentoDinheiro pag1 = new PagamentoDinheiro(produto);
		PagamentoCartao pag2 = new PagamentoCartao(produto);
		
		System.out.println("O pagamento será efetuado com dinheiro");
		System.out.println(pag1.Recibo());

	    System.out.println();
	    
	    System.out.println("O pagamento será efetuado com cartão");
		System.out.println(pag2.Recibo());

	}

}
