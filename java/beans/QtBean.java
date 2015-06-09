	package beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import dto.*;

@ManagedBean(name = "qt")
@SessionScoped
public class QtBean implements Serializable {

	Qt_Domain qt = new Qt_Domain();

	public static List<Product_Domain> listProduct = new ArrayList<Product_Domain>();

	Product_Domain selectProduct = new Product_Domain();

	Map<String, Product_Domain> showSelect = new HashMap<String, Product_Domain>();

	int qty = 0;

	@PostConstruct
	public void init() {

		for (int i = 0; i < 5; i++) {

			Product_Domain p = new Product_Domain();
			p.setId("P00" + i);
			p.setName("Product " + i);
			p.setPrice(new Random().nextInt(100));
			p.setQty(new Random().nextInt(10));
			this.listProduct.add(p);

		}
	}

	public Map<String, Product_Domain> getShowSelect() {

		for (int i = 0; i < 5; i++) {

			Product_Domain p = new Product_Domain();
			p.setId("P00" + i);
			p.setName("Product " + i);
			p.setPrice(i);
			this.listProduct.add(p);

		}

		for (Product_Domain product_Domain : listProduct) {
			this.showSelect.put(product_Domain.getName(), product_Domain);
		}

		return showSelect;
	}

	public void setShowSelect(Map<String, Product_Domain> showSelect) {
		this.showSelect = showSelect;
	}

	public void addProduct() {

		int total = 0;
		for (Product_Domain product_Domain : listProduct) {

			total += product_Domain.getPrice() * product_Domain.getQty();

		}

		getQt().setTotal(total);
		getQt().setDate(new Date());
		getQt().setListPrdocut(getListProduct());
	}

	public void genDoc() throws IOException
	{
		
		
		
		
		
		
		
		String filename = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/")+"Simple-Quotation-Template.xls";
		
		String updateFileName= FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
		
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fis);
		
		HSSFSheet hssfSheet =  hssfWorkbook.getSheetAt(0);
		
		Cell cell = null;
		
		int i = 1 ;
		
		for ( Product_Domain domain : getQt().getListPrdocut()) {
			
			cell=hssfSheet.getRow(18+i).getCell(0);
			cell.setCellValue(domain.getName() + " x " + domain.getQty()  );	
			cell=hssfSheet.getRow(18+i).getCell(5);
			cell.setCellValue(domain.getPrice() * domain.getQty());
			getQt().setTotal(getQt().getTotal()+ ( domain.getQty() * domain.getPrice() ) );
			
			i++;
			
			
		}
		
		cell = hssfSheet.getRow(28).getCell(5
				);
		cell.setCellValue(getQt().getTotal());
		System.out.print("total pricc" + getQt().getTotal());
		
		fis.close();
		
		 FileOutputStream outFile =new FileOutputStream(new File(updateFileName+"update.xls"));
		 hssfWorkbook.write(outFile);
         outFile.close();
         
         FacesContext fc = FacesContext.getCurrentInstance();
         HttpServletResponse response = (HttpServletResponse) fc.getExternalContext().getResponse();
         response.reset();
         response.setContentType("application/vnd.ms-excel");
         response.setHeader("Content-Disposition", "attachment; filename=\"" + "update.xls" + "\"");
		
  
         
         File file = new File(updateFileName+"update.xls");
         
         ServletOutputStream outputStream = null; 
         
         try {
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] buff = new byte[1024] ;
			outputStream = response.getOutputStream();
			int x = 0 ;
			while((x= fileInputStream.read(buff)) != -1){
				outputStream.write(buff);
				outputStream.flush();
			}
	        fc.responseComplete();
		} catch (Exception e) {
			// TODO: handle exception
		}
         finally{
        	 outputStream.close();
         }
         
      ;
        
		
		
	}

	public void deleteProduct(Product_Domain domain) {
		this.getListProduct().remove(domain);
	}

	public Qt_Domain getQt() {
		return qt;
	}

	public void setQt(Qt_Domain qt) {
		this.qt = qt;
	}

	public List<Product_Domain> getListProduct() {

		return listProduct;
	}

	public void setListProduct(List<Product_Domain> listProduct) {
		this.listProduct = listProduct;
	}

	public Product_Domain getSelectProduct() {
		return selectProduct;
	}

	public void setSelectProduct(Product_Domain selectProduct) {
		this.selectProduct = selectProduct;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
