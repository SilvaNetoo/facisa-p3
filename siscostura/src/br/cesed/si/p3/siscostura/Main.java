package br.cesed.si.p3.siscostura;

import java.util.List;

import javax.swing.JOptionPane;

import br.cesed.si.p3.siscostura.enumerations.TipoServico;

public class Main {

	public static void main(String[] args) {
		
		String respostaStr = null;
		int resposta = 0;
		Loja loja = new Loja();
		
		do {
			
			respostaStr = JOptionPane.showInputDialog("Bem-vindo à loja SisCostura "
					+ "\n 1) Criar Cliente \n 2) Excluir Cliente \n 3) Listar Clientes "
					+ "\n 4) Criar Funcionário \n 5) Excluir Funcionário \n 6) Funcionários"
					+ "\n 7) Cadastrar Pedido \n 8) Listar Pedidos \n 9) Alterar Status do Pedido "
					+ "\n 10) Adicionar Item ao Pedido \n 11) Realizar Pagamento \n 12 sair \n"); 
			
			resposta = Integer.parseInt(respostaStr);
			
			switch (resposta) {

			case 1:

				//adicionar novo cliente - input dos dados
				String nome = JOptionPane.showInputDialog("Digite o nome do cliente");

				String cpfStr = JOptionPane.showInputDialog("Digite o cpf do cliente");
				long cpf = Long.parseLong(cpfStr);
			
				String codigoClienteStr = JOptionPane.showInputDialog("Digite o código do cliente");
				int codigoCliente = Integer.parseInt(codigoClienteStr);

				//adicionar novo cliente - cadastro do cliente
				Cliente novoCliente = new Cliente(nome, cpf, codigoCliente);
				loja.adicionarCliente(novoCliente);
				
				break;

			case 2:
				
				break;

			case 3:
				
				List<Cliente> clientes = loja.getClientes();
				
				String nomeDosClientesCadastrados = "";
				
				for (Cliente cliente : clientes) {
					nomeDosClientesCadastrados += "\n" + cliente.getNome();
				}
				
				JOptionPane.showMessageDialog(null, "Lista de Clientes: \n" + nomeDosClientesCadastrados);
				
				break;
				
			case 4:
				
				//adicionar novo funcionário - input dos dados
				nome = JOptionPane.showInputDialog("Digite o nome do cliente");

				cpfStr = JOptionPane.showInputDialog("Digite o cpf do cliente");
				cpf = Long.parseLong(cpfStr);
			
				String codigoFuncionarioStr = JOptionPane.showInputDialog("Digite o código do funcionário");
				int codigoFuncionario = Integer.parseInt(codigoFuncionarioStr);
				
				String salarioStr = JOptionPane.showInputDialog("Digite o salario do funcionário");
				double salario = Double.parseDouble(salarioStr);
				
				//adicionar novo funcionário
				Funcionario novoFuncionario = new Funcionario(nome,cpf,codigoFuncionario,salario);
				loja.adicionarFuncionario(novoFuncionario);
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				
				break;
				
			case 7:
				
				String idStr = JOptionPane.showInputDialog("Digite o id do pedido");
				int idPedido = Integer.parseInt(idStr);
				
				String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente do pedido");
				Cliente clienteEncontrado = loja.buscarClientePeloNome(nomeCliente);
				
				String nomeFuncionario = JOptionPane.showInputDialog("Digite o nome do funcionario");
				Funcionario funcionarioEncontrado = loja.buscarFuncionarioPeloNome(nomeFuncionario);

				loja.adicionarPedido(idPedido, funcionarioEncontrado, clienteEncontrado);
				
				break;
				
			case 8:
				
				List<Pedido> pedidos = loja.getPedidos();
				
				String listaPedidos = "";
				
				for (Pedido pedido : pedidos) {
					listaPedidos += "\n Pedido com Id " + pedido.getId() + " do cliente " + pedido.getCliente().getNome() + " com valor " + pedido.valorTotalPedido() + "\n";
				}
				
				JOptionPane.showMessageDialog(null, "Listagem de pedidos: \n " + listaPedidos);
				
				break;
				
			case 9:
				
				break;

			case 10:
				
				//Adicionar Item ao Pedido
				
				//encontrar o pedido pelo código
				
				
				String codigoPedidoStr = JOptionPane.showInputDialog("Digite o código do pedido");
				int codigoPedido = Integer.parseInt(codigoPedidoStr);
				
				Pedido pedidoEncontrado = loja.buscarPedidoPeloId(codigoPedido);
				
				if(pedidoEncontrado == null) {
					JOptionPane.showMessageDialog(null, "Pedido não encontrado!");
				} else {

					
					//uma vez que encontrei o pedido 
					
					String todosTipoServico = "";
					
					//listei todos os serviços existentes na Enum TipoServico (ou seja, se vc add mais um, ele vai listar)
					
					for (TipoServico ts: TipoServico.values()) {
						todosTipoServico += "\n produto" + ts.getCodigo() + " - " + ts.getDescricaoServico();
					}

					//pergunto ao usuário qual o código do produto que ele quer adicionar ao pedido 
					
					String codigoSelecionadoStr = JOptionPane.showInputDialog("selecione o produto que você quer pelo código \n " + todosTipoServico);
					int codigoSelecionado = Integer.parseInt(codigoSelecionadoStr);

					//agora que eu tenho código do pedido, eu recupero a Enum
					TipoServico tipoServicoEncontrado = null;
					for (TipoServico ts: TipoServico.values()) {
						
						if(ts.getCodigo() == codigoSelecionado) {
							tipoServicoEncontrado = ts;
							break;
						}
					}
					
					//pego a quantidade do item que selecionei anteriormente
					String quantidadeSelecionadaStr = JOptionPane.showInputDialog("digite a quantidade");
					int quantidadeSelecionada = Integer.parseInt(quantidadeSelecionadaStr);
					
					//agora criar o itemPedido
					ItemPedido ip = new ItemPedido(tipoServicoEncontrado, quantidadeSelecionada);
					loja.adicionarItemPedidoAoPedido(codigoPedido, ip);
				}
				
				break;

			case 11:
				
				break;
				
			case 12:

				JOptionPane.showMessageDialog(null, "Obrigado por usar SisCosturas");
				break;
				
			default:
				
				JOptionPane.showMessageDialog(null, "Opção inválida");
				
				break;
			}
			
		} while (resposta != 12);
		
	}
}
