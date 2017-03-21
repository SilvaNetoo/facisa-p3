package br.cesed.si.p3.siscostura;

import br.cesed.si.p3.siscostura.enumerations.TipoServico;

public class ItemPedido {

	private TipoServico tipoServico;
	private int quantidade;
	
	public ItemPedido(TipoServico tipoServico, int quantidade) {
		this.tipoServico = tipoServico;
		this.quantidade = quantidade;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValor() {
		return tipoServico.getValor() * quantidade;
	}
}
