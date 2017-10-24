package model.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import model.pojo.ProductBean;

public class ProductDAO implements IProductDAO {
	private SessionFactory sessionFactory;

	public ProductDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	@Override
	public Integer insertProduct(ProductBean pb) {
		Session session = sessionFactory.getCurrentSession();
		Integer id = (Integer) session.save(pb);
		session.flush();
		return id;
	}

	@Override
	public int deleteProductByKey(Integer id) {

		return 0;
	}

	@Override
	public int updateProduct(ProductBean pb) {

		return 0;
	}


	@Override
	public ProductBean selectProductByKey() {

		ProductBean pb = new ProductBean();
		return pb;
	}


	@Override
	public List<ProductBean> selectAllProducts() {

		List<ProductBean> productList = new ArrayList<>();
		return productList;
	}
}
