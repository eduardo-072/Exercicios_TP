package modelo;

public class PagamentoCartao implements IPagamento{
	private double vl;
	private double taxa = 0.05;
	
	public PagamentoCartao(double produto){
		this.vl = produto;
	}
	
	public double getValor() {
		return vl;
	}
	
	public void setValor(double valor) {
		this.vl = valor;
	}
	
	public double CalcPagamento() {
		return vl + (this.vl * this.taxa);
	}
	public String Recibo(){
		return "valor do produto R$" + vl + "\n Valor com taxa R$" + CalcPagamento();
	}

}
