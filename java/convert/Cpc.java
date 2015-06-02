package convert;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import dto.Product_Domain;
import beans.QtBean;

@FacesConverter("cpc")
public class Cpc implements Converter {
	

		
	List<Product_Domain> listProduct = new ArrayList<Product_Domain>();
		
		
		
	@PostConstruct
	public void init(){
		
		for (int i = 0; i < 5; i++) {

			Product_Domain p = new Product_Domain();
			p.setId("P00" + i);
			p.setName("Product " + i);
			p.setPrice(i);
			this.listProduct.add(p);

		}
		
		
	}
	
	
	
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {

		for (Product_Domain iterable_element : listProduct) {
			
			if (iterable_element.getId() == value) {
				return iterable_element;
			}
		
			
		}
		return null ;
	
	}
	
	
	

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		// TODO Auto-generated method stub
		return null;
	}

}
