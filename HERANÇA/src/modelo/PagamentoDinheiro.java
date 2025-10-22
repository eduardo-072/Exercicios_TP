package modelo;

public class PagamentoDinheiro implements IPagamento{
	private double vl;
	private double desconto = 0.10;
	
	public PagamentoDinheiro(double produto){
		this.vl = produto;
	}
	
	public double getValor() {
		return vl;
	}
	
	public void setValor(double valor) {
		this.vl = valor;
	}
	
	public double CalcPagamento() {
		return vl - (this.vl * this.desconto);
	}
	public String Recibo(){
		return "valor do produto R$" + vl + "\n Valor com desconto R$" + CalcPagamento();
	}

}
