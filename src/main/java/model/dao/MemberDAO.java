package model.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.pojo.Member_Bean;

public class MemberDAO implements MemberDAO_Interface {

	@Autowired
	private SessionFactory sessionFactory;

	public MemberDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Member_Bean> selectAllMembers() {
		Session session = sessionFactory.getCurrentSession();
		List<Member_Bean> memberList = session.createQuery("FROM Member_Bean").list();
		return memberList;
	}

	// @Transactional
	// public int count(char gender, Date startTime, Date endTime) {
	// Session session = sessionFactory.getCurrentSession();
	// String sql = "SELECT COUNT(*) FROM Member_Bean WHERE CM_Gender = :gender AND
	// CM_RegistDate BETWEEN :startTime AND :endTime";
	// TypedQuery<Integer> query = session.createQuery(sql);
	// query.setParameter("gender", gender);
	// query.setParameter("startTime", startTime);
	// query.setParameter("endTime", endTime);
	// System.out.println(query.getSingleResult().getClass().getName());
	// return query.getSingleResult();
	// }

	// 計算2016年會員成長圖
	@Transactional
	public Long count(char gender, String startTime, String endTime) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "SELECT COUNT(*) FROM Member_Bean WHERE CM_Gender = :gender AND CM_RegistDate BETWEEN :startTime AND :endTime";
		TypedQuery<Long> query = session.createQuery(sql);
		query.setParameter("gender", gender);
		query.setParameter("startTime", startTime);
		query.setParameter("endTime", endTime);
		return query.getSingleResult();
	}

	// 2016年所有產品銷售總量表
	@Transactional
	public Integer saleamount(int PDid) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "SELECT amount FROM OrderDetail_Bean WHERE fk_product_id = :PDid";
		TypedQuery<Integer> query = session.createQuery(sql);
		query.setParameter("PDid", PDid);
		return query.getSingleResult();
	}

	// 2016年營收曲線圖
	@Transactional
	public Integer income(String startTime, String endTime) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "SELECT total FROM OrderList_Bean WHERE orderDate BETWEEN :startTime AND :endTime";
		TypedQuery<Integer> query = session.createQuery(sql);
		query.setParameter("startTime", Date.valueOf(startTime));
		query.setParameter("endTime", Date.valueOf(endTime));
		return query.getSingleResult();
	}



}
