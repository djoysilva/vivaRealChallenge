package br.com.vivareal.beans;

import java.io.Serializable;

public class Property implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String title;
	private double price;
	private String description;
	private String provinces[];
	private int x;
	private int y;
	private int beds;
	private int baths;
	private double squareMeters;
	
	public Property(int id, String title, double price, String description, String[] provinces, int x, int y, int beds,
			int baths, double squareMeters) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.description = description;
		this.provinces = provinces;
		this.x = x;
		this.y = y;
		this.beds = beds;
		this.baths = baths;
		this.squareMeters = squareMeters;
	}


	public Property() {
	}
	
	
	public String[] getProvinces() {
		return provinces;
	}


	public void setProvinces(String[] provinces) {
		this.provinces = provinces;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String descricao) {
		this.description = descricao;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getBeds() {
		return beds;
	}
	public void setBeds(int beds) {
		this.beds = beds;
	}
	public int getBaths() {
		return baths;
	}
	public void setBaths(int baths) {
		this.baths = baths;
	}
	public double getSquareMeters() {
		return squareMeters;
	}
	public void setSquareMeters(double squareMeters) {
		this.squareMeters = squareMeters;
	}
	
	public String getAll(){
		String msg = ("Id: " + id + "\nTitle: " + title + "\nPrice: " + price + "\nDescription: " + description + "\nLat.: " 
						+ x + "\nLong.: " + y + "\nBeds: " + beds + "\nBaths: " + baths + "\nSquareMeters: " + squareMeters);
		if(provinces[1]!= null){
			msg += "\nProvinces: " + provinces[0] + "and " + provinces[1];
		}else{
			msg += "\nProvinces: " + provinces[0];
		}
		return msg; 				
	}

}