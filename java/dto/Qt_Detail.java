package dto;

public class Qt_Detail {

	String period,projectname,quantity,unit_type,unit_price,amount,name,name_emp,position;

	public Qt_Detail(String period, String projectname, String quantity,
			String unit_type, String unit_price, String amount, String name,
			String name_emp, String position) {
		super();
		this.period = period;
		this.projectname = projectname;
		this.quantity = quantity;
		this.unit_type = unit_type;
		this.unit_price = unit_price;
		this.amount = amount;
		this.name = name;
		this.name_emp = name_emp;
		this.position = position;
	}

	
	
	
	public Qt_Detail() {
		// TODO Auto-generated constructor stub
	}




	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnit_type() {
		return unit_type;
	}

	public void setUnit_type(String unit_type) {
		this.unit_type = unit_type;
	}

	public String getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(String unit_price) {
		this.unit_price = unit_price;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_emp() {
		return name_emp;
	}

	public void setName_emp(String name_emp) {
		this.name_emp = name_emp;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

		
}
