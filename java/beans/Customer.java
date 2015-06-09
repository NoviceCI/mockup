package beans;

public class Customer {
  
	String name , lastName, company,branch,address,t1,t2,fax,txid;
	
	
	
	

	public Customer(String name, String lastName, String company,
			String branch, String address, String t1, String t2, String fax,
			String txid) {

		this.name = name;
		this.lastName = lastName;
		this.company = company;
		this.branch = branch;
		this.address = address;
		this.t1 = t1;
		this.t2 = t2;
		this.fax = fax;
		this.txid = txid;
	}
	
	
	

	public Customer() {
	
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getTxid() {
		return txid;
	}

	public void setTxid(String txid) {
		this.txid = txid;
	}
	
}
