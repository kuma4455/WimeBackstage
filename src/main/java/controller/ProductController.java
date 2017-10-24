package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import model.dao.IProductDAO;
import model.pojo.ProductBean;

@Controller
@RequestMapping({"product","_01_product/product"})
public class ProductController {
	@Autowired
	private IProductDAO productDAO;
		//_01_product/product.do/insertProduct]
	@RequestMapping(value = "insertProduct", method = RequestMethod.POST,
			produces="text/plain;charset=UTF-8")
	
	public String insertProduct(Model model, Integer productNumber,String productName,
			Integer stockNumber, String productDesc, double price, String imageName,
			String software, String softDesc, @RequestParam("productImage") final MultipartFile multiPart) throws SerialException, SQLException, IOException, ServletException {
		Clob ccc = new SerialClob(softDesc.toCharArray());
		InputStream is = multiPart.getInputStream();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] bbb = new byte[8192];
		int count = 0;
		while((count = is.read(bbb)) != -1) {
			baos.write(bbb,0,count);
		}
		Blob b = new SerialBlob(baos.toByteArray());
		ProductBean pb = new ProductBean(productNumber, productName, stockNumber,
				productDesc, price, imageName, software, ccc,b);
		productDAO.insertProduct(pb);
		model.addAttribute("product",pb);
		return "_01_product/result";
	}
}
