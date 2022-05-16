package b;

public class AssinaturasMetodos {

	/**
	 * A assinatura de um método pode ser composta por: 
	 * Nome do método 
	 * Tipos de permissões 
	 * Número de parâmetros 
	 * Tipos de retornos 
	 * Tipos dos parâmetros
	 * Exceções
	 */

	//Alguns Exemplos:
	
	public void imprimir() {
		System.out.println("Imprimindo cópias!");
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
