package beans;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import beans.HelperClass;

@ManagedBean
@SessionScoped
public class CustomerBean {

	
	List<Customer> customers = new ArrayList<Customer>();

	
	@PostConstruct
	public void init(){
		for (int i = 0; i < 20; i++) {
			customers.add(new Customer(HelperClass.genString(),HelperClass.genString(),HelperClass.genString(),HelperClass.genString(),HelperClass.genString()
					,HelperClass.genString(),HelperClass.generateRandom(10),HelperClass.generateRandom(10),HelperClass.generateRandom(10)));
		}
	}
	
	
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
	
	
	
}
