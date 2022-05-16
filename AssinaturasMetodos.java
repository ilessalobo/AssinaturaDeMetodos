package b;

public class AssinaturasMetodos {

	/**
	 * A assinatura de um m�todo pode ser composta por: 
	 * Nome do m�todo 
	 * Tipos de permiss�es 
	 * N�mero de par�metros 
	 * Tipos de retornos 
	 * Tipos dos par�metros
	 * Exce��es
	 */

	//Alguns Exemplos:
	
	public void imprimir() {
		System.out.println("Imprimindo c�pias!");
	}

	public long calcular(int x, int y) {
		return x * y;
	}

	public String buscarDados(int matricula) {
		return "abcd";
	}

	private Pessoa consultarPessoa(String nome) {
		return new Pessoa();
	}

	protected Double divisao(double x, double y) {
		return x / y;
	}

	void metodoEscrever() {
		System.out.println("Escrever");
	}
}
