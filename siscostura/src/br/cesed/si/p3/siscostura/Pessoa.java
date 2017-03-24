package br.cesed.si.p3.siscostura;

/**
 * Classe não concreta do tipo Pessoa, implementada poela classe Identificavel
 * @author Neto
 *
 */
public abstract class Pessoa implements Identificavel {

	private String nome;
	private long cpf;
	
	/**
	 * @param nome
	 * @param cpf
	 */
	public Pessoa(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	/**
	 * Metodo retorna o nome da Pessoa
	 * @return nome retorna nome da Pessoa
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Metodo altera o valor da variavel nome
	 * @param nome nome da pessoa
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Metodo retorna o valor da variavel cpf do tipo long 
	 * @return cpf retorna o cpf da pessoa
	 */
	public long getCpf() {
		return cpf;
	}
	
	/**
	 * Metodo altera o valor da variavel cpf
	 * @param cpf cpf da pessoa
	 */
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
}
