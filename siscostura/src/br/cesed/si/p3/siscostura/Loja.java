package br.cesed.si.p3.siscostura;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	private List<Funcionario> funcionarios;
	private List<Cliente> clientes;
	private List<Pedido> pedidos;
	
	public Loja() {
		funcionarios = new ArrayList<Funcionario>();
		clientes = new ArrayList<Cliente>();
		pedidos = new ArrayList<Pedido>();
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public void removerFuncionario(String nomeFuncionario) {
		
		Funcionario funcionarioEncontrado = buscarFuncionarioPeloNome(nomeFuncionario);
		
		if(funcionarioEncontrado != null) {
			funcionarios.remove(funcionarioEncontrado);
		}
	}
	
	public Funcionario buscarFuncionarioPeloNome(String nome) {
		
		Funcionario funcionarioEncontrado = null;
		
		for (Funcionario funcionario : funcionarios) {
			if(funcionario.getNome().equalsIgnoreCase(nome)) {
				funcionarioEncontrado = funcionario;
				break;
			}
		}
		
		return funcionarioEncontrado;
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void removerCliente(String nomeCliente) {
		
		Cliente clienteEncontrado = buscarClientePeloNome(nomeCliente);
		
		if(clienteEncontrado != null) {
			clientes.remove(clienteEncontrado);
		}
	}
	
	public Cliente buscarClientePeloNome(String nome) {
		
		Cliente clienteEncontrado = null;
		
		for (Cliente cliente : clientes) {
			if(cliente.getNome().equalsIgnoreCase(nome)) {
				clienteEncontrado = cliente;
				break;
			}
		}
		
		return clienteEncontrado;
	}
	
	public void adicionarPedido(int codigo, Funcionario f, Cliente c) {
		
		Pedido p = new Pedido(codigo, c,f);
		pedidos.add(p);
	}
	
	public void adicionarItemPedidoAoPedido(int codigoPedido, ItemPedido ip) {
		
		Pedido pedidoEncontrado = buscarPedidoPeloId(codigoPedido);
		
		if(pedidoEncontrado != null) {
			pedidoEncontrado.getListaItensPedido().add(ip);
		}
	}
	
	public Pedido buscarPedidoPeloId(int id) {
		
		Pedido pedidoEncontrado = null;
		
		for (Pedido pedido : pedidos) {
			if(pedido.getId() == id) {
				pedidoEncontrado = pedido;
				break;
			}
		}
		
		return pedidoEncontrado;
		
	}

	/**
	 * @return the funcionarios
	 */
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	/**
	 * @param funcionarios the funcionarios to set
	 */
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	/**
	 * @return the clientes
	 */
	public List<Cliente> getClientes() {
		return clientes;
	}

	/**
	 * @param clientes the clientes to set
	 */
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	/**
	 * @return the pedidos
	 */
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	/**
	 * @param pedidos the pedidos to set
	 */
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
