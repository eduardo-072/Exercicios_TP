package Exercicio3;

public class Produto {
	public String nome;
	public double preco;
	public int qt;
	
	public Produto(String nome) {
		this.nome = nome;
		this.preco = 0;
		this.qt = 0;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.qt = 0;
	}
	
	public Produto(String nome, double preco, int qt) {
		this.nome = nome;
		this.preco = preco;
		this.qt = qt;
	}
	
	public void ExibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Preço: R$ " + preco);
		System.out.println();
	}
}
