package Exercicio4;

public class PagamentoBoleto extends Pagamento {
	
	@Override
	public void processarPagamento() {
		System.out.println("Processando pagamento via boleto bancário");
	}
}
