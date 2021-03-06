package br.cesed.si.p3.siscostura;

import br.cesed.si.p3.siscostura.enumerations.TipoServico;

/**
 * Classe concreta do tipo ItemPedido
 * @author Neto
 *
 */
public class ItemPedido {

	private TipoServico tipoServico;
	private int quantidade;
	
	/**
	 * @param tipoServico
	 * @param quantidade
	 */
	public ItemPedido(TipoServico tipoServico, int quantidade) {
		this.tipoServico = tipoServico;
		this.quantidade = quantidade;
	}

	/**
	 * Metodo retorna o valor da vari�vel tipoServico do tipo TipoServico
	 * @return tipoServico tipo do servi�o
	 */
	public TipoServico getTipoServico() {
		return tipoServico;
	}

	/**
	 * Metodo altera o valor da vari�vel tipoServico do tipo TipoServico
	 * @param tipoServico tipo do servi�o
	 */
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	/**
	 * Metodo retorna o valor da vari�vel quantidade do tipo inteiro
	 * @return quantidade retorna a quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * Metodo altera o valor da vari�vel quantidade do tipo inteiro
	 * @param quantidade quantidade
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	/**
	 * Metodo retorna o valor da soma do tipo do servi�o pela quantidade
	 * @return tipoServico.getValor() * quantidade
	 */
	public double getValor() {
		return tipoServico.getValor() * quantidade;
	}
}