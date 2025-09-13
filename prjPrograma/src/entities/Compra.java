package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.CompraStatus;

public class Compra {
	
	 public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private CompraStatus status;
	
	private Cliente cli;
	List<ComprarItem> OrderItem = new ArrayList<>();

	public Compra(Date moment, CompraStatus status,Cliente cli) {
		super();
		this.moment = moment;
		this.status = status;
		this.cli = cli;
	}
	

	public Cliente getCli() {
		return cli;
	}


	public void setCli(Cliente cli) {
		this.cli = cli;
	}


	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public CompraStatus getStatus() {
		return status;
	}

	public void setStatus(CompraStatus status) {
		this.status = status;
	}

	public List<ComprarItem> getOrderItem() {
		return OrderItem;
	}

	
	public void addItem(ComprarItem item) {
		OrderItem.add(item);
	}
	
	public void addRemove(ComprarItem item) {
		OrderItem.remove(item);
	}

	public double total() {
		double sun = 0;
		for(ComprarItem it : OrderItem) {
			sun += it.subTotal();
		}
		return sun;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("momento da compra: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Status da compra: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cli + "\n");
		sb.append("itens da compra: ");
		for(ComprarItem it : OrderItem) {
			sb.append(it + "\n");
		}
		sb.append("Valor total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}
