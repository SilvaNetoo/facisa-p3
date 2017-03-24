package br.cesed.si.p3.siscostura.enumerations;

/**
 * Classe enum do tipo TipoServico
 * @author Neto
 *
 */
public enum TipoServico {

	/**
	 * Tipo de servi�o com cal�a
	 */
	CALCA(1, "Manutencao de Calca", 20.50),
	
	/**
	 * Tipo de servi�o com camisa
	 */
	CAMISA(2, "Manutencao de Camisa", 10.99),
	
	/**
	 * Tipo de servi�o com menina
	 */
	MENINA(3, "Manutencao das girls", 150),
	
	/**
	 * Tipo de servi�o com colch�o
	 */
	COLCHAO(4,"Manuten��o de colch�o", 220);
	
	String descricaoServico;
	double valor;
	int codigo;
	
	/**
	 * @param codigo
	 * @param descricaoServico
	 * @param valor
	 */
	private TipoServico(int codigo, String descricaoServico, double valor) {
		this.codigo = codigo;
		this.descricaoServico = descricaoServico;
		this.valor = valor;
	}

	/**
	 * Metodo retorna o valor da variavel descricaoServico do tipo String 
	 * @return descricaoServico retorna descri��o do servi�o
	 */
	public String getDescricaoServico() {
		return descricaoServico;
	}

	/**
	 * Metodo altera o valor da vari�vel descricaoServico do tipo String
	 * @param descricaoServico descri��o do servi�o
	 */
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}

	/**
	 * Metodo retorna o valor da vari�vel valor do tipo double 
	 * @return valor retorna o valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * Metodo altera o valor da vari�vel valor do tipo double
	 * @param valor valor
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * Metodo retorna o valor da vari�vel codigo do tipo inteiro
	 * @return codigo retorna codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Metodo altera o valor da vari�vel codigo do tipo inteiro
	 * @param codigo codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
