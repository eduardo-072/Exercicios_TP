package modelo;

public class Calculadora implements OperacaoMatematica{
	
	public int somar(int a, int b){
		return a + b;
		}
	
	public int subtrair(int a, int b){
		return a - b;
		}
	
	public int multiplicar(int a, int b){
		return a * b;
		}
	
	public int dividir(int a, int b){
		if(a != 0 && b!= 0) {
			return a / b;
		} else {
			System.out.println("Divisão impossivel de acontecert");
			return 0;
		}

		}
		
	}

