package br.com.vivareal.test;

import javax.swing.JOptionPane;

import br.com.vivareal.beans.Property;
import br.com.vivareal.bo.PropertyBO;
import br.com.vivareal.exception.Excep;


public class TestCreateProperty {
	public static String text(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	public static int integer(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	public static double real(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	//Test to validate the creation and the bo of a property, input the values when you implement the objProperty.
	
	public static void main(String[] args)throws Exception{
		PropertyBO bo = new PropertyBO();
		Property objProperty = new Property();
				
		try{
			while(JOptionPane.showConfirmDialog(null, "Do you want create a new property?", "New Property", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0){
				objProperty = new Property();
				objProperty.setId(integer("Id: "));
				objProperty.setTitle(text("Title: "));
				objProperty.setPrice(real("Price: "));
				objProperty.setDescription(text("Description: "));
				objProperty.setX(integer("X: "));
				objProperty.setY(integer("Y: "));
				objProperty.setBeds(integer("Beds: "));
				objProperty.setBaths(integer("Baths: "));
				objProperty.setSquareMeters(real("Square Meters: "));	
				bo.create(objProperty);
			}
			
			bo.read();
		}catch(Exception e){
			throw new Excep("Error", e);
		}
	}	
}
