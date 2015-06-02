package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="role")
@RequestScoped
public class RoleBean {

	List<Role_Domain> domains = new ArrayList<Role_Domain>();

	public List<Role_Domain> getDomains() {
		
		
		for (int i = 0; i < 5; i++) {
			Role_Domain domain = new Role_Domain();
			
			domain.setName("Administrator");
			domain.setDescript("�˹觷���˹�ҷ��ԻҶ� �������� �������ҹ����ͧ�����ҷ�������� time consume �����ҹ�ԧ���ط�����͹�º�� �ٴ��������ҤҴ��ѧ��������-����ҹ�Ф�� ");
			this.domains.add(domain);		
		}
		
		return domains;
	}

	public void setDomains(List<Role_Domain> domains) {
		this.domains = domains;
	}
	
	
	
	
	
}
