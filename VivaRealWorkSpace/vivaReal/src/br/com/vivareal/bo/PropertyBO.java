package br.com.vivareal.bo;

import br.com.vivareal.beans.Property;
import br.com.vivareal.dao.PropertyDAO;
import br.com.vivareal.exception.Excep;

public class PropertyBO {
	PropertyDAO dao = new PropertyDAO();
	
	public void create(Property property) throws Exception{
		if((property.getX() < 0 || property.getX() > 1400) || (property.getY() < 0 || property.getY() > 1000)){
			throw new Excep("The values of X and Y are incorrects"); 
		}
		if(property.getBeds()<1 || property.getBeds()>5){
			throw new Excep("The quantity of bedrooms is incorrect (min 1 and max 5)."); 
		}
		if(property.getBaths()<1 || property.getBaths()>4){
			throw new Excep("The quantity of bathrooms is incorrect (min 1 and max 4)."); 
		}
		if(property.getSquareMeters()<20 || property.getSquareMeters()>240){
			throw new Excep("Invalid SquareMeters (min 20m and max 240m)."); 
		}
		if(property.getPrice()<0){
			throw new Excep("Invalid price (min 0)."); 
		}
		dao.create(property);
	}
	
	public void read(){
		dao.read();
	}
	
	
	public Property search(int id) throws Exception{
		if(id<0){
			throw new Excep("invalid Id"); 
		}
		return dao.search(id);
	}
}
