# AssinaturaDeMetodos
Assinatura de Métodos


	  A assinatura de um método pode ser composta por: 
	 - Nome do método 
	 - Tipos de permissões 
	 - Número de parâmetros 
	 - Tipos de retornos 
	 - Tipos dos parâmetros
	 - Exceções
	 
	 * Lembrando que o tipo de retorno e o nome do método são obrigatórios
	 * Assim como os paranteses após o nome do método "()" e seu corpo(bloco)
	 
	 A assinatura do método sempre tem:

	- um nome seguindo as regras de identificadores;
	- um tipo de retorno;
	- um conjunto de parâmetros (pode ser vazio), cada um com seu nome e seu tipo;
	- um modificador de visibilidade (nem que seja implícito, package-private).
	E, ainda na assinatura, podemos ter:

	final - em caso de herança, o método não pode ser sobrescrito nas classes filhas;
	
	abstract - obriga as classes filhas a implementarem o método. O método abstrato não pode ter corpo definido;
	
	static - atributos acessados direto na classe, sem instâncias;
	
	synchronized - lock da instância;
	
	native - não cai nesta prova. Permite a implementação do método em código nativo (JNI);
	
	strictfp - não cai nesta prova. Ativa o modo de portabilidade matemática para contas de ponto flutuante.
	
	throws <EXCEPTIONS> - após a lista de parâmetros, podemos indicar quantas exceptions quisermos para o throws.

