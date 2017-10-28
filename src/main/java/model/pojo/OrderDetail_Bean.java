package model.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="WB_ORDER_DETAIL")
@IdClass(complex_orderDetail.class)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class OrderDetail_Bean {
	private OrderList_Bean orderList_bean;
	private Product_Bean product_bean;
	private int amount;
	private int totalprice;
	
	public OrderDetail_Bean() {
		super();
	}
	
	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	@Id
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_orderform_id", nullable=false)
	public OrderList_Bean getOrderList_bean() {
		return orderList_bean;
	}

	public void setOrderList_bean(OrderList_Bean orderList_bean) {
		this.orderList_bean = orderList_bean;
	}

	@Id
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_product_id", nullable=false)
	public Product_Bean getProduct_bean() {
		return product_bean;
	}

	public void setProduct_bean(Product_Bean product_bean) {
		this.product_bean = product_bean;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

	
	
	
}
