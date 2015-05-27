package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="workBean")
@SessionScoped
public class WorkrightBean {

	
    WorkrightModel model  = new WorkrightModel();

	List<WorkrightModel> list = new ArrayList<WorkrightModel>();

	public void addWork(){
		getModel().setId(new Random().nextInt(100));
		getModel().setUpdate(new Date());
		getModel().setUpdate(new Date());
		
		this.list.add(getModel());
		this.model = new WorkrightModel();

	}
	
	
	
	public void delete(WorkrightModel o ){
		
		getList().remove(o);
		
	}
	
	
	
	
	
	public List<WorkrightModel> getList() {
		return list;
	}

	public void setList(List<WorkrightModel> list) {
		this.list = list;
	}
	
	
	public WorkrightModel getModel() {
		return model;
	}

	public void setModel(WorkrightModel model) {
		this.model = model;
	}

	
	
	
	
}
