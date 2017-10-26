package model.pojo;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "orderform")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Order_Bean {
	int ordId;
	int cmId;
	int totalPrice;
	java.sql.Timestamp ordDate;
	String Ord_Destination;
	String buyerName;
	String buyerPhone;
	String buyerEMail;
	String buyerAddress;
	String receiverName;
	String receiverPhone;
	String receiverAddress;
	java.sql.Timestamp outDate;
	int ifOut;
	java.sql.Timestamp arriveDate;
	int ifArrive;
	int ifMember;
	List<OrderDetail_Bean> items = new ArrayList<OrderDetail_Bean>();

	public Order_Bean() {

	}

	public Order_Bean(int ordId, int cmId, int totalPrice, java.sql.Timestamp ordDate, String buyerName,
			String buyerPhone, String buyerEMail, String buyerAddress, String receiverName, String receiverPhone,
			String receiverAddress) {
		super();
		this.ordId = ordId;
		this.cmId = cmId;
		this.totalPrice = totalPrice;
		this.ordDate = new java.sql.Timestamp(ordDate.getTime());
		this.buyerName = buyerName;
		this.buyerPhone = buyerPhone;
		this.buyerEMail = buyerEMail;
		this.buyerAddress = buyerAddress;
		this.receiverName = receiverName;
		this.receiverPhone = receiverPhone;
		this.receiverAddress = receiverAddress;
	}

	public Order_Bean(int cmId, int totalPrice, java.sql.Timestamp ordDate, String ord_Destination, String buyerName,
			String buyerPhone, String buyerEMail, String buyerAddress, String receiverName, String receiverPhone,
			String receiverAddress, java.sql.Timestamp outDate, int ifOut, java.sql.Timestamp arriveDate, int ifArrive,
			int ifMember) {
		super();
		this.cmId = cmId;
		this.totalPrice = totalPrice;
		this.ordDate = ordDate;
		Ord_Destination = ord_Destination;
		this.buyerName = buyerName;
		this.buyerPhone = buyerPhone;
		this.buyerEMail = buyerEMail;
		this.buyerAddress = buyerAddress;
		this.receiverName = receiverName;
		this.receiverPhone = receiverPhone;
		this.receiverAddress = receiverAddress;
		this.outDate = outDate;
		this.ifOut = ifOut;
		this.arriveDate = arriveDate;
		this.ifArrive = ifArrive;
		this.ifMember = ifMember;
	}

	// public Order_Bean(String userId, int totalPrice, Date ordDate, String
	// buyerName, String buyerPhone,
	// String buyerEMail, String buyerAddress, String receiverName, String
	// receiverPhone, String receiverAddress,
	// Date outDate, int ifOut, Date arriveDate, int ifArrive, int ifMember) {
	// super();
	// this.userId = userId;
	// this.totalPrice = totalPrice;
	// this.ordDate = new java.sql.Date(ordDate.getTime());
	// this.buyerName = buyerName;
	// this.buyerPhone = buyerPhone;
	// this.buyerEMail = buyerEMail;
	// this.buyerAddress = buyerAddress;
	// this.receiverName = receiverName;
	// this.receiverPhone = receiverPhone;
	// this.receiverAddress = receiverAddress;
	// this.outDate = new java.sql.Date(outDate.getTime());
	// this.ifOut = ifOut;
	// this.arriveDate = new java.sql.Date(arriveDate.getTime());
	// this.ifArrive = ifArrive;
	// this.ifMember = ifMember;
	// }

	public Order_Bean(int cmId, int totalPrice, java.sql.Timestamp ordDate, String ord_Destination, String buyerName,
			String buyerPhone, String buyerEMail, String buyerAddress, String receiverName, String receiverPhone,
			String receiverAddress, java.sql.Timestamp outDate, int ifOut, java.sql.Timestamp arriveDate, int ifArrive,
			int ifMember, List<OrderDetail_Bean> items) {
		super();
		this.cmId = cmId;
		this.totalPrice = totalPrice;
		this.ordDate = ordDate;
		Ord_Destination = ord_Destination;
		this.buyerName = buyerName;
		this.buyerPhone = buyerPhone;
		this.buyerEMail = buyerEMail;
		this.buyerAddress = buyerAddress;
		this.receiverName = receiverName;
		this.receiverPhone = receiverPhone;
		this.receiverAddress = receiverAddress;
		this.outDate = outDate;
		this.ifOut = ifOut;
		this.arriveDate = arriveDate;
		this.ifArrive = ifArrive;
		this.ifMember = ifMember;
		this.items = items;
	}

	
	@Column(name = "Ord_ID")
	public int getOrdId() {
		return ordId;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CM_ID")
	public int getcmId() {
		return cmId;
	}

	public void setcmId(int cmId) {
		this.cmId = cmId;
	}

	@Column(name = "Ord_TotalPrice")
	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Column(name = "Ord_Date")
	public Date getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = new java.sql.Timestamp(ordDate.getTime());
	}

	@Column(name = "Ord_Destination")
	public String getOrd_Destination() {
		return Ord_Destination;
	}

	public void setOrd_Destination(String ord_Destination) {
		Ord_Destination = ord_Destination;
	}

	@Column(name = "Ord_BuyerName")
	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	@Column(name = "Ord_BuyerPhone")
	public String getBuyerPhone() {
		return buyerPhone;
	}

	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	@Column(name = "Ord_BuyerEMail")
	public String getBuyerEMail() {
		return buyerEMail;
	}

	public void setBuyerEMail(String buyerEMail) {
		this.buyerEMail = buyerEMail;
	}

	@Column(name = "Ord_BuyerAddress")
	public String getBuyerAddress() {
		return buyerAddress;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	@Column(name = "Ord_ReceiverName")
	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	@Column(name = "Ord_ReceiverPhone")
	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	@Column(name = "Ord_ReceiverAddress")
	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	@Column(name = "Ord_OutDate")
	public Date getOutDate() {
		return outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = new java.sql.Timestamp(outDate.getTime());
	}

	@Column(name = "Ord_IfOut")
	public int getIfOut() {
		return ifOut;
	}

	public void setIfOut(int ifOut) {
		this.ifOut = ifOut;
	}

	@Column(name = "Ord_ArriveDate")
	public Date getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(Date arriveDate) {
		this.arriveDate = new java.sql.Timestamp(arriveDate.getTime());
	}

	@Column(name = "Ord_IfArrive")
	public int getIfArrive() {
		return ifArrive;
	}

	public void setIfArrive(int ifArrive) {
		this.ifArrive = ifArrive;
	}

	@Column(name = "Ord_IfMember")
	public int getIfMember() {
		return ifMember;
	}

	public void setIfMember(int ifMember) {
		this.ifMember = ifMember;
	}

	@OneToMany(mappedBy = "order_bean", cascade = CascadeType.ALL)
	public List<OrderDetail_Bean> getItems() {
		return items;
	}

	public void setItems(List<OrderDetail_Bean> items) {
		this.items = items;
	}

}
