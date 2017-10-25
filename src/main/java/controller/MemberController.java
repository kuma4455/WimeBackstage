package controller;

import java.io.PrintWriter;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import model.dao.MemberDAO_Interface;
import model.pojo.Member_Bean;

@RestController
//@Controller
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
//		Date en = Date.valueOf("2017-10-01");
//		return dao.count('m', st, en);
//	}
	
	@RequestMapping("member")
	public Map<String, Long> restGetAllMember(String year){
		Map<String, Long> memberIncrease = new HashMap<>();
		String key = "";
		for(int i = 1; i < 13; i++) {
			String st = year + "-" + i +"-01";
			String en = year + "-" + (i+1) +"-01";
			switch(i) {
				case 1:
					key = "Jan";
					break;
				case 2:
					key = "Feb";
					break;
				case 3:
					key = "Mar";
					break;
				case 4:
					key = "Apr";
					break;
				case 5:
					key = "May";
					break;
				case 6:
					key = "Jun";
					break;
				case 7:
					key = "Jul";
					break;
				case 8:
					key = "Aug";
					break;
				case 9:
					key = "Sep";
					break;
				case 10:
					key = "Oct";
					break;
				case 11:
					key = "Nov";
					break;
				case 12:
					key = "Dec";
					break;
					
			}
			memberIncrease.put(key+"_m", dao.count('m', st, en));
			memberIncrease.put(key+"_f", dao.count('f', st, en));
		}
		return memberIncrease;
	}
	
	
//	@RequestMapping("member")
//	public List<Member_Bean> restGetAllMember(){
//		return dao.selectAllMembers();
//	}
	
	
//==================@Controller===================
//	
//	@RequestMapping("member")
//	public String member_Servlet(Model model){
//		
//		return "_02_member/memberReport";
//	}
//	
//	@RequestMapping("product")
//	public String product_Servlet(Model model){
//		return "_02_member/productReport";
//	}
	
//	@RequestMapping("member")
//	public String restGetAllMember(String year, Model model){
//		Map<String, Long> memberIncrease = new HashMap<>();
//		String key = "";
//		for(int i = 1; i < 13; i++) {
//			String st = year + "-" + i +"-01";
//			String en = year + "-" + (i+1) +"-01";
//			switch(i) {
//				case 1:
//					key = "Jan";
//					break;
//				case 2:
//					key = "Feb";
//					break;
//				case 3:
//					key = "Mar";
//					break;
//				case 4:
//					key = "Apr";
//					break;
//				case 5:
//					key = "May";
//					break;
//				case 6:
//					key = "Jun";
//					break;
//				case 7:
//					key = "Jul";
//					break;
//				case 8:
//					key = "Aug";
//					break;
//				case 9:
//					key = "Sep";
//					break;
//				case 10:
//					key = "Oct";
//					break;
//				case 11:
//					key = "Nov";
//					break;
//				case 12:
//					key = "Dec";
//					break;
//					
//			}
//			memberIncrease.put(key+"_m", dao.count('m', st, en));
//			memberIncrease.put(key+"_f", dao.count('f', st, en));
//			
//		}
//		return "_02_member/memberReport";
//	}
	
}
