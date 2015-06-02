package beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@ManagedBean   
@ViewScoped
public class TreeBean implements Serializable {

	private TreeNode root;
	

	@PostConstruct
	private void init() {

		root = new DefaultTreeNode("Function", null);

	TreeNode node0 = new DefaultTreeNode("Accounting ", root);

		TreeNode node01 = new DefaultTreeNode("Quotation ",node0);
		TreeNode node02 = new DefaultTreeNode("PurchaseOrder ",node0);
		TreeNode node03 = new DefaultTreeNode("Invoice ",node0);
		TreeNode node04 = new DefaultTreeNode("Report ",node0);

		node01.getChildren().add(new DefaultTreeNode("List"));
		node01.getChildren().add(new DefaultTreeNode("Create"));
		node01.getChildren().add(new DefaultTreeNode("Update"));

		node02.getChildren().add(new DefaultTreeNode("List"));
		node02.getChildren().add(new DefaultTreeNode("Create"));
		node02.getChildren().add(new DefaultTreeNode("Update"));
		
		node03.getChildren().add(new DefaultTreeNode("List"));
		node03.getChildren().add(new DefaultTreeNode("Create"));
		node03.getChildren().add(new DefaultTreeNode("Update"));
		
		node04.getChildren().add(new DefaultTreeNode("CreateReport"));
		node04.getChildren().add(new DefaultTreeNode("SeleteReport"));
		
	TreeNode node1 = new DefaultTreeNode("Admin ", root);

		TreeNode node10 = new DefaultTreeNode("PositionMangement ", node1);
		TreeNode node11 = new DefaultTreeNode("RoleMangement ", node1);
		TreeNode node12 = new DefaultTreeNode("UserMangement ", node1);
		TreeNode node13 = new DefaultTreeNode("EmployeeMangement ", node1);

		TreeNode node100 = new DefaultTreeNode("CreatePosition ", node10);
		TreeNode node101 = new DefaultTreeNode("UpdatePosition ", node10);

		TreeNode node110 = new DefaultTreeNode("CreateRole ", node11);
		TreeNode node111 = new DefaultTreeNode("UpdateRole ", node11);

		TreeNode node120 = new DefaultTreeNode("CreateUser ", node12);
		TreeNode node121 = new DefaultTreeNode("UpdateUser ", node12);

		TreeNode node130 = new DefaultTreeNode("CreateEmployee ", node13);
		TreeNode node131 = new DefaultTreeNode("UpdateEmployee ", node13);

	}

	

	public TreeNode getRoot() {
		return root;
	}

}
