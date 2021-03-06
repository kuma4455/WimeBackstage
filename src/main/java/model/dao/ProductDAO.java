package model.dao;

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
	
	@Transactional
	@Override
	public List<ProductBean> selectAllProducts(){
		Session session = sessionFactory.getCurrentSession();
					//select cat.name from DomesticCat cat
//		String hql = "SELECT p.id, p.productName, p.productNumber, p.price, "
//				+ " p.stockNumber FROM ProductBean p";
		
		List<ProductBean> productList = session.createQuery("FROM ProductBean").list();
		for(Object obj : productList) {
			System.out.println(obj.toString());
		}
		
		return productList;
	}
	@Transactional
	@Override
	public int deleteProductByKey(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		int result = 0;
		ProductBean pb = new ProductBean();
		pb.setId(id);
		session.delete(pb);
		session.flush();
		return ++result;
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

	

}
