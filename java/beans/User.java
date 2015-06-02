package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "userBean")
@ViewScoped
public class User {

	private List<UserModel> list = new ArrayList<UserModel>();

	public List<UserModel> getList() {

		for (int i = 0; i < 100; i++) {

			UserModel model = new UserModel();

			model.setUsername("·´ÊÍº" + i);
			model.setPassword("·´ÊÍº" + i);
			model.setCreate(new Date());
			model.setUpdate(new Date());

			list.add(model);

		}

		return list;
	}

	public void setList(List<UserModel> list) {
		this.list = list;
	}

}
