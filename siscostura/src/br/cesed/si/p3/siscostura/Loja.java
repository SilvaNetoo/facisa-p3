package br.cesed.si.p3.siscostura;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe concreta do tipo Loja
 * @author Neto
 *
 */
public class Loja {

	private List<Funcionario> funcionarios;
	private List<Cliente> clientes;
	private List<Pedido> pedidos;
	
	/**
	 * Construtor onde é inicializado os arrays funcionarios, clientes e pedidos.
	 */
	public Loja() {
		funcionarios = new ArrayList<Funcionario>();
		clientes = new ArrayList<Cliente>();
		pedidos = new ArrayList<Pedido>();
	}
	
	/**
	 * Metodo adiciona o valor do parametro funcionario do tipo Funcionario no array funcionarios
	 * @param funcionario funcionario
	 */
	public void adicionarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	/**
	 * Metodo remove o valor do parametro nomeFuncionario do tipo String do array funcionarios
	 * @param nomeFuncionario nome do funcionario
	 */
	public void removerFuncionario(String nomeFuncionario) {
		
		Funcionario funcionarioEncontrado = buscarFuncionarioPeloNome(nomeFuncionario);
		
		if(funcionarioEncontrado != null) {
			funcionarios.remove(funcionarioEncontrado);
		}
	}
	
	/**
	 * Metodo busca o valor da variável nome do tipo String no array clientes, se houver o mesmo
	 * valor passado no parametro nome no array, o mesmo retorna o nome buscado
	 * @param nome nome do funcionario
	 * @return funcionarioEncontrado retorna o nome do funcionario
	 */
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
	
	/**
	 * Metodo adiciona o valor do parametro cliente do tipo Cliente ao array clientes
	 * @param cliente cliente
	 */
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	/**
	 * Metodo remove o valor do parametro nomeCliente do tipo String do array clientes
	 * @param nomeCliente
	 */
	public void removerCliente(String nomeCliente) {
		
		Cliente clienteEncontrado = buscarClientePeloNome(nomeCliente);
		
		if(clienteEncontrado != null) {
			clientes.remove(clienteEncontrado);
		}
	}
	
	/**
	 * Metodo busca o valor da variável nome do tipo String no array clientes, se houver o mesmo
	 * valor passado no parametro nome no array, o mesmo retorna o nome buscado
	 * @param nome nome do cliente
	 * @return nome retorna nome do cliente
	 */
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
	
	/**
	 * Metodo adiciona um pedido ao array pedidos
	 * @param codigo
	 * @param f
	 * @param c
	 */
	public void adicionarPedido(int codigo, Funcionario f, Cliente c) {
		
		Pedido p = new Pedido(codigo, c,f);
		pedidos.add(p);
	}
	
	/**
	 * Metodo adiciona o valor da variável ip do tipo ItemPedido se houver um codigo do pedido
	 * @param codigoPedido codigo do pedido
	 * @param ip item pedido
	 */
	public void adicionarItemPedidoAoPedido(int codigoPedido, ItemPedido ip) {
		
		Pedido pedidoEncontrado = buscarPedidoPeloId(codigoPedido);
		
		if(pedidoEncontrado != null) {
			pedidoEncontrado.getListaItensPedido().add(ip);
		}
	}
	
	/**
	 * Metodo busca o valor da variável id do tipo inteiro
	 * @param id id do pedido
	 * @return pedidoEncontrado retorna pedido encontrado
	 */
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
	 * Metodo retorna a lista de funcionarios
	 * @return funcionarios retorna o(s) funcionario(s)
	 *  */
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	/**
	 * Metodo altera o valor de funcionarios passando o parametro funcionarios do tipo Funcionario
	 * @param funcionarios funcionario
	 */
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	/**
	 * Metodo retorna a lista de clientes contido no array clientes
	 * @return clientes retorna a lista de clientes
	 */
	public List<Cliente> getClientes() {
		return clientes;
	}

	/**
	 * Metodo altera o valor de clientes passando o valor do parametro clientes do tipo Cliente
	 * @param clientes clientes
	 */
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	/**
	 * Metodo retorna a lista de pedidos
	 * @return pedidos retorna lista de pedidos
	 */
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	/**
	 * Metodo altera o valor de pedidos passando o parametro pedidos do tipo Pedido
	 * @param pedidos pedidos
	 */
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}