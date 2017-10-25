package controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import model.dao.MemberDAO_Interface;
import model.pojo.Member_Bean;

@Controller
@RequestMapping(value= {"_02_member/report", "report"})
public class MemberController {
	@Autowired
	private MemberDAO_Interface dao;
	
//	@RequestMapping("allMembers")
//	public List<Member_Bean> memberSelectAll_Servlet(){
//		return dao.selectAllMembers();
//	}
//==================@RestController===================
//	@RequestMapping("list")
//	public ModelAndView allReport_Servlet(){
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("reportList");
//		mav.addObject("message", "list");
//		return mav;
//	}
	
//	@RequestMapping("member")
//	public int restGetAllMember(){
//		Date st = Date.valueOf("2017-09-01");
//		Date en = Date.valueOf("2017-09-30");
//		return dao.count('m', st, en);
//	}
	
	
//	@RequestMapping("member")
//	public List<Member_Bean> restGetAllMember(){
//		return dao.selectAllMembers();
//	}
	
	
//==================@Controller===================
	
	@RequestMapping("member")
	public String member_Servlet(Model model){
		
		return "_02_member/memberReport";
	}
	
	@RequestMapping("product")
	public String product_Servlet(Model model){
		return "_02_member/productReport";
	}
	
}
