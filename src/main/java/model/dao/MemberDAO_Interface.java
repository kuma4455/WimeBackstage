package model.dao;

import java.sql.Date;
import java.util.List;

import model.pojo.Member_Bean;

public interface MemberDAO_Interface {
	public List<Member_Bean> selectAllMembers();
//	public int count(char gender, Date startTime, Date endTime);
	public Long count(char gender, String startTime, String endTime);
	public Integer  income(String startTime, String endTime);
	public Integer saleamount(int PDid);
}