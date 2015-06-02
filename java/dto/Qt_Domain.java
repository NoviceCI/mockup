package dto;

import java.util.Date;
import java.util.List;

public class Qt_Domain {

	String id ;
	Date date ;
	int total ;
	List<Product_Domain> listPrdocut ;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Product_Domain> getListPrdocut() {
		return listPrdocut;
	}
	public void setListPrdocut(List<Product_Domain> listPrdocut) {
		this.listPrdocut = listPrdocut;
	}
	
}
