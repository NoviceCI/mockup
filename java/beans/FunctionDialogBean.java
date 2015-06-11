package beans;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.context.RequestContext;

@ManagedBean(name = "dialogFunction")
@RequestScoped
public class FunctionDialogBean {

	
	
	
	
	
	
	public void openDialog() {

		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("resizable", false);
		options.put("contentHeight", 600);
		options.put("contentWidth", 1200);

		RequestContext.getCurrentInstance().openDialog(
				"/dialog/functiondialog", options, null);
		System.out.print("Open Function Dialog");
	}

}