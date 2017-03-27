package br.cesed.si.p3.siscostura;

/**
 * Classe concreta do tipo Funcionario, extendendo a classe abstrata Pessoa
 * @author Neto
 *
 */
public final class Funcionario extends Pessoa {

	private int codigoFuncionario;
	private double salario;

	/**
	 * @param nome
	 * @param cpf
	 * @param codigoFuncionario
	 * @param salario
	 */
	public Funcionario(String nome, long cpf, int codigoFuncionario, double salario) {
		super(nome, cpf);
		this.codigoFuncionario = codigoFuncionario;
		this.salario = salario;
	}

	/**
	 * Metodo retorna o valor da variável codigoFuncionario do tipo inteiro
	 * @return codigoFuncionario retorna o codigo do funcionario
	 */
	@Override
	public int getId() {
		return codigoFuncionario;
	}

	/* Duplicação de código
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}*/

	/**
	 * Metodo altera o valor da variável codigoFuncionario do tipo inteiro
	 * @param codigoFuncionario codigo do funcionario
	 */
	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	/**
	 * Metodo retorna o valor da variável salario do tipo double
	 * @return salario retorna o falario do funcionario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Metodo altera o valor da variável salario
	 * @param salario salario do funcionario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
}