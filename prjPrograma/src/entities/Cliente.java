package entities;

import java.util.Date;

public class Cliente {

	private String name;
	private String email;
	private Date date;
	
	
	public Cliente(String name, String email, Date date) {
		super();
		this.name = name;
		this.email = email;
		this.date = date;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "client " + name + " " + email + " " + Compra.sdf.format(date)  ;
	}
	
	
	
}
