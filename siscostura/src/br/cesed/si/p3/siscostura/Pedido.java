package br.cesed.si.p3.siscostura;

import java.util.ArrayList;
import java.util.List;

import br.cesed.si.p3.siscostura.enumerations.StatusPedido;

public class Pedido implements Identificavel {

	private int id;
	private Cliente cliente;
	private Funcionario funcionario;
	private List<ItemPedido> listaItensPedido;
	private StatusPedido statusPedido;
	
	public Pedido(int id, Cliente cliente, Funcionario funcionario) {
		this.id = id;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.statusPedido = StatusPedido.NAO_INICIADO;
		this.listaItensPedido = new ArrayList<ItemPedido>();
	}

	public void adicionarItemPedido(ItemPedido itemPedido) {
		this.listaItensPedido.add(itemPedido);
	}

	public double valorTotalPedido() {
		
		double valorTotal = 0;
		
		for (ItemPedido itemPedido : listaItensPedido) {
			valorTotal += itemPedido.getValor();
		}
		
		return valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<ItemPedido> getListaItensPedido() {
		return listaItensPedido;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
