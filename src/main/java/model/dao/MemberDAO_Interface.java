package model.dao;

import java.sql.Date;
import java.util.List;

import model.pojo.Member_Bean;

public interface MemberDAO_Interface {
	public List<Member_Bean> selectAllMembers();
	public int count(char gender, Date startTime, Date endTime);
}