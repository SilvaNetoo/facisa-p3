package br.cesed.si.p3.siscostura;

public final class Cliente extends Pessoa {

	private int codigoCliente;

	public Cliente(String nome, long cpf, int codigoCliente) {
		super(nome, cpf);
		this.codigoCliente = codigoCliente;
	}

	@Override
	public int getId() {
		return codigoCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
}
