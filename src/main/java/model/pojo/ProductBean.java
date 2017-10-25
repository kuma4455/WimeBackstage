package model.pojo;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "Product")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class ProductBean implements Serializable{

	private static final long serialVersionUID = 2087540557559134745L;
	private Integer id;
	private Integer productNumber;
	private String productName;
	private Integer stockNumber;
	private String productDesc;
	private double price;
	private String imageName;
	private String software;
	private Clob softDesc;
	private Blob productImage;
	
	public ProductBean() {}

	public ProductBean(Integer productNumber, String productName, Integer stockNumber, String productDesc, double price,
			String imageName, String software, Clob softDesc, Blob productImage) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.stockNumber = stockNumber;
		this.productDesc = productDesc;
		this.price = price;
		this.imageName = imageName;
		this.software = software;
		this.softDesc = softDesc;
		this.productImage = productImage;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PD_ID")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="PD_Number")
	public Integer getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(Integer productNumber) {
		this.productNumber = productNumber;
	}
	@Column(name="PD_Name")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Column(name="PD_Stock")
	public Integer getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(Integer stockNumber) {
		this.stockNumber = stockNumber;
	}
	@Column(name="PD_Desc")
	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	@Column(name="PD_Price")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Column(name="PD_Pic")
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	@Column(name="PD_Software")
	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}
	@Column(name="PD_SoftDesc")
	public Clob getSoftDesc() {
		return softDesc;
	}

	public void setSoftDesc(Clob softDesc) {
		this.softDesc = softDesc;
	}
	@Column(name="PD_Image")
	public Blob getProductImage() {
		return productImage;
	}
	
	public void setProductImage(Blob productImage) {
		this.productImage = productImage;
			
	}
	
}



//PD_Number        INT(3) NOT NULL,              /*產品數量*/        
//PD_Name          VARCHAR(30) NOT NULL,		    /*產品名稱*/
//PD_ID            INT AUTO_INCREMENT NOT NULL , /* PK FK 產品料號*/
//PD_Stock         INT(5) NOT NULL,		  	   /*庫存數量*/
//PD_Desc          VARCHAR(30) NOT NULL,		   /*產品料號*/
//PD_Price         DECIMAL(8,2) NOT NULL ,	   /*FK產品價格*/
//PD_Pic           VARCHAR(50) NOT NULL,   	   /*產品圖片*/
//PD_Software      VARCHAR(50),   	           /*QRcode軟體下載*/
//PD_softDesc      TEXT,		   	   	   		   /*軟體說明*/
//PD_Image BLOB,
//PRIMARY KEY(PD_ID)
//)ENGINE = INNODB CHARACTER SET UTF8 COLLATE utf8_general_ci;
