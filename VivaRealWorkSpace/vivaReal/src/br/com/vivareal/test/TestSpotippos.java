package br.com.vivareal.test;
import javax.swing.JOptionPane;

import br.com.vivareal.beans.Property;
import br.com.vivareal.dao.PropertyDAO;
import br.com.vivareal.exception.Excep;

public class TestSpotippos {
	public static String text(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	public static int integer(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	public static double real(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
		
	//Test to validate the creation of a property in the correct Spotippos
	
	public static void main(String[] args)throws Exception{
		PropertyDAO dao = new PropertyDAO();
		Property objProperty = new Property();
		
		try{
			objProperty.setX(integer("X: "));
			objProperty.setY(integer("Y: "));
			
			dao.create(objProperty);
		}catch(Exception e){
			throw new Excep("Error", e);
		}
	}
}	