package model.pojo;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="WB_ORDER_LIST")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class OrderList_Bean {
	
	private Set<OrderDetail_Bean> orderdetail_bean = new HashSet<>();
	
	private int ODid;
	private Timestamp orderDate;
	private int total;
	
	public OrderList_Bean() {
		super();
	}
	
	@OneToMany(mappedBy = "orderList_bean", cascade = CascadeType.ALL)
	public Set<OrderDetail_Bean> getOrderdetail_bean() {
		return orderdetail_bean;
	}


	public void setOrderdetail_bean(Set<OrderDetail_Bean> orderdetail_bean) {
		this.orderdetail_bean = orderdetail_bean;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getODid() {
		return ODid;
	}

	public void setODid(int oDid) {
		ODid = oDid;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	

}
