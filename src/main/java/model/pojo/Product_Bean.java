package model.pojo;

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
@Table(name="WB_PRODUCT")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Product_Bean {
	private Set<OrderDetail_Bean> orderDetail = new HashSet<>();
	private int PDid;
	private int price;
	private String pdname;
	
	public Product_Bean() {
		super();
	}
	
	@OneToMany(mappedBy="product_bean", cascade=CascadeType.ALL)
	public Set<OrderDetail_Bean> getOrderDetail() {
		return orderDetail;
	}



	public void setOrderDetail(Set<OrderDetail_Bean> orderDetail) {
		this.orderDetail = orderDetail;
	}

	public String getPdname() {
		return pdname;
	}

	public void setPdname(String pdname) {
		this.pdname = pdname;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getPDid() {
		return PDid;
	}

	public void setPDid(int pDid) {
		PDid = pDid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
