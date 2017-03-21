package br.cesed.si.p3.siscostura;

public abstract class Pessoa implements Identificavel {

	private String nome;
	private long cpf;
	
	public Pessoa(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
}
