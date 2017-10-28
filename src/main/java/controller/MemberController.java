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
// @Controller
@RequestMapping(value = { "_02_member/report", "report" })
public class MemberController {
	@Autowired
	private MemberDAO_Interface dao;

	// @RequestMapping("allMembers")
	// public List<Member_Bean> memberSelectAll_Servlet(){
	// return dao.selectAllMembers();
	// }
	// ==================@RestController===================
	// @RequestMapping("list")
	// public ModelAndView allReport_Servlet(){
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("reportList");
	// mav.addObject("message", "list");
	// return mav;
	// }

	// @RequestMapping("member")
	// public int restGetAllMember(){
	// Date st = Date.valueOf("2017-09-01");
	// Date en = Date.valueOf("2017-10-01");
	// return dao.count('m', st, en);
	// }

	// 讀取全部會員
	@RequestMapping("member")
	public Map<String, Long> restGetAllMember(int year) {
		Map<String, Long> memberIncrease = new HashMap<>();
		String key = "";
		for (int i = 1; i < 13; i++) {
			String st = year + "-" + i + "-01";
			String en = (i == 12) ? year + 1 + "-01-01" : year + "-" + (i + 1) + "-01";
			switch (i) {
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
			memberIncrease.put(key + "_m", dao.count('m', st, en));
			memberIncrease.put(key + "_f", dao.count('f', st, en));
		}
		return memberIncrease;
	}
	
	

	// 銷售數量
	@RequestMapping("amount")
	public Map<String, Integer> sale() {
		Map<String, Integer> saleAmount = new HashMap<>();
		int key = 0;
		for (int i = 1; i < 16; i++) {
			switch (i) {
			case 1:
				key = i;
				break;
			case 2:
				key = i;
				break;
			case 3:
				key = i;
				break;
			case 4:
				key = i;
				break;
			case 5:
				key = i;
				break;
			case 6:
				key = i;
				break;
			case 7:
				key = i;
				break;
			case 8:
				key = i;
				break;
			case 9:
				key = i;
				break;
			case 10:
				key = i;
				break;
			case 11:
				key = i;
				break;
			case 12:
				key = i;
				break;
			case 13:
				key = i;
				break;
			case 14:
				key = i;
				break;
			case 15:
				key = i;
				break;

			}
			saleAmount.put("product_" + key, dao.saleamount(i));
		}
		return saleAmount;
	}

	// 營收
	@RequestMapping("income")
	public Map<String, Integer > restIncome(int year) {
		Map<String, Integer > allIncome = new HashMap<>();
		String key = "";
		for (int i = 1; i < 13; i++) {
			String st = year + "-" + i + "-01";
			String en = (i == 12) ? year + 1 + "-01-01" : year + "-" + (i + 1) + "-01";
			switch (i) {
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
			allIncome.put(key + "_m", dao.income(st, en));
		}
		return allIncome;
	}

	// @RequestMapping("member")
	// public List<Member_Bean> restGetAllMember(){
	// return dao.selectAllMembers();
	// }

	// ==================@Controller===================
	//
	// @RequestMapping("member")
	// public String member_Servlet(Model model){
	//
	// return "_02_member/memberReport";
	// }
	//
	// @RequestMapping("product")
	// public String product_Servlet(Model model){
	// return "_02_member/productReport";
	// }

	// @RequestMapping("member")
	// public String restGetAllMember(String year, Model model){
	// Map<String, Long> memberIncrease = new HashMap<>();
	// String key = "";
	// for(int i = 1; i < 13; i++) {
	// String st = year + "-" + i +"-01";
	// String en = year + "-" + (i+1) +"-01";
	// switch(i) {
	// case 1:
	// key = "Jan";
	// break;
	// case 2:
	// key = "Feb";
	// break;
	// case 3:
	// key = "Mar";
	// break;
	// case 4:
	// key = "Apr";
	// break;
	// case 5:
	// key = "May";
	// break;
	// case 6:
	// key = "Jun";
	// break;
	// case 7:
	// key = "Jul";
	// break;
	// case 8:
	// key = "Aug";
	// break;
	// case 9:
	// key = "Sep";
	// break;
	// case 10:
	// key = "Oct";
	// break;
	// case 11:
	// key = "Nov";
	// break;
	// case 12:
	// key = "Dec";
	// break;
	//
	// }
	// memberIncrease.put(key+"_m", dao.count('m', st, en));
	// memberIncrease.put(key+"_f", dao.count('f', st, en));
	//
	// }
	// return "_02_member/memberReport";
	// }

}
