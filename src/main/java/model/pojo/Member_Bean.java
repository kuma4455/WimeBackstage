package model.pojo;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "customer")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Member_Bean {

	private int id; // INT AUTO_INCREMENT NOT NULL /*PK,FK使用者ID*/
	private Timestamp registDate; // DATETIME NOT NULL DEFAULT NOW(),/*註冊日期*/
	private String password; // VARCHAR(32) NOT NULL, /*密碼*/
	private String name; // VARCHAR(30) NOT NULL, /*姓名*/
	private String mail; // VARCHAR(30) NOT NULL, /*e-mail*/
	private String phone; // VARCHAR(10), /*室內電話*/
	private String mobile; // VARCHAR(10), /*手機*/
	private String address; // VARCHAR(50), /*地址*/
	private Date birthday; // DATE, /*生日*/
	private String gender; // CHAR(1), /*性別*/
	private String verified; // CHAR(1) DEFAULT 'F', /*驗證*/

	public Member_Bean() {

	}

	// =======================getter & setter========================
	@Column(name="CM_Verified")
	public String getVerified() {
		return verified;
	}

	public void setVerified(String verified) {
		this.verified = verified;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CM_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="CM_RegistDate")
	public java.sql.Timestamp getRegistDate() {
		return registDate;
	}

	public void setRegistDate(java.sql.Timestamp registDate) {
		this.registDate = registDate;
	}

	@Column(name="CM_Password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="CM_Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="CM_Mail")
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name="CM_Phone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name="CM_Mobile")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name="CM_Address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="CM_BirthDay")
	public java.sql.Date getBirthday() {
		return birthday;
	}

	public void setBirthday(java.sql.Date birthday) {
		this.birthday = birthday;
	}

	@Column(name="CM_Gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
