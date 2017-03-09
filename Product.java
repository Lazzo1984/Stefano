package com.javatpoint.bean;

public class Product {
	private int Product_Id,Codice,Quantita;
	private String Name,Posizione,Descrizione;
	
	public Product() {
		super();
		/*this.Product_Id = product_Id;
		this.Codice = codice;
		this.Quantita = quantita;
		this.Name = name;
		this.Posizione = posizione;
		this.Descrizione = descrizione;
		*/
	}

	public int getProduct_Id() {
		return Product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.Product_Id = product_Id;
	}

	public int getCodice() {
		return Codice;
	}

	public void setCodice(int codice) {
		this.Codice = codice;
	}

	public int getQuantita() {
		return Quantita;
	}

	public void setQuantita(int quantita) {
		this.Quantita = quantita;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getPosizione() {
		return Posizione;
	}

	public void setPosizione(String posizione) {
		this.Posizione = posizione;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.Descrizione = descrizione;
	}
	
	
	

}
