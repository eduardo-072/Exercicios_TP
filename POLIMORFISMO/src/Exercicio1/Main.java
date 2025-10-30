package Exercicio1;

public class Main {

	public static void main(String[] args) {
		Veiculo meuCarro = new Carro();
		Veiculo minhaBike = new Bicicleta();
		
		meuCarro.mover();
		minhaBike.mover();
		System.out.println();
		
		 System.out.println("Explicação sobre a sobrescrita");
	        System.out.println("A sobrescrita de métodos permite que objetos da mesma");
	        System.out.println("hierarquia tenham comportamentos diferentes mesmo tendo o");
	        System.out.println("mesmo nome, porque cada subclasse implementa sua própria versão.");
	        System.out.println("reescrevendo ele e mudando seu comportamento, em classes diferentes");
	}

}
