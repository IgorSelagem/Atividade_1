package atv1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Clientes clientes = new Clientes();
		Estoque estoque = new Estoque();
		Fornecedores fornecedores = new Fornecedores();
		Produtos produtos = new Produtos();
		Transportadora transportadora = new Transportadora();
		Vendas vendas = new Vendas();
		Vendedores vendedores = new Vendedores();
		
		clientes.nomeCliente = "Mauro Lucas";
		clientes.telefone = "(51)59562761";
		LocalDate dataCompra = LocalDate.of(2020, 5, 24); 
		
		estoque.nomeProduto1 = "Nike";
		estoque.nomeProduto2 = "Adidas";
		estoque.nomeProduto3 = "Puma";
		
		fornecedores.nike = "produtos Nike";
		fornecedores.adidas = "produtos Adidas";
		fornecedores.puma = "produtos Puma";
		
		produtos.tenis = "5 (cinco) pares Air Max 90";
		produtos.camisas = "7 (sete) peças retrô";
		produtos.calças = "7 (sete) peças Jogger";
		
		LocalDate dataSaida = LocalDate.of(2020, 7, 06);
		LocalDate dataChegada = LocalDate.of(2020, 7, 16);
		transportadora.quantidadeTransporte = "5 aparelhos eletronicos";
		
		vendas.codProduto = "c38008a";
		vendas.nomeProdutoLoja = "realizada na loja matriz";
		LocalDate dataVenda = LocalDate.of(2021, 9, 02);
		
		vendedores.nomeVendedor = "Igor Mendes";
		vendedores.registro = "28040930";
		LocalDate dataAdmissao = LocalDate.of(2020, 11, 23);
		
		System.out.printf("O cliente %s, portador do telefone %s, fez sua ultima compra no dia: %s \n",clientes.nomeCliente, clientes.telefone, clientes.dataCompra);
		
		System.out.printf("Hoje recebemos os produtos das seguintes marcas, que são elas: %s,%s,%s.\n",estoque.nomeProduto1,estoque.nomeProduto2,estoque.nomeProduto3);
		
		System.out.printf("Nesta entrega, recebemos %s da Nike,%s da Adidas Inter e %s da Puma.\n", produtos.tenis,produtos.camisas, produtos.calças);
		
		System.out.printf("No dia %s, fiz o pedido de %s, com data de chegada até minha residencia %s.\n", transportadora.dataSaida, transportadora.quantidadeTransporte, transportadora.dataChegada);
		
		System.out.printf("%s fez a venda de um prduto %s cujo seu código é %s, no dia %s\n",clientes.nomeCliente, vendas.nomeProdutoLoja, vendas.codProduto, vendas.dataVenda);
		
		System.out.printf("O vendedor %s, do registro %s, foi admitido em %s\n", vendedores.nomeVendedor, vendedores.registro, vendedores.dataAdmissao);
	}

}
