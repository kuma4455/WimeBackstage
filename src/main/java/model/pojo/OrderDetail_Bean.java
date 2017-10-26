package model.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
@IdClass(complex_orderDetail.class)
public class OrderDetail_Bean {
	private Order_Bean order_bean;
	private Product_Bean product_bean;
	int ordId;
	int productID;
	String productName;
	int amount;
	double unitPrice;
	double subTotal;

	

	public OrderDetail_Bean( int productID, String productName, int amount, double unitPrice, double subTotal) {
		super();
		
		this.productID = productID;
		this.productName = productName;
		this.amount = amount;
		this.unitPrice = unitPrice;
		this.subTotal = subTotal;
	}

	public OrderDetail_Bean() {
		
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

	@Id
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_orderform_id", nullable=false)
	public Order_Bean getOrder_bean() {
		return order_bean;
	}

	public void setOrder_bean(Order_Bean order_bean) {
		this.order_bean = order_bean;
	}
	
	@Column(name = "Ord_ID")
	public int getOrdId() {
		return ordId;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}

	@Column(name = "PD_ID")
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}
	
	
	@Column(name = "PD_Name")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "subTotal")
	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}


	@Column(name = "OrdDetail_Quantity")
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Column(name = "unitPrice")
	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	
}