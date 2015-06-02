package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name="work")
@SessionScoped
public class WorkRightBean {

	
	List<WorkRight_Domain> domains = new ArrayList<WorkRight_Domain>();
	
	public List<WorkRight_Domain> getDomains() {
		
		WorkRight_Domain domain1 = new WorkRight_Domain();
		domain1.setCode("Quatation 1");
		domain1.setName("Add , Update");

		WorkRight_Domain domain2 = new WorkRight_Domain();
		domain2.setCode("Quatation 2");
		domain2.setName("Read only");
		
		WorkRight_Domain domain3 = new WorkRight_Domain();
		domain3.setCode("PO");
		domain3.setName("Add,Update,Delete");
		
		List<WorkRight_Domain> ds = new ArrayList<WorkRight_Domain>();
		
		ds.add(domain3);
		ds.add(domain2);
		ds.add(domain1);		
		
		return ds; 
	}

	
	
	
	
	public void setDomains(List<WorkRight_Domain> domains) {
		this.domains = domains;
	}
	
}
