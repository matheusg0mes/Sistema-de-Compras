package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Compra;
import entities.ComprarItem;
import entities.Produto;
import entities.Cliente;
import entities.enums.CompraStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = sc.nextLine();
		System.out.println("Digite o seu email");
		String email = sc.nextLine();
		System.out.println("Digite a data atual");
		Date data = sdf.parse(sc.next());
		Cliente c1 = new Cliente(nome,email,data);
		
		System.out.println("Digite o status");
		CompraStatus status = CompraStatus.valueOf(sc.next());
		
		Compra od = new Compra(new Date(), status,c1);

		System.out.println("Digite a quantidade de items");
		int quantidade = sc.nextInt();
		for(int i = 0 ; i < quantidade ; i++) {
			System.out.println("Entre com o pedido numero " +( i + 1));
			System.out.println("Digite o nome do produto");
			String name = sc.next();
			System.out.println("Digite o preço");
			Double preco = sc.nextDouble();
			System.out.println("Digite a quantidade");
			int quantidad = sc.nextInt();
			od.addItem(new ComprarItem(quantidad,preco,new Produto(name,preco)));
		}
		
		System.err.println("Sumario");
		System.out.println(od);
	}

}
