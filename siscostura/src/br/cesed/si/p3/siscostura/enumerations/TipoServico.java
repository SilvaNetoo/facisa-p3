package br.cesed.si.p3.siscostura.enumerations;

public enum TipoServico {

	CALCA(1, "Manutencao de Calca", 20.50),
	CAMISA(2, "Manutencao de Camisa", 10.99),
	MENINA(3, "Manutencao das girls", 150),
	COLCHAO(4,"Manutenção de colchão", 220);
	
	String descricaoServico;
	double valor;
	int codigo;
	
	private TipoServico(int codigo, String descricaoServico, double valor) {
		this.codigo = codigo;
		this.descricaoServico = descricaoServico;
		this.valor = valor;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
