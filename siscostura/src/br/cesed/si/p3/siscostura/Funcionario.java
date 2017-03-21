package br.cesed.si.p3.siscostura;

public final class Funcionario extends Pessoa {

	private int codigoFuncionario;
	private double salario;

	public Funcionario(String nome, long cpf, int codigoFuncionario, double salario) {
		super(nome, cpf);
		this.codigoFuncionario = codigoFuncionario;
		this.salario = salario;
	}

	@Override
	public int getId() {
		return codigoFuncionario;
	}

	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
