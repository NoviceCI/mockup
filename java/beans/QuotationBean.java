package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.context.RequestContext;

import dto.Qt_Detail;
import dto.Qt_Model;

@ManagedBean(name = "qtBean")
@SessionScoped
public class QuotationBean {

	Qt_Model model = new Qt_Model();
	Qt_Detail qt_Detail = new Qt_Detail();

	
	
	public void addItem() {
		
		Map<String,Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        options.put("draggable", false);
        options.put("resizable", false);
        options.put("contentHeight", 400);
        options.put("contentWidth", 700);
		
		RequestContext.getCurrentInstance().openDialog("addProduct",options,null);
		

	}
	

	
	public void closeDialog() {
		RequestContext.getCurrentInstance().closeDialog(null);
	}
	
	public void addQuotationDetail(){
		
		
		RequestContext.getCurrentInstance().closeDialog(null);
		
	}
	
	
	
	
	public Qt_Detail getQt_Detail() {
		return qt_Detail;
	}




	public void setQt_Detail(Qt_Detail qt_Detail) {
		this.qt_Detail = qt_Detail;
	}




	public Qt_Model getModel() {
		return model;
	}


	public void setModel(Qt_Model model) {
		this.model = model;
	}


	

}
