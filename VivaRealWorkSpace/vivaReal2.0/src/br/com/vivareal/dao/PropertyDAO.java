package br.com.vivareal.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.vivareal.beans.Property;

/**
 * API to VivaReal challenge.
 * Creating and searching Properties
 * @author JoyceSilva
 * @version1.5
 * @since1.0
 * @see ../beans/Property.java
 * @see ../bo/PropertyBO.java
 * @see ../test/TestRectangle.java
 * @see ../test/TestSpotippos.java
 * */

public class PropertyDAO {
	private List<Property> propertyList = new ArrayList<Property>();
	
	
	/* Metod that <b>create</b> a new Property in propertyList
	 * @param property - An object the type Property
	 * @author Joyce Silva
	 * @see Property.java
	 */
	
	public void create(Property property){
		String provinces[] = new String[2];
		if((property.getX() >= 800 && property.getX() <= 1400) && (property.getY() >= 0 && property.getY() <= 500)){
			provinces[0] = "Nova";
			provinces[1] = null;
			System.out.println("Created property in Nova with success!");
		}
		if((property.getX() >=600 && property.getX() <= 800) && (property.getY() >= 0 && property.getY() <= 500)){
			provinces[0] = "Groola";
			provinces[1] = null;
			System.out.println("Created property in Groola with success!");
		}
		if((property.getX() >= 0 && property.getX() <= 600) && (property.getY() >= 0 && property.getY() <= 500)){
			provinces[0] = "Scavy";
			provinces[1] = null;
			System.out.println("Created property in Scavy with sucess!");
		}
		if((property.getX() >=1100 && property.getX() <= 1400) && (property.getY() >= 500 && property.getY() <= 1000)){
			provinces[0] = "Jaby";
			provinces[1] = null;
			System.out.println("Created property in Jaby with sucess!");
		}
		if((property.getX() >=400 && property.getX() <= 1100) && (property.getY() >= 500 && property.getY() <= 1000)){
			provinces[0] = "Ruja";
			System.out.println("Created property in Ruja with sucess!");
		}
		if((property.getX() >=0 && property.getX() <= 600) && (property.getY() >= 500 && property.getY() <= 1000)){
			if(provinces[0]== null){
				provinces[0] = "Gode";
			}else{
				provinces[1] = "Gode";
			}
			System.out.println("Created property in Gode with sucess!");
		}
		property.setProvinces(provinces);
		propertyList.add(property);
	}
	/* Metod that <b>read</b> the propertyList
	 * @author Joyce Silva
	 * @see Property.java
	 */
	public void read(){
		if(propertyList.isEmpty()){
			System.out.println("List empty");
		}else{
			for(Property newProperty : propertyList){
				System.out.println("\n----\n");
				System.out.println(newProperty.getAll());
			}
		}	
	}
	/* Metod that <b>return the list</b> the propertyList
	 * @author Joyce Silva
	 * @return propertyList - A list with objects of type Property;
	 * @see Property.java
	 */
	public List<Property> readList(){
		if(propertyList.isEmpty()){
			return null;
		}else{
			return propertyList;
		}	
	}
	
	/* Metod that <b>alter</b> a Property in propertyList
	 * @param property - An object of type Property
	 * @author Joyce Silva
	 * @see Property.java
	 */
	
	public void update(Property property) throws Exception{
		propertyList.remove(property.getId());
		propertyList.add(property);
	}
	
	/* Metod that <b>search</b> a Property in propertyList
	 * @param list - An list for objects of type Property
	 * @author Joyce Silva
	 * @see Property.java
	 */
	
	public Property search(int id){
		Property aux = new Property();
		for(Property newProperty : propertyList){
			if(newProperty.getId() == id){
				aux = newProperty;
			}
		}
		return aux;
	}
	

	/* Metod that <b>search</b> one or more Properties in propertyList
	 * @param list - An list for objects of type Property
	 * @author Joyce Silva
	 * @see Property.java
	 */
	
	public void rectangleSearch(int ax, int ay, int bx, int by){
		List<Property> listAux = new ArrayList<Property>();
		int i = 0;
		for(Property newProperty : propertyList){
			if((newProperty.getX()>=ax && newProperty.getX()<=bx) && (newProperty.getY()>=ay && newProperty.getY()<=by)){
				i++;
				listAux.add(newProperty);
			}			
		}		
		System.out.println("\nFoundProperties: " + i);
		if(i!= 0){
			System.out.println("\nProperties:\n");
			for(Property newProperty : listAux){
				System.out.println(newProperty.getAll());
				System.out.println("\n-----------------\n");
		}
		}
	}
}
