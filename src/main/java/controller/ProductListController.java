package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.dao.IProductDAO;
import model.pojo.ProductBean;

@RestController
@RequestMapping("productList")
public class ProductListController {
	@Autowired
	private IProductDAO productDAO;
	
	@RequestMapping("selectAllProducts")
	public List<ProductBean> selectAllProducts() {
		return productDAO.selectAllProducts();
	}
}
