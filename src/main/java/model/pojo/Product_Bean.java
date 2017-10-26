package model.pojo;

import java.sql.Blob;
import java.sql.Clob;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product_Bean {
	private int number; // 產品料號
	private String name; // 產品名稱
	private int productID; // 產品編號
	private int stock; // 庫存數量
	private String desc; // 產品說明
	private int price; // 產品價格
	private String picture; // 產品圖片
	private String softWare; // 軟體下載
	private Clob softDesc; // 軟體說明
	private Blob image; // 產品圖片
	
	private Set<OrderDetail_Bean> orderDetails = new HashSet<>();//一個裡面有個多

	public Product_Bean() {

	}

	public Product_Bean(int number, String name, int productID, int stock, String desc, int price, String picture,
			String softWare, Clob softDesc) {
		super();
		this.number = number;
		this.name = name;
		this.productID = productID;
		this.stock = stock;
		this.desc = desc;
		this.price = price;
		this.picture = picture;
		this.softWare = softWare;
		this.softDesc = softDesc;
	}

	@OneToMany(mappedBy="product_bean", cascade=CascadeType.ALL)
	public Set<OrderDetail_Bean> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail_Bean> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	@Column(name="PD_Number")
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PD_ID",nullable=false)
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Column(name="PD_Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="PD_Stock")
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Column(name="PD_Desc")
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Column(name="PD_Price")
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Column(name="PD_Pic")
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Column(name="PD_Software")
	public String getSoftWare() {
		return softWare;
	}

	public void setSoftWare(String softWare) {
		this.softWare = softWare;
	}

	@Column(name="PD_SoftDesc")
	public Clob getSoftDesc() {
		return softDesc;
	}

	public void setSoftDesc(Clob softDesc) {
		this.softDesc = softDesc;
	}

	@Column(name="PD_Image")
	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}
	
}
