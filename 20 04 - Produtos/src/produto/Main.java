package produto;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Itens> litens = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int fim = 0;
		
		do {
			Itens item = new Itens();
			System.out.println("Entre com o item");
			System.out.println("Nome: ");
			item.nome = sc.next();
			System.out.println("Valor: ");
			item.valor = sc.nextDouble();
			System.out.println("Quantidade: ");
			item.quantidade = sc.nextInt();
			System.out.println("Descri��o: ");
			item.descricao = sc.next();
			System.out.println("Codigo de Barras: ");
			item.codBarras = sc.nextInt();
			litens.add(item);
			System.out.println("Deseja encerrar? [Sim = 1 / N�o = 0]");
			
		} while(fim != 1);
		
		
		sc.close();
	}

}
