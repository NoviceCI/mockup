package beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

import org.primefaces.context.RequestContext;


@ManagedBean
public class PoBean  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -374873597521027507L;
	
	
	
	Map<String, Object> options ;
	


	public void openQtDeatilDialog(){
		options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("resizable", false);
		options.put("draggable", false);
		options.put("contentHeight",580);
		options.put("contentWidth", 1300);
		options.put("position", "center");
		RequestContext.getCurrentInstance().openDialog("/dialog/qtdetaildialog",options,null);
	}
	
	public void openQtDialog(){
		options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("resizable", false);
		options.put("draggable", false);
		options.put("contentHeight",350);
		options.put("contentWidth", 800);
		
		
		RequestContext.getCurrentInstance().openDialog("/dialog/qtdialog",options,null);
	}
	
	public void closeDialog(){
		RequestContext.getCurrentInstance().closeDialog(0);
		System.out.println("close dialog");
	}
	
	public void closeDialog2(){
		RequestContext.getCurrentInstance().closeDialog(0);
		System.out.println("close dialog");
	}
	
	
	
	
	
}
