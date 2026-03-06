package Exercicio3;

public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Mouse");
		Produto produto2 = new Produto("Teclado", 100);
		Produto produto3 = new Produto("Monitor", 1400);
		
		produto1.ExibirInfo();
		produto2.ExibirInfo();
		produto3.ExibirInfo();
		
		System.out.println("Explicação");
        System.out.println("A sobrecarga de construtores facilita a criação de objetos");
        System.out.println("com diferentes conjuntos");
        System.out.println("Isso proporciona flexibilidade na instanciação, permitindo");
        System.out.println("criar objetos com apenas os dados disponíveis no momento.");
	}

}
