package executor;

import java.util.Scanner;

import app.Produto;

public class StartApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Vamos cadastar novo produto");
		System.out.println("Nome do Produto");
		produto.nome = sc.nextLine();
		
		System.out.println("Preço do Produto");
		produto.preco = sc.nextDouble();
		
		System.out.println("Quantidade do Produto");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println(produto.toString());
		
		System.out.println();
		System.out.println("Entre com a quntidade para ser adcionado ao estoque");
		int qtd = sc.nextInt();
		produto.addProduto(qtd);
		
		System.out.println();
		System.out.println("Atualizando produtos em estoque " + produto);
		
		System.out.println();
		System.out.println("Entre com a quntidade para serem  removidos do estoque");
		int remove = sc.nextInt();
		produto.removerProduto(remove);
		
		System.out.println();
		System.out.println("Atualizando produtos em estoque " + produto);
		
		
		sc.close();
	}

}
