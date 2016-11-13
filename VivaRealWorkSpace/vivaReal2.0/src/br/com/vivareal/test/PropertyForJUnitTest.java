package br.com.vivareal.test;

import java.io.Serializable;

//class just to make my experience with JUnit
public class PropertyForJUnitTest implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
	
	public PropertyForJUnitTest(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public PropertyForJUnitTest(){
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String search(int id){
		if(this.id == id){
			return "Nome: "+ this.name + "\nId: " + this.id;
		}
		return null;
	}
}
