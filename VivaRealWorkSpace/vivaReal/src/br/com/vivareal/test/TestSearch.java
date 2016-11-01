package br.com.vivareal.test;

import javax.swing.JOptionPane;

import br.com.vivareal.beans.Property;
import br.com.vivareal.bo.PropertyBO;
import br.com.vivareal.exception.Excep;

public class TestSearch{
	public static int integer(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	//Test to validate the Search of Property, input the values when you implement the objProperty and add in the list.
	
	public static void main(String[] args)throws Exception{
		PropertyBO bo = new PropertyBO();
		Property objProperty= new Property();
		Property aux= new Property();
		
		objProperty.setId(10);
		objProperty.setTitle("Imóvel código 1, com 3 quartos e 2 banheiros.");
		objProperty.setPrice(643.000);
		objProperty.setDescription("Laboris quis quis elit commodo eiusmod qui exercitation. In laborum fugiat quis minim occaecat id.");
		objProperty.setX(1257);
		objProperty.setY(928);
		objProperty.setBeds(3);
		objProperty.setBaths(2);
		objProperty.setSquareMeters(61);
		
		bo.create(objProperty);
		
		try{
			int id = integer("Id for search: ");
			aux = bo.search(id);
			if(aux.getId() != 0){
				System.out.println(aux.getAll());
			}else{
				System.out.println("Not found.");
			}
			
		}catch(Exception e){
			throw new Excep("Error", e);
		}
	}	
}
