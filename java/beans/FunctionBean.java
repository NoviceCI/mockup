package beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class FunctionBean {

	List<Function> functions = new ArrayList<Function>();

	@PostConstruct
	public void init() {
		for (int i = 0; i < 20; i++) {
			functions.add(new Function(HelperClass.genString(), HelperClass
					.genString()));
		}
	}

	public List<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}

}
