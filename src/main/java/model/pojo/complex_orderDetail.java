package model.pojo;

import java.io.Serializable;

//複合主鍵
//1.把要複合的主鍵變成本class的屬性
//2.getter & setter
//3.建構子
//4.@Override hashCode()，equals()方法

public class complex_orderDetail implements Serializable{
	private OrderList_Bean orderList_bean;
	private Product_Bean product_bean;
	
	public complex_orderDetail() {
		super();
	}
	
	
	
	
	public OrderList_Bean getOrderList_bean() {
		return orderList_bean;
	}




	public void setOrderList_bean(OrderList_Bean orderList_bean) {
		this.orderList_bean = orderList_bean;
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
        result = PRIME * result + (orderList_bean == null ? 0 : orderList_bean.hashCode());  
        result = PRIME * result + (product_bean == null ? 0 : product_bean.hashCode());   
        return result; 
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;  
        if(obj == null) return false;  
        if(!(obj instanceof complex_orderDetail)) return false;  
        complex_orderDetail objKey = (complex_orderDetail)obj;  
        if(orderList_bean.equals(objKey.orderList_bean) &&  
        		product_bean.equals(objKey.product_bean)) {  
            return true;  
        }  
        return false;  
	}
	
	
}
