package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.dao.IProductDAO;
import model.pojo.ProductBean;

@Controller
@RequestMapping({"productList","_01_product/productList"})
public class ProductListController {
	@Autowired
	private IProductDAO productDAO;
	
	@RequestMapping(value = "selectAllProducts", method = RequestMethod.GET)
	public String selectAllProducts(Model model) {
		List<ProductBean> productList = productDAO.selectAllProducts();
		model.addAttribute("products_DPP" , productList);
		
		return "_01_product/productList";
	}
}
