package model.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

//複合主鍵
//1.把要複合的主鍵變成本class的屬性
//2.getter & setter
//3.建構子
//4.@Override hashCode()，equals()方法

public class complex_orderDetail implements Serializable{
	private Order_Bean order_bean;
	private Product_Bean product_bean;
	
	public complex_orderDetail() {
		super();
	}
	
	
	
	
	public Order_Bean getOrder_bean() {
		return order_bean;
	}




	public void setOrder_bean(Order_Bean order_bean) {
		this.order_bean = order_bean;
	}




	public Product_Bean getProduct_bean() {
		return product_bean;
	}




	public void setProduct_bean(Product_Bean product_bean) {
		this.product_bean = product_bean;
	}




	@Override
	public int hashCode() {
		final int PRIME = 31;  
        int result = 1;  
        result = PRIME * result + (order_bean == null ? 0 : order_bean.hashCode());  
        result = PRIME * result + (product_bean == null ? 0 : product_bean.hashCode());   
        return result; 
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;  
        if(obj == null) return false;  
        if(!(obj instanceof complex_orderDetail)) return false;  
        complex_orderDetail objKey = (complex_orderDetail)obj;  
        if(order_bean.equals(objKey.order_bean) &&  
        		product_bean.equals(objKey.product_bean)) {  
            return true;  
        }  
        return false;  
	}
	
	
}
