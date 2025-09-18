	package Exercicios_POO;
	
	public class Locadora {
		private String[] filmes;
		private int[] VezesAlugado;
		private double[] vl_locacao;
		
		public int qtd;
		
		 public Locadora(int qtd) {
			 this.qtd = 5;
		     this.filmes = new String[qtd];
		     this.VezesAlugado = new int[qtd];
		     this.vl_locacao = new double[qtd];
		     
		     if (qtd >= 5) {
		            filmes[0] = "Vingadores";
		            filmes[1] = "Homem Aranha sem Casa";
		            filmes[2] = "Jurassic Park";
		            filmes[3] = "Batman o Cavaleiro das Trevas";
		            filmes[4] = "Pecadores";
		        }
		}
		 
		public String getNome(int index){
			if(index >= 0 && index < qtd) {
				return filmes[index];
			}
			return null;
		} 
		
		public void setNome(String nome, int index) {
			if(index >= 0 && index < qtd) {
				filmes[index] = nome;
			}
		}
		
		public double getPreco(int index) {
			if(index >= 0 && index < qtd) {
				return vl_locacao[index];
			}
			return 0.0;
		}
		
		public void setPreco(int index, double preco) {
			if(index >= 0 && index < qtd) {
				vl_locacao[index] = preco;
			}
		}
		
		public int getAlugado(int index) {
			if(index >= 0 && index < qtd) {
				return VezesAlugado[index];
			}
			return 0;
		}
		
		public void setAlugado(int index, int alugado) {
			if(index >= 0 && index < qtd) {
				VezesAlugado[index] = alugado;
			}
		}
		
		public void Listar() {
			for(int i = 0; i < qtd; i++) {
				System.out.println("Filme: " + filmes[i]);
	            System.out.println("Preço: R$ " + vl_locacao[i]);
	            System.out.println("Alugado " + VezesAlugado[i] + " vezes\n");
			}
		}
		
		public double Faturamento() {
			double Faturamento = 0;
			for(int i = 0; i < qtd; i++) {
				Faturamento += vl_locacao[i] * VezesAlugado[i];
			}
			
		return + Faturamento;
		}
		
		public String MaisAlugado() {
			int maisAlugado = 0;
			int index = 0;
			
			for(int i = 0; i < qtd; i++) {
				if(VezesAlugado[i] > maisAlugado){
					maisAlugado = VezesAlugado[i];
					index = i;
				}
			}
			return "O filme mais alugado da locadora é: " + index + 
					"Preco: " + vl_locacao[index];
		}
		
		public void devolucao(int index) {
			if(index >= 0 &&  index < qtd) {
				System.out.println("Filme " + filmes[index] + " foi devolvido, Obrigado");
			} else {
				System.out.println("Filme não foi devolvido");
			}
		}
		public void alugar(int index) {
			
			if(index >= 0 && index < qtd) {
				VezesAlugado[index]++;
			}
		}
		
		public static void main(String[] args) {
	
		}
	
	}
