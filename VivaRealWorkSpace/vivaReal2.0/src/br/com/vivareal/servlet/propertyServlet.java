package br.com.vivareal.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.vivareal.beans.Property;
import br.com.vivareal.bo.PropertyBO;
import br.com.vivareal.dao.PropertyDAO;

@WebServlet("/propertyServlet")
public class propertyServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	PropertyBO bo = new PropertyBO();
	PropertyDAO dao = new PropertyDAO();
	List<Property> listProperty = new ArrayList<Property>();
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String action = req.getParameter("action");
		switch(action){
			case "create":	Property property = new Property();
							property.setId(Integer.parseInt(req.getParameter("id")));
							property.setTitle(req.getParameter("title"));
							property.setPrice(Double.parseDouble(req.getParameter("price")));
							property.setDescription(req.getParameter("description"));
							property.setX(Integer.parseInt(req.getParameter("latitude")));
							property.setY(Integer.parseInt(req.getParameter("longitude")));
							property.setBeds(Integer.parseInt(req.getParameter("beds")));
							property.setBaths(Integer.parseInt(req.getParameter("baths")));
							property.setSquareMeters(Double.parseDouble(req.getParameter("square")));
														
							try{
								bo.create(property);
								listProperty = bo.readList();
								req.setAttribute("success", "Your property was created with success in " + property.getProvince() + ".");
								req.getRequestDispatcher("createProperty.jsp").forward(req, resp);
													
							}catch(Exception e){
								e.printStackTrace();
							}
							
							break;
			case "alter":	Property property1 = new Property();
							property1.setId(Integer.parseInt(req.getParameter("id")));
							property1.setTitle(req.getParameter("title"));
							property1.setPrice(Double.parseDouble(req.getParameter("price")));
							property1.setDescription(req.getParameter("description"));
							property1.setX(Integer.parseInt(req.getParameter("latitude")));
							property1.setY(Integer.parseInt(req.getParameter("longitude")));
							property1.setBeds(Integer.parseInt(req.getParameter("beds")));
							property1.setBaths(Integer.parseInt(req.getParameter("baths")));
							property1.setSquareMeters(Double.parseDouble(req.getParameter("square")));
							try{
								bo.update(property1);
								listProperty = bo.readList();
								req.setAttribute("success", "This property was updated with success");
								req.setAttribute("keyList", listProperty);
								req.getRequestDispatcher("listProperty.jsp").forward(req, resp);
													
							}catch(Exception e){
								e.printStackTrace();
							}
				
							break;
			default: break;				
		}
	}
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		switch (action){
			case "list":
						try{
							listProperty = bo.readList();
							req.setAttribute("keyList", listProperty);
							req.getRequestDispatcher("listProperty.jsp").forward(req, resp);
						}catch(Exception e){
							e.printStackTrace();
						}
						break;
			
			case "alter":
						try{
						int id = Integer.parseInt(req.getParameter("id"));
						Property property = bo.search(id);	
						
						req.setAttribute("keyAlter", property);
						req.getRequestDispatcher("alterProperty.jsp").forward(req, resp);						
						}catch(Exception e){
							e.printStackTrace();
						}
						break;
			
			case "search":
						try{
							List<Property> newList = new ArrayList<Property>();
							int xA = Integer.parseInt(req.getParameter("xA"));
							int yA = Integer.parseInt(req.getParameter("yA"));
							int xB = Integer.parseInt(req.getParameter("xB"));
							int yB = Integer.parseInt(req.getParameter("yB"));
							
							dao.rectangleSearch(xA, yA, xB, yB);
							req.setAttribute("keyList", newList);
							req.getRequestDispatcher("listProperty.jsp").forward(req, resp);						
							}catch(Exception e){
								e.printStackTrace();
						}
						break;
			
			default: break;			
		}
	}
}