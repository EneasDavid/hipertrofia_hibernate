package hipertrofia.teste;

import hipertrofia.br.com.modelo.*;
import hipertrofia.br.com.DAO.*;


public class teste {
	public static void main(String[] args) {
		hipertrofiaDAO  dao= new hipertrofiaDAO ();
		
		//Cartao cartao = new Cartao(0,123456,333,7777);
		//Pedido pedido = new Pedido(0,"blusa","PP",12,1);
		
		/*System.out.println(dao.cadastrarCartao(cartao));
		/*System.out.println(dao.cadastrarProduto(produto));
		System.out.println(dao.cadastrarPedido(pedido));
		
		System.out.println(dao.listarCartao());
		System.out.println(dao.listarProduto());
		System.out.println(dao.listarPedido());*/
		
		Produto produto = new Produto("blusa","PP",12);
		System.out.println(dao.cadastrarProduto(produto));
		System.out.println(dao.listarProduto());
		Produto produtoAtualizado = new Produto(1,"Blusa","PP",12);
		System.out.println(dao.atualizarProduto(produtoAtualizado));
		System.out.println(dao.listarProduto());
		System.out.println(dao.removerProduto(produto.getId()));
		System.out.println(dao.listarProduto());
	}

}
