package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="position")
@RequestScoped
public class PositionBean {

	List<Position_Domain> domains = new ArrayList<Position_Domain>();

	public List<Position_Domain> getDomains() {
		
		for (int i = 0; i < 5; i++) {
			
			Position_Domain domain = new Position_Domain();
			domain.setName("Developer");
			domain.setDesc(". Developer คือ คนที่เข้าใจ UML, Architecture สามารถเขียนโปรแกรมได้ และ design ได้ด้วย");
			this.domains.add(domain);
			
		}
		
		
		return domains;
	}

	public void setDomains(List<Position_Domain> domains) {
		this.domains = domains;
	}
	
	
	
	
}
