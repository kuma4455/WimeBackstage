package model.dao;

import java.util.List;

import model.pojo.ProductBean;

public interface IProductDAO {

	Integer insertProduct(ProductBean pb);
	int deleteProductByKey(Integer id);
	int updateProduct(ProductBean pb);
	ProductBean selectProductByKey();
	List<ProductBean> selectAllProducts();

}